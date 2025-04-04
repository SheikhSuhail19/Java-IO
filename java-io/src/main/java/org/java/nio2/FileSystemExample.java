package org.java.nio2;

import java.nio.file.FileSystem;
import java.nio.file.FileSystems;

public class FileSystemExample
{
	public static void main(String[] args)
	{
		// Obtain the default FileSystem
		FileSystem fileSystem = FileSystems.getDefault();

		// Display basic information about the file system
		System.out.println("File System Separator: " + fileSystem.getSeparator());
		System.out.println("Is File System Open: " + fileSystem.isOpen());
		System.out.println("Is File System Read-Only: " + fileSystem.isReadOnly());

		// Iterate over the root directories
		System.out.println("Root Directories:");
		for (var rootDirectory : fileSystem.getRootDirectories())
		{
			System.out.println(rootDirectory);
		}

		// Iterate over the file stores
		System.out.println("File Stores:");
		for (var fileStore : fileSystem.getFileStores())
		{
			System.out.println(fileStore);
		}
	}
}