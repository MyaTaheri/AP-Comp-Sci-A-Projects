package Assignment9;

import java.util.Scanner;


public class Assignment2 {
	
	/*
	 * Write a Java application that has the user play a guessing game against the computer for 10 times.
	 *  It will keep score and tell the user if they guessed the number between 1 and 10, inclusive, 
	 *  correctly or incorrectly after each round.
	 */

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		int humanScore = 0;
		int compScore = 0;
		
		int guess = 99;
		
		int random = (int)(Math.random() * 10) + 1;
		
		for (int i = 1; i <= 10; i++)
		{

			System.out.println("Round " + i);
			System.out.println("Guess a number between 1 and 10");
			guess = input.nextInt();
			if (guess != random)
			{
				System.out.println("Incorrect");
				compScore++;
			}
			else
			{
				System.out.println("Correct");
				humanScore++;
			}
			
			System.out.println("User: " + humanScore + " Computer: " + compScore);
			System.out.println("______________");
			random = (int)(Math.random() * 10) + 1;
			guess = 99;
		}

	}

}
