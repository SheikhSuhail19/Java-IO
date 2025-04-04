package org.java.pipeforthreadcommunication;

import java.io.IOException;
import java.io.PipedReader;
import java.io.PipedWriter;

public class PipeCharacterExample
{
	public static void main(String[] args)
	{
		try
		{
			final PipedWriter writer = new PipedWriter();
			final PipedReader reader = new PipedReader(writer);

			// Thread to write data to the writer
			Thread writerThread = new Thread(() -> {
				try
				{
					System.out.println("I'm the writer thread & I'm writing...");
					writer.write("Hello from writer thread! 😉");
					writer.close();
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
			});

			// Thread to read data from the reader
			Thread readerThread = new Thread(() -> {
				try
				{
					System.out.println("I'm the reader thread & I'm reading...");
					int data;
					while ((data = reader.read()) != -1)
					{
						System.out.print((char) data);
					}
					reader.close();
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

