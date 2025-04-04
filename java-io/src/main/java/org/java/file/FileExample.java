package org.java.file;

import java.io.File;
import java.io.IOException;

public class FileExample
{
	public static void main(String[] args)
	{
		File file = new File("newFile.txt");

		// Create a new file
		try
		{
			if (file.createNewFile())
			{
				System.out.println("File created: " + file.getName());
			}
			else
			{
				System.out.println("File already exists.");
			}
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}

		// Create a new file
		try
		{
			if (file.createNewFile())
			{
				System.out.println("File created: " + file.getName());
			}
			else
			{
				System.out.println("File already exists.");
			}
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}

		// Check if the file exists
		if (file.exists())
		{
			System.out.println("File exists.");
		}
		else
		{
			System.out.println("File does not exist.");
		}

		// Delete the file
		if (file.delete())
		{
			System.out.println("Deleted the file: " + file.getName());
		}
		else
		{
			System.out.println("Failed to delete the file.");
		}

		// Check if the file exists
		if (file.exists())
		{
			System.out.println("File exists.");
		}
		else
		{
			System.out.println("File does not exist.");
		}

		// Create a new file
		try
		{
			if (file.createNewFile())
			{
				System.out.println("File created: " + file.getName());
			}
			else
			{
				System.out.println("File already exists.");
			}
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}
}