public class english 
{

	public static void main (String[] args)
	{
		double[] summative = {94, 80, 90, 85, 94, 83, 88, 92, 90, 91, 100};
		double[] formative = {80, 100, 100, 79, 96, 85, 91, 76, 95, 100, 100, 100};
		
		double sumS = 0;
		double sumF = 0;
		double minimumS = 85;
		//Redo: want to get above an 83 to make a worthwhile difference 
		// MUST GET 85 ON ALL OTHER SUMMATIVES
		
		for (int i = 0; i < summative.length; i++)
		{
			sumS = sumS + summative[i];
		}
		for (int j = 0; j < formative.length; j++)
		{
			sumF = sumF + formative[j];
		}
		//getting 100 on all the other formatives
		sumF = sumF + 400;
		sumF = sumF / (formative.length + 4);
		
		//sumS = sumS + (minimumS * 3);
		sumS = sumS + (95+85+85);
		//93 = short story
		//85 = test
		//87 = isearch

		sumS = sumS / (summative.length + 3);

		System.out.println(sumF);
		System.out.println(sumS);

		
		double grade = (0.8 * sumS) + (0.2 * sumF);
	
		
		System.out.println(grade);
	}
}
