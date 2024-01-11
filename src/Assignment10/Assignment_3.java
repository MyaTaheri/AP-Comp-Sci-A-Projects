package Assignment10;

import java.util.Scanner;


public class Assignment_3 
{
	public static void main (String[] args)
	{
		/*
		 * Create an application that replicates the multiplication table. 
		 *  Ask the user to enter in the biggest number of the multiplication table.  
		 *  The print out the table with rows and columns.s
		 */
		
		Scanner input = new Scanner(System.in); 
		System.out.println("Enter the Largest Int Number on the Multiplication Table:");
		int number = input.nextInt();
		
		int counter = 1;
		int j = 1;
		for (int i = 1; i <= number; i++)
		{
			System.out.print("\t" + i);
		}
		
		System.out.print("\n");
		while (j <= number)
		{
			System.out.print (j + "\t");
			
			for (int i = 1; i <= number; i++)
			{
				System.out.print(j * counter + "\t");
				counter++;
			}
			counter = 1;
			j++;
			System.out.print("\n");

		}
	}
}
