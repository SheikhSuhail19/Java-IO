package org.java.io.systemin;

public class DirectSystemIn
{
	public static void main(String[] args)
	{
		System.out.println("Enter a character:");
		try
		{
			int inputByte = System.in.read();
			System.out.println((char) inputByte);
			char inputChar = (char) inputByte;
			System.out.println("You entered: " + inputChar);
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
}
