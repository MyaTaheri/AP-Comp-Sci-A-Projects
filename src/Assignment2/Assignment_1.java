package Assignment2;
import java.util.Scanner;

public class Assignment_1
{
	public static void main (String[] args)
	{
		
		/*
		 * Have the user type in two integers and the program will print out the 5 math functions 
		 * of those two numbers.
		 */
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("Input number 1:");
		int intOne = input.nextInt();
		System.out.println("Input number 2:");
		int intTwo = input.nextInt();
		
		
		int addition = intOne + intTwo;
		int subtract = intOne - intTwo;
		int intDivision = intOne / intTwo;
		int multiplication = intOne * intTwo;
		int modular = intOne % intTwo;
		
		double doubleOne = intOne;
		double doubleTwo = intTwo;
		
		double doubleDivision = doubleOne / doubleTwo;
		
		System.out.println (intOne + " + " + intTwo + " = " + addition);
		System.out.println (intOne + " - " + intTwo + " = " + subtract);
		System.out.println (intOne + " / " + intTwo + " = " + intDivision + " (Answer as an int)");
		System.out.println (intOne + " / " + intTwo + " = " + doubleDivision);
		System.out.println (intOne + " * " + intTwo + " = " + multiplication);
		System.out.println (intOne + " % " + intTwo + " = " + modular);

		
	}

}
