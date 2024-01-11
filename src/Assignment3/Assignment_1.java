package Assignment3;
import java.util.Scanner;

public class Assignment_1 
{
	public static void main (String[] args)
	{
		/*
		 * Have the user type in two points, (x1,y1) and (x2,y2). 
		 * Have the program calculate and display the slope as both a fraction and double.
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
		
		int combinedX = x2 - x1;
		int combinedY = y2 - y1;
		
		System.out.println("Slope of (" + x1 +  ","  + y1 + ") and (" + x2 + "," + y2 + ") is " 
							+ combinedY + "/" + combinedX + " or " + (combinedY * 1.0)/combinedX);
		
	}

}