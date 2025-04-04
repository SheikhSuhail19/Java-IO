package org.java.io.characterstream;

import java.io.FileReader;
import java.io.IOException;

public class CharacterStreamInputExample
{
	public static void main(String[] args)
	{
		try (FileReader fr = new FileReader("test.txt"))
		{
			int data;
			while ((data = fr.read()) != -1)
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

