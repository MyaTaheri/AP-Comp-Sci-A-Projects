package Objects;

public class NumberClass
{
	public boolean isPrime (int num)
	{
		int counter = 0;
		for (int i = 2; i < num; i++)
		{
			if (num % i == 0)
				counter++;
		}
		if (counter > 0)
			return false;
		else
			return true;
		
	}
	
	public void findFactors (int num)
	{
		for (int i = 1; i < num / 2; i++)
		{
			if (num % i == 0)
			{
				System.out.println(i + ", " + num/i);

			}
		}
		
	}
	
	public void lowerPrimes (int num)
	{
		
		
		for (int i = 2; i < num; i++)
		{
			if (isPrime(i))
				System.out.print(i + ", ");
		}
		System.out.println();
	}
	
}
