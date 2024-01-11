import java.util.Scanner;

public class Loops2 
{

	public static void main(String[] args)
	{
		Scanner kb = new Scanner (System.in);
		
		String again = "yes";
		
		do
		{
			int age = 19;
			int height = 96;
			if (height > 58 && age > 17)
			{
				System.out.println("You can join the miliatry");
			}
			else if (height >80 && age >17)
			{
				System.out.println("You are too tall");
			}
			else 
			{
				System.out.println("You are too short");
			}

			System.out.println("Would you like to run again?");
			again = kb.next();
			
			age = 7;
			int weight = 42;
			
			if(age >= 10 || weight>=70)
			{
				System.out.println("You don't need a car seat");
			}
			else
			{
				System.out.println("You must sit in a car seat");
			}
		}while(again.equals("yes"));
	}
}
