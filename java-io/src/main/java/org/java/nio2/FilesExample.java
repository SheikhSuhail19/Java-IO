package org.java.nio2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FilesExample
{
	public static void main(String[] args)
	{
		Path path = Paths.get("C:\\Users\\skhursheed\\Desktop\\Java IO\\newNioFile.txt");

		try
		{
			// Create a new file
			Files.createFile(path);
			System.out.println("File created successfully.");

			// Write to the file
			String content = "Hello, Files!";
			Files.write(path, content.getBytes());
			System.out.println("Content written to file.");

			// Read from the file
			String readContent = Files.readString(path);
			System.out.println("File Content: " + readContent);

			// Delete the file
			Files.delete(path);
			System.out.println("File deleted successfully.");

			// Create a new file
			Files.createFile(path);
			System.out.println("File created successfully.");

			// Write to the file
			content = "Hello, Files!";
			Files.write(path, content.getBytes());
			System.out.println("Content written to file.");

			// Read from the file
			readContent = Files.readString(path);
			System.out.println("File Content: " + readContent);
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}
}
