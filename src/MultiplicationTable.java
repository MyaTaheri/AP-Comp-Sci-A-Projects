import java.util.Scanner;

public class MultiplicationTable 
{
	public static void main(String[] args)
	{
		int[][]table;
		Scanner kb = new Scanner (System.in);
		System.out.println("Enter First Number: ");
		int num1 = kb.nextInt();
		System.out.println("Enter Second Number: ");
		int num2 = kb.nextInt();
		
		table = new int[num1][num2];
		
		for (int k = 0; k < num2; k++)
		{
			for (int j = 0; j < num1; j++)
			{
				table [k][j] = (k+1) * (j+1);
				System.out.print (table[k][j] + "\t");
			}
			System.out.println ("");
		}
	}
}
