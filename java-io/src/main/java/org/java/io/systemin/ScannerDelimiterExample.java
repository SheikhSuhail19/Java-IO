package org.java.io.systemin;

import java.util.Scanner;

public class ScannerDelimiterExample
{
	public static void main(String[] args)
	{
		String input = "apple,banana,orange";
		Scanner scanner = new Scanner(input);
		scanner.useDelimiter(",");

		while (scanner.hasNext())
		{
			System.out.println(scanner.next());
		}

		scanner.close();
	}
}