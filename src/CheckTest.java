import java.util.ArrayList;
import java.util.Scanner;

public class CheckTest 
{
	public static void main (String[] args)
	{
		
	}
	
	public static boolean isReversed(ArrayList<Integer> firstList,

			ArrayList<Integer> secondList)

			{

			for (int j = 0; j < firstList.size() / 2; j++)

			{

			if (firstList.get(j) != secondList.get(secondList.size() - 1 - j))

			{

			return false;

			}

			}

			return true;

			}
}
	

	