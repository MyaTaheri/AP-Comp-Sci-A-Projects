package Assignment4;

public class Assignment_2 
{
	public static void main (String[] args)
	{
		
		/*
		 * Create a program that prints five random values between 0 and 1, their average value.  
		 * Challenge: find the minimum and maximum value of the five values.
		 * Use Math.random(), Math.min(), and Math.max().
		 */
		double num1 =  Math.random();
		double num2 =  Math.random();
		double num3 =  Math.random();
		double num4 =  Math.random();
		double num5 =  Math.random();
		
		double average = (num1 + num2 + num3 + num3 + num4 + num5) / 5;
		double min = Math.min(Math.min(Math.min(Math.min(num1, num2), num3),num4), num5);
		double max = Math.max(Math.max(Math.max(Math.max(num1, num2), num3),num4), num5);
		
		System.out.println("Five random numbers:" + "\n" + num1 + "\n" + num2 + "\n" + num3 + "\n" + num4 + "\n" + num5);
		System.out.println("Average: " + average);
		System.out.println("Min: " + min);
		System.out.println("Max: " + max);
		
	}
}
