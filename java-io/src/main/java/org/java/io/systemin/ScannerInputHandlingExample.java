package org.java.io.systemin;

import java.util.Scanner;

public class ScannerInputHandlingExample
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter your age: ");
		int age = scanner.nextInt();
		scanner.nextLine(); // Consume the leftover newline

		System.out.print("Enter your favorite quote: ");
		String quote = scanner.nextLine();

		System.out.println("Age: " + age);
		System.out.println("Favorite Quote: " + quote);

		scanner.close();
	}
}