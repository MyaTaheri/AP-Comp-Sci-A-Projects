package Objects;

import java.util.Scanner;

public class JumpDriver 
{
	public static void main (String[] args)
	{
		Scanner kb = new Scanner (System.in);
		System.out.println("How many students will jumping:");
		int amount = kb.nextInt();
		Jump block1 =  new Jump (amount, "Block 1");
		System.out.println("Highest: " + block1.getHighest());
		System.out.println("Lowest: " + block1.getLowest());
		
	}

}
