package org.java.nio;

import java.nio.ByteBuffer;

public class ByteBufferExample
{
	public static void main(String[] args)
	{
		// Allocate a ByteBuffer with a capacity of 10 bytes
		ByteBuffer buffer = ByteBuffer.allocate(10);

		// Put data into the buffer
		for (int i = 0; i < buffer.capacity(); i++)
		{
			buffer.put((byte) i);
		}

		// Flip the buffer to prepare for reading
		buffer.flip();

		// Read data from the buffer
		while (buffer.hasRemaining())
		{
			System.out.print(buffer.get() + " ");
		}
	}
}