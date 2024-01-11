package ExtraAssignments;

import java.util.Scanner;

public class ExtraAssignment1 
{
	public static void main (String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("This calculator determines the solutions for ax^2 + bx + c = 0");
		
		System.out.println("Input a:");
		double a = input.nextDouble();
		
		while(a == 0)
		{
			System.out.println("a can not equal 0");
			System.out.println("Input a:");
			a = input.nextDouble();
		}
		
		System.out.println("Input b:");
		double b = input.nextDouble();
		
		System.out.println("Input c:");
		double c = input.nextDouble();
		
		double discriminant  = Math.pow(b, 2) - (4 * a * c);
		
		if (discriminant > 0)
		{
			//2 solutions
			double sol1 = (-b + Math.sqrt(discriminant))/(2 * a);
			double sol2 = (-b - Math.sqrt(discriminant))/(2 * a);
			
			
			
			if (b < 0)
			{
				System.out.println("The solutions for " + a + "x^2 - " + b + "x + " + c + " is " + sol1 + " and " + sol2);
			}
			else if (c < 0)
			{
				System.out.println("The solutions for " + a + "x^2 + " + b + "x - " + c + " is " + sol1 + " and " + sol2);
			}
			else
			{
				System.out.println("The solutions for " + a + "x^2 + " + b + "x + " + c + " is " + sol1 + " and " + sol2);
			}
			
		}
		else if (discriminant == 0)
		{
			//1 solution
			
			double sol1 = (-b + Math.sqrt(discriminant))/(2 * a);
			
			
			if (b < 0)
			{
				System.out.println("The solutions for " + a + "x^2 - " + b + "x + " + c + " is " + sol1);
			}
			else if (c < 0)
			{
				System.out.println("The solutions for " + a + "x^2 + " + b + "x - " + c + " is " + sol1);
			}
			else
			{
				System.out.println("The solutions for " + a + "x^2 + " + b + "x + " + c + " is " + sol1);
			}
			
		}
		else if (discriminant < 0)
		{
			//no real solution
			
			discriminant = -1 * discriminant;
			
			double solA = ((-b / 2 * a));
			double solB = (Math.sqrt(discriminant)/2 * a);
			
			
			
			if (b < 0)
			{
				System.out.println("The solutions for " + a + "x^2 - " + b + "x + " + c + " is " + solA + " + " + solB + "i and " + solA + " - " + solB +  "i");
			}
			else if (c < 0)
			{
				System.out.println("The solutions for " + a + "x^2 + " + b + "x - " + c + " is " + solA + " + " + solB + "i and " + solA + " - " + solB +  "i");
			}
			else
			{
				System.out.println("The solutions for " + a + "x^2 + " + b + "x + " + c + " is " + solA + " + " + solB + "i and " + solA + " - " + solB + "i");
			}
			
			
		}
	}

}
