package Assignment8;

import java.util.Scanner;

public class Assignment3 
{
	public static void main (String[] args)
	{
		/*
		 * Write a program that asks the user for a non-negative integer and computes and prints the factorial of 
		 * that integer. You'll need a while loop to do most of the work—this is a lot like computing a sum, but 
		 * it's a product instead. And you'll need to think about what should happen if the user enters 0. 
		 */
		
		Scanner input = new Scanner(System.in);
		String again = "yes";
		
		while (again.equalsIgnoreCase("yes"))
		{
			System.out.println("Enter integer to factorial:");
			int num = input.nextInt();
			
			int total = 1;
			if (num >= 0)
			{
				for (int i = 0; i < num; i++)
				{
					total = total * (i + 1);
				}
				
				if (num == 0)
				{
					System.out.println("0! = 1");
				}
				else 
				{
					System.out.print(num + "! = 1");
					for (int i = 2; i <= num; i++)
					{
						System.out.print (" * " + i);
					}
					System.out.println(" = " + total);
				}
			}
			else
			{
				for (int i = 0; i > num; i--)
				{
					total = total * (i - 1);
				}
				
				System.out.print(num + "! = -1");
				for (int i = -2; i >= num; i--)
				{
					System.out.print (" * " + i);
				}
				System.out.println(" = " + total);
			}
			System.out.println("Run again?");
			again = input.next();
		}
		
		
		
		
		
	}

}
