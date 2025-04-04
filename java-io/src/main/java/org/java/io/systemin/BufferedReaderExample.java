package org.java.io.systemin;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderExample
{
	public static void main(String[] args)
	{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter your name: ");
		try
		{
			String name = reader.readLine();
			System.out.println("Hello, " + name);
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}
}