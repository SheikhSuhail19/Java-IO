package org.java.nio;

import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class FileChannelExample
{
	public static void main(String[] args)
	{
		try (RandomAccessFile file = new RandomAccessFile("nioFile.txt", "rw");
		     FileChannel channel = file.getChannel())
		{

			// Write data to the file
			String data = "Hello, FileChannel!";
			ByteBuffer buffer = ByteBuffer.allocate(1024);
			buffer.put(data.getBytes());
			buffer.flip();
			channel.write(buffer);

			// Read data from the file
			buffer.clear();
			channel.position(0);
			channel.read(buffer);
			buffer.flip();
			while (buffer.hasRemaining())
			{
				System.out.print((char) buffer.get());
			}
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
}
