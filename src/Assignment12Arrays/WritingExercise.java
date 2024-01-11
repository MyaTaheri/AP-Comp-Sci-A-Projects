package Assignment12Arrays;

import java.util.Scanner;

public class WritingExercise 
{
	public static void main (String[] args)
	{
		/*
			Create an array called houseNum that can store 20 house numbers on a street.
			Create an array called byTen that has the elements: 5, 10, 15, 20, 25, 30 stored in it.
			Create an array called interest that can store five banking interest rates in it.
			Create an array called street that has: Maple Street, Oak Lane, Wist Avenue, Cherry Circle stored in it.
			Create an array called grades that can store 25 letter grades stored in it.
		 */
		
		int[] houseNum = new int[20];
		int[] byTen = new int[]{5, 10, 15, 20, 25, 30};
		double[] interest = new double[5];
		String[] street = new String[] {"Maple Street", "Oak Lane", "Wist Avenue", " Cherry Circle"};
		char[] grades = new char[25];
	}
	
	/*
	 * Create a void method named largest, that gathers ten integers inputted 
	 * from a user and stores them in an array.  Find the largest value in the array and print the value.
	 */

	public void largest()
	{
		int[] arr = new int[10];
		Scanner kb = new Scanner (System.in);
		int largest;
		for (int k = 0; k < 20; k++)
		{
			System.out.println("Enter a num:");
			arr [k] = kb.nextInt();
		}
		largest = arr[0];
		for (int j = 1; j < 10; j++)
		{
			if (arr[j] > largest)
			{
				largest = arr [j];
			}
		}
	}

}
