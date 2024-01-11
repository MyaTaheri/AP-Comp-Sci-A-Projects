package CSC222;

import java.util.Scanner;

public class Module4_Assign 
{
	public static void main (String[] args)
	{
		/*
		 * Write a program that uses a recursive call to find the integer logb of a number. 
		 * Where logb returns the integer log of a number in a designated base. For example, 
		 * the integer base 10 log of 1234 is 3, and the integer base 2 log of 1234 is 10. 
		 * This is a relatively easy calculation. You simply repeatedly divide the number 
		 * by the base using integer division until the quotient is less than the base and 
		 * count the number of completed divisions.
		 */
		String repeat = "y";
		while (repeat.equalsIgnoreCase("y"))
		{
			Scanner scnr = new Scanner (System.in);
			System.out.println("Enter a positive int to find the integer log of");
			int num = scnr.nextInt();
			while (num <= 0)
			{
				System.out.println("Enter a POSITIVE int to find the integer log of");
				num = scnr.nextInt();
				
			}
			System.out.println("Enter a postive int base for the calculation");
			int base = scnr.nextInt();
			while (base <= 0)
			{
				System.out.println("Enter a POSITIVE int base for the calculation");
				base = scnr.nextInt();
				
			}
			
			System.out.println("The base " + base + " integer log of " + num + " is " + log(base,num));
			
			System.out.println("Would you like to enter another pair of numbers?");
			System.out.println("Please enter \"y\" for yes or \"n\" for no.");
			repeat = scnr.next();
			
			while ((!repeat.equalsIgnoreCase("n")) && (!repeat.equalsIgnoreCase("y")))
			{
				System.out.println("Please enter \"y\" for yes or \"n\" for no.");
				repeat = scnr.next();
			}
		}
		System.out.println("Goodbye!");
	}

	public static int log (int base, int num)
	{
		if ((num < base) || (num == 1))
		{
			return 0;
		}
		else if (base == 1)
		{
			return 1;
		}
		else
		{
			return log (base, num / base) + 1;
		}	
		
		
	}

}
