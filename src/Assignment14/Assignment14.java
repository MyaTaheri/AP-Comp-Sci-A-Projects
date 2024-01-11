package Assignment14;

import java.util.Scanner;

public class Assignment14 
{
	public static void main (String[] args)
	{
		Assignment14 assignment = new Assignment14();
		//System.out.println(assignment.lottery5000(5000));
		System.out.println(assignment.palindrome("dog"));
		System.out.println(assignment.palindrome("racecar"));


	}

	public int lottery5000(int times)
	{
		Scanner input = new Scanner (System.in);
		int[] lotteryTicket = new int[3];
		System.out.println("Enter 1 Number:");
		lotteryTicket[0] = input.nextInt();
		System.out.println("Enter 2 Number:");
		lotteryTicket[1] = input.nextInt();
		System.out.println("Enter 3 Number:");
		lotteryTicket[2] = input.nextInt();
		
		int counter = 0;
		
		int[] winningTicket = new int[3];

		
		for (int i = 0; i < times; i++)
		{
			
			for (int j = 0; j < lotteryTicket.length; j++)
			{
				winningTicket[j] = (int)(Math.random()*9);
			}
			
			if (lotteryTicket[0] == winningTicket[0] && lotteryTicket[1] == winningTicket[1] && lotteryTicket[2] == winningTicket[2])
			{
				counter++;
			}
			
		}
		
		return counter;
		
	}

	public boolean palindrome(String str)
	{
		boolean palindrome = false;
		
		String revStr = "";
		
		for (int i = str.length(); i > 0; i--)
		{
			revStr = str.substring(str.length() - i, str.length() - i  + 1) + revStr;
		}
		
		System.out.println(revStr);
		System.out.println(str);
		
		return revStr.equalsIgnoreCase(str);
	}

}
