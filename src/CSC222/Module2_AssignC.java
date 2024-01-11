package CSC222;

import java.util.Scanner;

//Mya Taheri CSC 222 9/23/22
//Module 2: Coding Assignment C

public class Module2_AssignC {
		
	private static Scanner scnr = new Scanner(System.in);
	
	public static void main(String[] args) 
	{

		palindrome();
		System.out.println("-----------------");
		randomWinner();	
		System.out.println("-----------------");
		chocolateBar();
		System.out.println("-----------------");


	}
	public static void palindrome()
	{
		/*
		 * For all of the following words, if you move the first letter to the end of the word,
		 *  and then spell the result backwards you will get the original word:
				banana dresser grammar potato revive uneven assess

			Write a method that reads a word and determines whether it has this property. 
			Continue reading and testing words until you encounter the word quit. Treat 
			uppercase letters the same as lowercase letters. Display how many words you found 
			when you finish.
		 */
		
		System.out.println("Enter a word: ");
		String input = scnr.next();
		char firstLetter;
		String backwardInput = "";
		int numOfPalindrome = 0;
		
		
		while (!input.equalsIgnoreCase("Quit"))
		{
			input = input.substring(1);
			
			for (int i = input.length(); i > 0 ; --i)
			{
				backwardInput = input.charAt(input.length() - i) + backwardInput;
			}
			
			if (backwardInput.equalsIgnoreCase(input))
			{
				numOfPalindrome++;
			}

			System.out.println("Enter another word: ");
			backwardInput = "";
			input = scnr.next();
		}
		System.out.println("Number of palindromes (minus first letter): " + numOfPalindrome);
	}

	public static void randomWinner()
	{
		/*
		 * You have three identical prizes to give away and a pool of 10 finalists. 
		 * The finalists are assigned numbers from 1 to 10.  Write a method to randomly select
		 *  the numbers of 3 finalists to receive a prize.  Make sure not to pick the same 
		 *  number twice.  For example, picking finalists 3, 6, 2 would be valid but picking 
		 *  3, 3, 11 would be invalid because finalist number 3 is listed twice and 11 is not 
		 *  a valid finalist number.   For this problem you can insert the following line of 
		 *  code to generate a random number between 1 and 10:
		 *  	int num = (int) (Math.random() * 10) +1;
		 */
		
		int winner1 = (int) (Math.random() * 10) +1;
		int winner2 = (int) (Math.random() * 10) +1;
		int winner3 = (int) (Math.random() * 10) +1;
		
		while (winner1 == winner2)
		{
			winner2 = (int) (Math.random() * 10) +1;
		}
		while (winner2 == winner3 || winner3 == winner1)
		{
			winner3 = (int) (Math.random() * 10) +1;
		}
		System.out.println("Winners: " + winner1 + "," + winner2 + "," + winner3);
		
		
		
	}	

	public static void chocolateBar()
	{
		/*
		 * Suppose we can buy a chocolate bar from the vending machine for $1 each. 
		 * Inside every chocolate bar is a coupon.  We can redeem 6 coupons for one chocolate
		 * bar from the machine.  This means that once you have started buying chocolate bars
		 * from the machine, you always have some coupons. We would like to know how many 
		 * chocolate bars can be eaten if we start with N dollars and always redeem coupons
		 * if we have enough for an additional chocolate bar.

			For example, with 6 dollars we could consume 7 chocolate bars after purchasing 
			6 bars giving us 6 coupons and then redeeming the 6 coupons for one bar.  This 
			would leave us with one extra coupon.  For 11 dollars, we could have consumed 13 
			chocolate bars and still have one coupon left.  For 12 dollars, we could have
			 consumed 14 chocolate bars and have two coupons left.
			 
			 Write a method that takes input for the value for N and outputs to the terminal 
			 how many chocolate bars we can eat and how many coupons we would have leftover. 
			  Use a loop that continues to redeem coupons as long as there are enough to get
			   at least one chocolate bar.

		 */
		
		System.out.println("Enter amount of dollars: ");
		int dollar = scnr.nextInt();
		
		int numOfChoco = dollar * 1;
		int numOfCoupons = numOfChoco * 1;

		while (numOfCoupons >= 6)
		{
			numOfCoupons = numOfCoupons - 6;
			numOfChoco++;
			numOfCoupons++;
		}
		
		
		System.out.println("Number of Chocolate Bars Purchased: " + numOfChoco);
		System.out.println("Number of Remaining Coupons: " + numOfCoupons);

		
	}

}
