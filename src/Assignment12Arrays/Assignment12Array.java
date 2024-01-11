package Assignment12Arrays;

import java.util.Scanner;

public class Assignment12Array 
{
	public void gymanstScore()
	{
		/*
		 * Have the user enter in 5 gymnast scores, 0.0 to 10.0, and store them in an array.  
		 * The gymnast’s scores will exclude the highest and lowest scores, and average the other
		 *  3 scores.
		 */
		
		Scanner kb = new Scanner (System.in);
		double[] arr = new double [5];
		for (int i = 0; i < 5; i++)
		{
			System.out.println("Enter Gymnast Score (0.0 - 10.0): ");
			arr[i] = kb.nextDouble();
		}
		double min = arr[0];
		double max = arr[0];
		
		for (int j = 0; j < arr.length; j++)
		{
			if (arr[j] < min)
			{
				min = arr[j];
			}
			
			if (arr[j] > max)
			{
				max = arr[j];
			}
		}
		
		double average = 0;
		
		for (int k = 0; k < arr.length; k++)
		{
			average = average + arr[k];
		}
		average = average - max - min;
		average = average / (arr.length-2);
		
		System.out.println("_______");
		System.out.println("Average Score: " + average);
	}
	public void quizAverage()
	{
		/*
		 * Have the user enter in x amount of integer quiz scores and store them in an array.
		 *   Drop the lowest and find the average of the quiz scores.
				Sample:
				How many quizzes did you take?
				4
				What did you get on quiz 1?
				70
				What did you get on quiz 2?
				80
				What did you get on quiz 3?
				90
				What did you get on quiz 4?
				85
				With your 70 dropped, your quiz average is 85.

		 */
		
		Scanner kb = new Scanner (System.in);
		System.out.println("Enter how many quizes taken:");
		int[] arr = new int[kb.nextInt()];
		
		for (int i = 0; i < arr.length; i++)
		{
			System.out.println("What did you get on quiz " + (i+1));
			arr [i] = kb.nextInt();
		}
		
		int min = arr[0];
		
		for (int k = 1; k < arr.length; k++)
		{
			if (arr[k] < min)
			{
				min = arr[k];
			}
		}
		
		int average = 0;
		
		for (int j = 0; j < arr.length; j++)
		{
			average = average + arr [j];
		}
		
		average = average - min;
		average = (int)(average/(arr.length - 1));
		
		System.out.println("With your " + min + " dropped, your quiz average is " + average);
		
	}
	public void coinFlip()
	{
		/*
		 * Ask the user how many times a coin will be flipping. Store the results in a boolean array, 
		 * true for heads and false for tails.  Have the computer flip the coin and count how many 
		 * times the user flipped a coin getting three of the same sides in a row.
			Sample:
			How many times will you be flipping a coin?
			10
			You flipped:
			Heads Heads Tails Tails Tails Heads Heads Heads Tails Tails.
			You had 2 three streaks.
		 */
		
		Scanner kb = new Scanner (System.in);
		System.out.println("Enter times a coin will be flipped:");
		boolean[] arr = new boolean[kb.nextInt()];
		
		int streakCounter = 0;
		
		for (int i = 0; i < arr.length; i++)
		{
			double random = Math.random();
			
			if (random >= 0.5)
			{
				arr[i] = true;
			}
			else
			{
				arr[i] = false;
			}
		}
		
		System.out.println("You flipped: ");
		for (int j = 0; j < arr.length; j++)
		{
			if (arr[j] == true)
			{
				System.out.print("Heads ");
			}
			else
			{
				System.out.print("Tails ");
			}
		}
		
		for (int k = 0; k < arr.length - 2; k++)
		{
			if (arr[k] == arr[k+1] && arr[k] == arr[k+2])
			{
				streakCounter++;
			}
		}
		System.out.println("");
		System.out.println("You had a " + streakCounter + " three Streek");
		
	}
	public void pearApple ()
	{
		/*
		 * In a method named pearApple, have the user type in size of a String array.
		 * Then ask the user to type in single words to fill the array.  Print out the array.
		 * Every place the word apple, not case sensitive,  appears, change it to the word 
		 * pear. Print out the array again and print out the number of times the word dinosaur appears.
		 */
		Scanner kb = new Scanner (System.in);
		System.out.println("Enter the size of the array: ");
		String[] arr = new String [kb.nextInt()];
		
		int dinoCounter = 0;
		
		for (int i = 0; i < arr.length; i++)
		{
			System.out.println("Enter a word:");
			arr[i] = kb.next();	
		}
		
		for (int k = 0; k < arr.length; k++)
		{
			if(arr[k].equalsIgnoreCase("APPLE"))
			{
				arr[k] = "pear";
			}
			
			if (arr[k].equalsIgnoreCase("DINOSAUR"))
			{
				dinoCounter++;
			}
		}
		
		System.out.println("______________");
		
		for (int j = 0; j < arr.length; j++)
		{
			System.out.println(arr[j]);
		}
		
		System.out.println("Dino Counter: " + dinoCounter);
		
	}
	public void doubleMinMax()
	{
		/*
		 * In a method named doubleMinMax, have the user type in the size of a double array.  
		 * Then fill the array with random numbers between, and including, 2 and 3.  Print out 
		 * the array and the print out the index of the minimum and maximum values of the array.
		 */
		Scanner kb = new Scanner (System.in);
		System.out.println("Enter the size of the array: ");
		double[] arr = new double [kb.nextInt()];
		for (int i = 0; i < arr.length; i++)
		{
			arr[i]=(Math.random() + 2);
			System.out.println(arr[i]);
		}
		
		double min = arr[0];
		double max = arr[0];
		
		for (int k = 1; k < arr.length; k++)
		{
			if (arr[k] < min)
			{
				min = arr[k];
			}
			if (arr[k] > max)
			{
				max = arr[k];
			}
		}
		
		System.out.println("~~~~~~~~~~");
		System.out.println("Max: " + max);
		System.out.println("Min: " + min);
		
	}
	public void minMax ()
	{
		/*
		 * In a method named minMax, have the user type in the size of an integer array.  
		 * Then fill the array with random numbers between, and including, 23 and 74.  
		 * Print out the array and then print out the minimum and maximum values of the array.
		 */
		
		Scanner kb = new Scanner (System.in);
		System.out.println("How many items?");
		int amount = kb.nextInt();
		int[] points = new int[amount];
		for (int k = 0; k < points.length; k++)
		{
			points[k] = (int)(Math.random() * 52 + 23);
			System.out.println(points[k]);
		}
		
		int min = points [0];
		int max = points [0];
		
		for (int k = 1; k < points.length; k++)
		{
			if (points[k] < min)
			{
				min = points[k];
			}
			if (points[k] > max)
			{
				max = points[k];
			}
		}
		System.out.println("Max: " + max);
		System.out.println("Min: " + min);


	
	}

}
