package org.java.io.systemout;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class ModifyingStandardStreams
{
	public static void main(String[] args) throws FileNotFoundException
	{
		System.out.println("This is written to the console");
		PrintStream fileOut = new PrintStream("output.txt");
		System.setOut(fileOut);
		System.out.println("This is written to the file");
	}
}
