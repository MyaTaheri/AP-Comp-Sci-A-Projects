package Assignment9;

import java.util.Scanner;

public class Assignment3 
{
	public static void main (String[] args)
	{
		/*
		 * Program a high low guessing game with a number between 1 and 100, inclusively.
		 * Let the user keep guessing until the correctly guess the number.
		 */
		
		Scanner input = new Scanner (System.in);
		
		int guess = 101;
		int numOfGuess = 1;
		int random = (int)(Math.random() * 100) + 1;
				
		System.out.println("Guess a number between 1 and 100");
		guess = input.nextInt();
		
		
		while (guess != random)
		{
			numOfGuess++;
			
			if (guess > random) 
			{
				System.out.println("Too high");
			}
			else
			{
				System.out.println("Too low");
			}
			
			System.out.println("Guess a number between 1 and 100");
			guess = input.nextInt();
		}
		System.out.println("Correct!  It took " + numOfGuess + " guesses.");
	}


}
