package org.java.nio;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.util.Iterator;

public class SelectorExample
{
	public static void main(String[] args)
	{
		try (Selector selector = Selector.open();
		     ServerSocketChannel serverChannel = ServerSocketChannel.open())
		{

			serverChannel.bind(new InetSocketAddress(5000));
			serverChannel.configureBlocking(false);
			serverChannel.register(selector, SelectionKey.OP_ACCEPT);

			while (true)
			{
				selector.select();
				Iterator<SelectionKey> keys = selector.selectedKeys().iterator();
				while (keys.hasNext())
				{
					SelectionKey key = keys.next();
					keys.remove();

					if (key.isAcceptable())
					{
						SocketChannel client = serverChannel.accept();
						client.configureBlocking(false);
						client.register(selector, SelectionKey.OP_READ);
					}
					else if (key.isReadable())
					{
						SocketChannel client = (SocketChannel) key.channel();
						ByteBuffer buffer = ByteBuffer.allocate(256);
						int bytesRead = client.read(buffer);
						if (bytesRead == -1)
						{
							client.close();
						}
						else
						{
							buffer.flip();
							while (buffer.hasRemaining())
							{
								System.out.print((char) buffer.get());
							}
						}
					}
				}
			}
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}
}
