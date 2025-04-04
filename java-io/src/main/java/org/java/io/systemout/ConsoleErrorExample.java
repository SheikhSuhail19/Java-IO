package org.java.io.systemout;

public class ConsoleErrorExample
{
	public static void main(String[] args)
	{
		System.err.print("This is an ");
		System.err.println("error message");
		System.err.println("This is an error message");
		System.err.printf("Error: %s%n", "Something went wrong");
	}
}
