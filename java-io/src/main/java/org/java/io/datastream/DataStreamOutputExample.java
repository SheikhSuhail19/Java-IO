package org.java.io.datastream;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class DataStreamOutputExample
{
	public static void main(String[] args)
	{
		try (DataInputStream dis = new DataInputStream(new FileInputStream("file.dat")))
		{
			int intValue = dis.readInt();
			double doubleValue = dis.readDouble();
			boolean booleanValue = dis.readBoolean();
			String utfValue = dis.readUTF();
			System.out.println("Integer: " + intValue);
			System.out.println("Double: " + doubleValue);
			System.out.println("Boolean: " + booleanValue);
			System.out.println("String: " + utfValue);
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}
}