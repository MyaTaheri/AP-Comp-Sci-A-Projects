package Sort2;

public class Sort2Driver
{
	public static void main (String[] args)
	{
		Sort2 s2 = new Sort2(20);
		
		s2.fillArrayWithRandomNumbers();
		s2.printOutArray();
		s2.sortArray();
		s2.printOutArray();
		int avg = s2.getAverage();
		System.out.println(avg);
	}

}
