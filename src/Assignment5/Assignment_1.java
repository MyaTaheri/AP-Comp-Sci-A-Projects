package Assignment5;

import java.util.Scanner;

public class Assignment_1 
{
	public static void main (String[] args)
	{
		/*
		 * Have the user enter in how many hours, minutes, and seconds they spend on homework a week.  
		 * The program will calculate and display the total amount of seconds you spend on homework.
		 */
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("How many hours did you spend on homework?");
		int hours = input.nextInt();
		
		System.out.println("How many minutes did you spend on homework?");
		int minutes = input.nextInt();
		
		System.out.println("How many seconds did you spend on homework?");
		int seconds = input.nextInt();
		
		int total = (hours * 3600) + (minutes * 60) + seconds;
		
		System.out.println ("You spent a total of " + total + " seconds on homework");

		
		
		
	}
}
