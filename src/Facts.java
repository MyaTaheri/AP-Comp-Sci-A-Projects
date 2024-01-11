import java.util.Scanner;

public class Facts 
{
	public static void main (String[] args)
	{
		Scanner kb = new Scanner (System.in);
		System.out.println("Enter Number Greater 0: ");
		int num = kb.nextInt();
		int answer = factorial (num);
		System.out.println(answer);
		
//		
//		for (int i = 1; i < num; i++)
//		{
//			answer = answer * i;
//		}
	}
	
	public static int factorial(int num)
	{
		if (num > 0)
			return num * factorial(num-1);
		else 
			return 1;
					
		
	}
}
