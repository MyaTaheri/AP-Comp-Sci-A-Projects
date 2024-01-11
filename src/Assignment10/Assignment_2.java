package Assignment10;

import java.util.Scanner;

public class Assignment_2 
{
	public static void main (String[] args)
	{
		/*
		 * Create an application that plays the game called spoons.  
		 * The game is based on the idea that 21 spoons are lying on the ground and two players take turns
		 *  picking up either 1 or 2 spoons.  The person holding the last spoon is the loser of the game.
		 */
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("Player One: ");
		String nameOne = input.next();
		System.out.println("Player Two: ");
		String nameTwo = input.next();
		
		System.out.println("Rules:  Pick 1 or 2 spoons, the player holding the "
				+ "last spoon is the loser of the game");
		
		System.out.println("___________");
		
		int spoons = 21;
		
		int pickup = 0;
		
		int round = 0;
		
		while (spoons > 0)
		{
			if (round % 2 == 0)
			{
				System.out.print(nameOne);
			}
			else
			{
				System.out.print(nameTwo);
			}
			
			System.out.println(", how many spoons do you want to pick up?");
			pickup = input.nextInt();
			
			while ((pickup < 1) || (pickup > 2))
			{
				System.out.println("Sorry, that wasn't an amount of spoons you can pick. How many spoons do you want to pick up.");
				pickup = input.nextInt();
			}
			
			spoons = spoons - pickup;
			
			if (spoons >= 0)
			{
			System.out.println("Spoons: " + spoons);
			}
			
			round++;

		}
		
		System.out.println("__________________");
		
		if (round % 2 == 0)
		{
			System.out.println(nameOne + " is the winner!");
		}
		else
		{
			System.out.println(nameTwo + " is the winner!");
		}
		
	}

}
