package Assignment9;

import java.util.Scanner;

public class Assignment1 
{
	/*
	 * Write a Java program that allows the user to enter in the age of two people dating. 
	 *  Following the half plus seven rule, the older person shall not date anyone younger 
	 *  than half their age plus seven years. The program will inform the user if they are or are not 
	 *  allowed to date.   
	 */
	public static void main (String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		String again = "yes";
		
		while (again.equalsIgnoreCase("yes"))
		{
		
			System.out.println("Enter in age of person 1:");
			int age1 = input.nextInt();
			
			System.out.println("Enter in age of person 2:");
			int age2 = input.nextInt();
			
			int older = Math.max(age1, age2);
			int younger = Math.min(age2, age1);
			
			if (younger < ((older/2.0) + 7))
			{
				System.out.println("People who are " + older + " years old and " + younger + " years old are NOT allowed to date.");
			}
			else
			{
				System.out.println("People who are " + older + " years old and " + younger + " years old are allowed to date.");
			}
			
			System.out.println("Repeat?");
			again = input.next();
		
		}
		
		System.out.println("Have a great day!");
	}

}
