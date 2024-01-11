package ExtraAssignments;

import java.util.Random;
import java.util.Scanner;

public class Shuffle 
{
	int[]nums;
	int[] shuffle;
	
	public void askNums()
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Number of numbers:");
		int lengthOfList = input.nextInt();
		
		this.nums = new int[lengthOfList];

		for (int i = 0; i < nums.length; i++)
		{
			System.out.println("Enter a number:");
			this.nums[i] = input.nextInt();
		}
	}
	
	public void shuffle()
	{
		
		shuffle = new int[nums.length];
		
		for (int i = 0; i < nums.length; i++)
		{
			shuffle[i] = nums[i];
		}
		
		
		for (int j = 0; j < nums.length; j++) 
		{
			int randomIndex = (int)(Math.random()*(nums.length-2) + 0) ;
			//picks a random number between 0 and nums.length
			int temp = shuffle[randomIndex];
			//Assigns the random variable to a placeholder
			shuffle[randomIndex] = shuffle[j];
			shuffle[j] = temp;
			//Switches randomIndex and j in shuffle	
		}
		
		
		
		
	}
	
	public void printArrs()
	{
		System.out.println("");
		System.out.println("USERS numbers:");
		for (int i = 0; i < nums.length; i++)
		{
			System.out.print(nums[i] + " ");
		}
		System.out.println();
		System.out.println("SHUFFLED numbers:");
		for (int j = 0; j < shuffle.length; j++)
		{
			System.out.print(shuffle[j] + " ");
		}
	}
}
