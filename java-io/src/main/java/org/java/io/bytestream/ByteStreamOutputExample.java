package org.java.io.bytestream;

import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamOutputExample
{
	public static void main(String[] args)
	{
		String data = "Hello, Byte Stream! \uD83D\uDE09";
		try (FileOutputStream fos = new FileOutputStream("example.txt"))
		{
			fos.write(data.getBytes());
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}
}