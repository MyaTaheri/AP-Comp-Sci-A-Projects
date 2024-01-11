package Assignment8;

import java.util.Scanner;

public class Assignment2 
{
	public static void main (String[] args)
	{
		
		/*
		 * Using Math.random(), create a player vs. computer rock, paper, scissors game.  
		 * The winner is first to three.  Recall, Math.random() randomly gives a number between 0 and 1.
		 */
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("What's your name?");
		String name = input.next();
		
		double random = 99;
		
		int compWin = 0;
		int personWin = 0;
		String choice = " ";
		
		String again = "yes";
		
				
		while (again.equalsIgnoreCase("yes"))
		{
			while (compWin < 3 && personWin < 3)
			{
				random = Math.random();				
				
				if (random < (1/3.0))
				{
					choice = "paper";
				}
				else if (random >= (1/3.0) && random <(2/3.0))
				{
					choice = "rock";
				}
				else if (random > (2/3.0))
				{
					choice = "scissors";
				}
				
				System.out.println("___________");
				System.out.println("Rock, Paper, Scissors");
				String move = input.next();
				
				if (move.equalsIgnoreCase("rock") && choice.equalsIgnoreCase("paper"))
				{
					compWin++;
					System.out.println("Computer Won");
				}
				else if (choice.equalsIgnoreCase("rock") && move.equalsIgnoreCase("paper"))
				{
					personWin++;
					System.out.println(name + " Won");
		
				}
				else if (choice.equalsIgnoreCase("paper") && move.equalsIgnoreCase("scissors"))
				{
					personWin++;
					System.out.println(name + " Won");
		
				}
				else if (move.equalsIgnoreCase("paper") && choice.equalsIgnoreCase("scissors"))
				{
					compWin++;
					System.out.println("Computer Won");
		
				}
				else if (move.equalsIgnoreCase("rock") && choice.equalsIgnoreCase("scissors"))
				{
					personWin++;
					System.out.println(name + " Won");
		
				}
				else if (choice.equalsIgnoreCase("rock") && move.equalsIgnoreCase("scissors"))
				{
					compWin++;
					System.out.println("Computer Won");
				}
				else
				{
					System.out.println("Tie");
				}
				System.out.println(name + " " + personWin + " Computer " + compWin);
			} 
			
			if (personWin == 3)
			{
				System.out.println (name + " wins the match!");
			}
			else
			{
				System.out.println ("Computer wins!");
			}
			
			System.out.println("Play again?");
			again = input.next();
			
			compWin = 0;
			personWin = 0;
		}
		
		
		//could rig it to have laptop win every time...
	}
}
