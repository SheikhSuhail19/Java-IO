package org.java.io.systemout;

public class ConsoleOutputExample
{
	public static void main(String[] args)
	{
		System.out.print("Hello, ");        // Outputs "Hello, " without a newline
		System.out.println("World!");       // Outputs "World!" followed by a newline
		System.out.printf("Value: %.2f%n", 123.456); // Outputs "Value: 123.46" with formatting

		System.out.flush(); // Flushes the output stream
		System.out.println(System.out.checkError()); // Checks for errors
	}
}