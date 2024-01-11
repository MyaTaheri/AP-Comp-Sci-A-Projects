package Assignment5;

import java.util.Scanner;

public class Assignment_3 
{
	public static void main (String[] args)
	{
		/*
		 * Have the user enter the sides of a triangle and then compute the area of the triangle.
		 * Using Heron’s formula:
		 * Area=s(s-a)(s-b)(s-c), s is half the perimeter.
		 */
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter in side a: ");
		int a = input.nextInt();
		
		System.out.println("Enter in side b: ");
		int b = input.nextInt();
		
		System.out.println("Enter in side c: ");
		int c = input.nextInt();
		
		double s= (a + b + c)/2;
		double area = Math.sqrt(s * (s - a)* (s-b) * (s- c));
		
		System.out.println ("The area is " + area + " units squared.");
	}
}
