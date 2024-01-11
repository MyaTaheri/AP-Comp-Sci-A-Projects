package Assignment1;

public class Assignment_1 
{
	public static void main (String[] args)
	{
		/*
		 * Take in how many dollars and cents the user has.  Take in how much an item cost.  
		 * Have the program calculate and display how many items they may buy and how much change is expected.
		 */
		
		int dollar = 70;
		int cents = 02;
		int cost = 13;
		System.out.println ("I have $"+ dollar + "." + cents);
		System.out.println ("A lightbulb costs " + cost);
		System.out.println ("I can buy " + dollar/cost + " lightbulb(s)");
		System.out.println ("I have " + cost % dollar + "." + cents + " in change");
	
	}
}
