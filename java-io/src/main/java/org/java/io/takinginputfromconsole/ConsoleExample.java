package org.java.io.takinginputfromconsole;

import java.io.Console;

public class ConsoleExample
{
	public static void main(String[] args)
	{
		Console console = System.console();
		if (console != null)
		{
			System.out.println("Enter your name:");
			String name = console.readLine();
			System.out.println("Hello, " + name);
		}
		else
		{
			System.out.println("No console available");
		}
	}
}