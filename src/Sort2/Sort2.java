package Sort2;
//import Objects.Sort2;

public class Sort2 
{
	//global
	int[] arr;
	
	public Sort2(int amt)
	{
		arr = new int[amt];
	}
	
	public void fillArrayWithRandomNumbers()
	{
		for (int i = 0 ; i < arr.length; i++)
		{
			arr[i] = (int)(Math.random() * (46)+ 5);
		}
		
	}	
	public void printOutArray()
	{
		System.out.println("**************");

		for (int i:arr)
		{
			System.out.print(i + ", ");
		}
	System.out.println();
		
	}
	public void sortArray()
	{
		//selection sort
		for (int k = arr.length - 1; k > 0; k--)
		{
			int max = arr[0];
			int spot = 0;
			for (int i = 0; i < k; i++)
			{
				if (arr[i] > max)
				{
					max = arr[i];
					spot = i;					
				}
			}
			int temp = arr[k];
			arr[k]=max;
			arr[spot] = temp;
		}
	}
	public int getAverage()
	{
		int avg = 0;
		for (int k = 3; k < arr.length; k++)
		{
			avg += arr [k];
		}
		avg = avg/17;
		return avg;
	}
}
