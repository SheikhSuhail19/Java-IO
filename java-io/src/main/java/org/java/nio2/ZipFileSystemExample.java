package org.java.nio2;

import java.io.IOException;
import java.net.URI;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.Collections;

public class ZipFileSystemExample
{
	public static void main(String[] args)
	{
		// Path to the ZIP file
		Path zipPath = Paths.get("example.zip");

		// URI for the ZIP file system
		URI zipUri = URI.create("jar:" + zipPath.toUri());

		// Create a new file system for the ZIP file
		try (FileSystem zipFileSystem = FileSystems.newFileSystem(zipUri, Collections.emptyMap()))
		{
			// Access files within the ZIP file system
			Path internalFilePath = zipFileSystem.getPath("document.txt");
			Files.copy(internalFilePath, Paths.get("extracted_document.txt"), StandardCopyOption.REPLACE_EXISTING);
			System.out.println("File extracted successfully.");
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}
}