package Array;

import java.util.Scanner;

public class ExampleTwo
{
	//void method (doesn't return)

	public void getHeight()
	{
		Scanner kb = new Scanner (System.in);
		System.out.println("How tall are you in mms");
		int height = kb.nextInt();
		if (height < 500)
		{
			System.out.println("You are smaller");
		}
		else 
		{
			System.out.println("You are bigger");
		}
	}
	
	public void getClassHeights()
	{
		int[] heights = {71, 68, 72, 58, 66, 83};
		System.out.println(heights[0]);
		System.out.println(heights[5]);
		System.out.println(heights.length);

	}
}
