import java.util.Scanner;

public class IfStatementsRandom 
{

	public static void main(String[] args)
	{
		//random  number
		double num1 = Math.random();
		System.out.println(num1);
		
		double num2 = num1*10;
		System.out.println(num2);
		
		int num3 = (int)num2;
		System.out.println(num3 + 1);
		Scanner kb = new Scanner(System.in);
		System.out.println("Whats your favorite number between 1 and 10");
		int fav = kb.nextInt();
		if (num3 == fav)
		{
			System.out.println("THE SAME");
		}
		if (num3 != fav)
		{
			System.out.println("Different");
		}
	}

}
