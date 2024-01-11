package ExtraAssignments;

public class Sorting 
{
	public static void main (String[] args)
	{
		
// Sort-Selection  ***** IGNORE UNTIL BUBBLE SORT **** 
//		int index = -1;
//		int var = 0;
//		
//		int[] array = {3, 2, 1};
//		int[] array2 = new int[array.length];
//		int[] array3;
//
//		
//		int x = 0; 
//		int n = 0;
//		
//		while (n < array.length)
//		{
//			for (int i = 0; i < array.length; i++)
//			{
//				if (array[i] > var)
//				{
//					index = i;
//					var = array[i];
//				}
//				array2[0] = var;
//				
//				//make new array with all of the same numbers except array(i)
		
//Bubble-Sort
		
		//allow for user to insert numbers into array???????
		int[] array = {72, 48, 31, 84, -3, 89, 999, 83, 62, -79, 0};
		
		for (int j = 0; j <= array.length; j++)
		{
			for (int i = 0; i < array.length - 1; i++)
			{
				if (array[i] > array[i+1])
				{
					int larger = array[i];
					
					array[i] = array [1+i];
					array[i+1] = larger;		
					
				}
				//else: do nothing
				
			}
		}
		
		for (int k = 0; k < array.length; k++)
		{
			System.out.println(array[k]);
		}
				
	}
}
