package Assignment8;

import java.util.Scanner;


public class Assignment1 
{
	public static void main (String[] args)
	{
		
		/*
		 * As activity directory at Meridian Resort, it is your job to suggest appropriate activities to guests based
		 * on the weather(on Google doc)
		 * Write a program that prompts the user for a temperature and their age, then prints out the activity appropriate 
		 * for that temperature and age. Allow the user to repeat the program.
		 */
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("Input name:");
		String name = input.next();
		
		System.out.println("Input temperature:");
		double temp = input.nextDouble();
		
		System.out.println("Input age:");
		int age = input.nextInt();
		
		String activity = "";
		String again = "yes";
		
		while (again.equalsIgnoreCase("yes"))
		{
			if (temp > 100)
			{
				activity = "shopping";
			}
			else if (100 >= temp && temp >= 80 && age < 30)
			{
				activity = "swimming";
			}
			else if (100 >= temp && temp >= 80 && age >= 30)
			{
				activity = "sunbathing";
			}
			else if (80 > temp && temp >= 60 && age >= 30)
			{
				activity = "tennis";
			}
			else if (80 > temp && temp >= 60 && age < 30)
			{
				activity = "soccer";
			}
			else if (60 > temp && temp >= 40 && age >= 30)
			{
				activity = "golf";
			}
			else if (60 > temp && temp >= 40 && age < 30)
			{
				activity = "football";
			}
			else if (40 > temp && temp > 0 && age >= 30)
			{
				activity = "skiing";
			}
			else if (40 > temp && temp > 0 && age < 30)
			{
				activity = "reading";
			}
			else if (0 > temp)
			{
				activity = "shopping";
			}
			
			System.out.println(name + " we suggest: " + activity);
			System.out.println("Run again?");
			again = input.next();
		}
		System.out.println("Have a nice day!");
	}
	

}
