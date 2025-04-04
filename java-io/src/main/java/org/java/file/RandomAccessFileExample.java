package org.java.file;

import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileExample
{
	public static void main(String[] args)
	{
		try (RandomAccessFile raf = new RandomAccessFile("newFile.txt", "rw"))
		{
			// Write to the file
			raf.writeUTF("Hello, World!");

			// Move the file pointer to the beginning
			raf.seek(0);

			// Read from the file
			String message = raf.readUTF();
			System.out.println(message);
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}
}