package Assignment3;

import java.util.Scanner;

public class Assignment_2 
{

		public static void main (String[] args)
		{
			/*
			 * Have the user type in two points, (x1,y1) and (x2,y2).  
			 * Have the program calculate and display the distance between the two points as a double.
			 */

			Scanner kb = new Scanner(System.in);
			System.out.println("Insert x1: ");
			int x1 = kb.nextInt();
			System.out.println("Insert y1: ");
			int y1 = kb.nextInt();
			System.out.println("Insert x2: ");
			int x2 = kb.nextInt();
			System.out.println("Insert y2: ");
			int y2 = kb.nextInt();

			double distance = Math.sqrt( Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2) );
			
			
			System.out.println("Distance of (" + x1 +  ","  + y1 + ") and (" + x2 + "," + y2 + ") is " 
					+ distance);
		}
		
}
