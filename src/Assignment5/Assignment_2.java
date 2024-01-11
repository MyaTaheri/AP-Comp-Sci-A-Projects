package Assignment5;

import java.util.Scanner;

public class Assignment_2 
{
	public static void main (String[] args)
	{
		/*
		 * Have the user enter in how many total seconds they spend on homework a week.  
		 * The program will calculate and display how many hours, minutes and seconds you spend on 
		 * homework.
		 */
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("How many total seconds do you spend on homework?");
		int seconds = input.nextInt();
		
		int hours = seconds/3600;
		seconds  = seconds - (hours * 3600);
		
		int minutes = seconds/60;
		seconds  = seconds - (minutes * 60);
		
		System.out.println(hours + " hours " + minutes + " minutes " + seconds + " seconds was spent on homework");
	}
	

}
