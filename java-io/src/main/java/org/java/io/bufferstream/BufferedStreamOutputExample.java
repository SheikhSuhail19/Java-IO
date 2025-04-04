package org.java.io.bufferstream;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedStreamOutputExample
{
	public static void main(String[] args)
	{
		String data = "Hello, Buffered Stream! \uD83D\uDE09";
		try (BufferedWriter bw = new BufferedWriter(new FileWriter("trial.txt")))
		{
			bw.write(data);
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}
}