package Assignment6;

import java.util.Scanner;

public class Assignment_2 {

	public static void main(String[] args) 
	{
		/*
		 * Create an application that finds the average of a student’s x amount of test scores. 
		 *  The program will ask the student for their first name and their x amount of equally 
		 *  weighted test scores. 
		 */
		Scanner input = new Scanner(System.in);
		
		System.out.println("Input Name:");
		String name = input.next();
		
		String again = "yes";
		String rerun = "yes";
		
		int testNumber = 0;
		int total = 0;
		while (rerun.equalsIgnoreCase("yes"))
		{
			while (again.equalsIgnoreCase("yes"))
			{
			testNumber++;	
			
			System.out.println(name + ", what did you get on test " + testNumber);
			total = total + input.nextInt();
			
			System.out.println("Enter in another test?");
			again = input.next();
			
			}
			
			double average = total/(testNumber * 1.0);
			System.out.println(name + ", your average score for these " + testNumber + " tests is " + average);
		
			
			System.out.println("_________");
			System.out.println("Would you like to run the program again?");
			rerun = input.next();
			
			if (rerun.equalsIgnoreCase("yes"))
			{
				again = "yes";
				testNumber = 0;
				total = 0;
			}
		}
	
		System.out.println("Have a nice day!");
	}

}
