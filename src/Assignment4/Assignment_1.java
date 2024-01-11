package Assignment4;
import java.util.Scanner;


public class Assignment_1 

{
	public static void main (String[] args)
	{
		
		/* 
		 * Create a program that takes a date as input and prints the day of the week that date 
		 * falls on. Your program should take three command-line arguments: m (month), d (day), 
		 * and y (year). For m use 1 for January, 2 for February, and so forth.
		 * For output print 0 for Sunday, 1 for Monday, 2 for Tuesday, and so forth.
		 * 
		 */
		
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Year: ");
		int year = input.nextInt();
		
		System.out.println("Month: ");
		int month = input.nextInt();
		
		System.out.println("Day: ");
		int day = input.nextInt();
		
		int y =  year - (14 - month) / 12;
		int x = y + y / 4 - y / 100 + y / 400;
		int m = month + 12 * ((14 - month) / 12) - 2;
		int d =(day + x + 31 * m / 12) % 7;
		
		String dayOfWeek = " ";
		
		if (d == 1)
		{
			dayOfWeek = "Monday";
		} 
		else if (d==2)
		{
			dayOfWeek = "Tuesday";
		}
		else if (d==3)
		{
			dayOfWeek = "Wednesday";
		}
		else if (d==4)
		{
			dayOfWeek = "Thursday";
		} 
		else if (d==5)
		{
			dayOfWeek = "Friday";
		} 
		else if (d==6)
		{
			dayOfWeek = "Saturday";
		} 
		else if (d==0)
		{
			dayOfWeek = "Sunday";
		} 
		
	
		
		System.out.println (month + "/" + day + "/" + year + " falls on a " + dayOfWeek);


		
		
		
	}
}
