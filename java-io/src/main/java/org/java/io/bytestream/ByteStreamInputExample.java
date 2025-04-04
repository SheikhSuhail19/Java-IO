package org.java.io.bytestream;

import java.io.FileInputStream;
import java.io.IOException;

public class ByteStreamInputExample
{
	public static void main(String[] args)
	{
		try (FileInputStream fis = new FileInputStream("example.txt"))
		{
			int data;
			while ((data = fis.read()) != -1)
			{
				System.out.print((char) data);
			}
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}
}
