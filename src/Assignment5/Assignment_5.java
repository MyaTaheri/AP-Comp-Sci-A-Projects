package Assignment5;
import java.util.Scanner;

public class Assignment_5 
{
	public static void main (String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter number:");
		int number = input.nextInt();
		
		if ((number%2) == 0)
		{
			System.out.println(number + " is even");
		}
		else
		{
			System.out.println(number + " is odd");
		}
	}

}
