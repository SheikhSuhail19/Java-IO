package org.java.io.systemin;

import java.util.Scanner;

public class ScannerMultipleInputsExample
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);

		// Reading a String
		System.out.print("Enter your name: ");
		String name = scanner.nextLine();

		// Reading an int
		System.out.print("Enter your age: ");
		int age = scanner.nextInt();

		// Reading a double
		System.out.print("Enter your height in meters: ");
		double height = scanner.nextDouble();

		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
		System.out.println("Height: " + height + " meters");

		scanner.close();
	}
}