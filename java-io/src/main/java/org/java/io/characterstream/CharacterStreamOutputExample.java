package org.java.io.characterstream;

import java.io.FileWriter;
import java.io.IOException;

public class CharacterStreamOutputExample
{
	public static void main(String[] args)
	{
		String data = "Hello, Character Stream! \uD83D\uDE09";
		try (FileWriter fw = new FileWriter("test.txt"))
		{
			fw.write(data);
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}
}
