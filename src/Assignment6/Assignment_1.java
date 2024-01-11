package Assignment6;

import java.util.Scanner;

public class Assignment_1 
{
	public static void main (String[] args)
	{
		/*
		 * Create an application that estimates the adult height of a female or male.  
		 * The program will ask the student’s name, the student’s mom height in inches, and 
		 * the student’s dad height in inches.
		 */
		
		//while (again.equalsIgnoreCase("yes"));
		
		String again = "yes";
		
		while (again.equalsIgnoreCase("yes"))
		{
			Scanner input = new Scanner(System.in);
			
			System.out.println("Input Name:");
			String name = input.next();
			
			System.out.println("Input Gender at Birth:");
			String gender = input.next();
			
			System.out.println("Input mother's height in inches:");
			int momHeight = input.nextInt();
			
			System.out.println("Input father's height in inches:");
			int dadHeight = input.nextInt();
			
			double height = 0;
			
			if (gender.equalsIgnoreCase("female") || gender.equalsIgnoreCase("girl") || gender.equalsIgnoreCase("F"))
			{
				/*
				 * Add the mother's height and the father's height in either inches 
				 * Subtract 5 inches for girls.
				 * Divide by two.
				 */
				
				height = (momHeight + dadHeight - 5.0)/2.0;
			}
			
			else if (gender.equalsIgnoreCase("male") || gender.equalsIgnoreCase("guy") || gender.equalsIgnoreCase("m"))
			{
				/*
				 * Add the mother's height and the father's height in either inches 
				 * Add 5 inches for boys.
				 * Divide by two.
				 */
				
				height = (momHeight + dadHeight + 5.0)/2.0;
			}
			else 
			{
				System.out.println("Sorry you inputted something wrong.");
			}
			
			System.out.println(name + ", your estimated height is " + height + " inches.");
			
			
			//mom: 5'2? = 62
			//dad: 5'9? =  69
			System.out.println("____________");
			System.out.println("Would you like to run again?");
			again = input.next();
		}
		
	}

}
