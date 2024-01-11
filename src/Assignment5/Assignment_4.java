package Assignment5;

public class Assignment_4 
{
	public static void main(String[] args)
	{
		/*
		 * Have the computer generate a random phone number. Don’t let the number start with a zero.
		 */
		
		int num1 = (int)(Math.random() * 10);
		
		if (num1 == 0)
		{
			num1 = num1 + 1;
		}
		
		int num2 = (int)(Math.random() * 10);
		int num3 = (int)(Math.random() * 10);
		int num4 = (int)(Math.random() * 10);
		int num5 = (int)(Math.random() * 10);
		int num6 = (int)(Math.random() * 10);
		int num7 = (int)(Math.random() * 10);
		int num8 = (int)(Math.random() * 10);
		int num9 = (int)(Math.random() * 10);
		int num10 = (int)(Math.random() * 10);
		
		System.out.println("Your random number is " + num1 + num2 + num3 + "-" + num4 + num5 + num6 + "-" + num7 + num8 + num9 + num10);	
	}

}
