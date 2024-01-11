package Assignment5;

import java.util.Scanner;

public class Assignment_6 
{
	
	public static void main (String[] args)
	{
		/*
		 * Have the user enter how many hours they worked this past week and how much the get paid an
		 *  hour.  Recall over 40 hours is paid time and a half.
		 */
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the number of hours you worked in a week:");
		int hours = input.nextInt();
		
		System.out.println("Enter in your salary per hour:");
		int pay = input.nextInt();
		
		double overtime = hours - 40;
		double h1 = hours - overtime;
		
		if (h1 > 0)
		{
			System.out.println("Your pay for one week is $" + ((pay * h1) + ((pay * 1.5)* overtime)));
		}
		else
		{
		System.out.println("Your pay for one week is $" + (pay * hours));
		}
		
		
	}

}
