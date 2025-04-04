package org.java.nio2;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathExample
{
	public static void main(String[] args)
	{
		Path path = Paths.get("C:\\example\\file.txt");

		System.out.println("File Name: " + path.getFileName());
		System.out.println("Parent Directory: " + path.getParent());
		System.out.println("Absolute Path: " + path.toAbsolutePath());
	}
}