package org.java.io.datastream;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataStreamInputExample
{
	public static void main(String[] args)
	{
		try (DataOutputStream dos = new DataOutputStream(new FileOutputStream("file.dat")))
		{
			dos.writeInt(123);
			dos.writeDouble(45.67);
			dos.writeBoolean(true);
			dos.writeUTF("Hello, Data Stream!");
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}
}