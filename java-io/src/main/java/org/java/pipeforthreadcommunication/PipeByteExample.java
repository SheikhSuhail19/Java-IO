package org.java.pipeforthreadcommunication;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

public class PipeByteExample
{
	public static void main(String[] args)
	{
		try
		{
			final PipedOutputStream outputStream = new PipedOutputStream();
			final PipedInputStream inputStream = new PipedInputStream(outputStream);

			// Thread to write data to the outputStream
			Thread writerThread = new Thread(() -> {
				try
				{
					System.out.println("I'm the writer thread & I'm writing...");
					outputStream.write("Hello from writer thread! 😉".getBytes());
					outputStream.close();
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
			});

			// Thread to read data from the inputStream
			Thread readerThread = new Thread(() -> {
				try
				{
					System.out.println("I'm the reader thread & I'm reading...");
					int data;
					while ((data = inputStream.read()) != -1)
					{
						System.out.print((char) data);
					}
					inputStream.close();
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
			});

			writerThread.start();
			readerThread.start();

			writerThread.join();
			readerThread.join();

		}
		catch (IOException | InterruptedException e)
		{
			e.printStackTrace();
		}
	}
}

