package Assignment10;

import java.util.Scanner;


public class Assignment_1 
{
	public static void main (String[] args)
	{
		/*
		 * Create an application that will keep a small budget for a single user.  
		 * The program will start by asking the user, their name, starting amount and 
		 * amount of items that need to be purchased.  Using a for loop, ask the user 
		 * how much each item cost and the name of the item purchased. After each item and
		 *  cost is entered, inform the user how much they started with, the cost of the item,
		 *  and the new budget amount.
		 */
		
		Scanner input = new Scanner (System.in);
		System.out.println("What is your name?");
		String name = input.next();
		System.out.println("How much money are you starting with? (in dollars)");
		double money = input.nextDouble();
		System.out.println("How many items will you be purchasing?");
		int numItems = input.nextInt();
		
		double newCost = money;
		double costItem = 0;
		
		for (int i = 1; i <= numItems; i++)
		{
			System.out.println("___________");
			
			System.out.println(name + ", how much was item " +  i);
			costItem = input.nextDouble();
			
			System.out.println("What is the item?");
			String item = input.next();
			
			System.out.println("___________");
			
			System.out.println("Start:" + money);
			System.out.println("$" + costItem + " for " + item);
			
			newCost = newCost - costItem;
			
			money = newCost;
			
			System.out.println("New: " + newCost);
		}
		
		
	}

}
