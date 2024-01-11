
public class Math2 
{
	public static void main (String[] args)
	{
		// 5 math operations
		//  + - * / %
		// 2 types - int & double
		double olivia = 47;
		double grace = 10;
		double answer = olivia / grace; 
		System.out.println(olivia + "/" + grace + " = " + answer);
		//+ (not numbers) concatenation
		//int remainder = olivia % grace;
		//System.out.println("The remainder is " + remainder);
		//capacity 3000 pounds
		//average highschooler weighs 147 lb
		int max = 3000;
		int hs = 147;
		System.out.println("The maximum weight allowed in the elevator is " + max);
		System.out.println("The number of highschoolers the elevator can fit is " + max/hs);
		int left = max % hs;
		System.out.println("Extra lbs avalible is " + left);
	}
}
