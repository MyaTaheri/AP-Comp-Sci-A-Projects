package Objects;

import java.util.Scanner;


public class NumberDriver 
{
	public static void main (String[] args)
	{
		int choice = 0;		
		Scanner kb = new Scanner (System.in);
		NumberClass philippe = new NumberClass();
		while (choice < 4)
		{
			System.out.println("Enter Number:");
			int num = kb.nextInt();
			System.out.println("1] Check if prime");
			System.out.println("2] Find all factors");
			System.out.println("3] Find all prime less than number");
			System.out.println("4] End the program and erase all data");
			choice = kb.nextInt();
			if (choice == 1)
			{
				if (philippe.isPrime(num))	
					System.out.println("Is Prime");
				else
					System.out.println("Not prime");
			}
			if (choice == 2)
			{
				philippe.findFactors(num);
			}
			if (choice == 3)
			{
				philippe.lowerPrimes(num);
			}
			System.out.println("---------------");
		}
	}
}
