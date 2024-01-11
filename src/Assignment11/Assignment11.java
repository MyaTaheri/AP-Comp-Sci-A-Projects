package Assignment11;

public class Assignment11 
{
	/*
	 *  A local arcade outputs coupons according to how well you play a game. 
	    You can redeem 10 tokens for candy or 3 tokens for a balloon.  
	 *  Like most people, you prefer candy over balloons. Write a program 
	 *  that sends the amount of tokens you have won to a method named findPrizes. 
	 *  The method findPrizes should return a string informing the user the number of 
	 *  candy and balloons you can get, with the idea that you maximize the number of candy.
	 */
	public static void main(String [] args)
	{
		String result = findPrizes(57);
		System.out.println(result);
	}

	public static String findPrizes(int tokens)
	{
		String result = "";
		int tokensleft = tokens;
		int candy = tokensleft / 10;
		tokensleft = tokensleft - (candy * 10);
		int balloons = tokensleft / 3;
		result = tokens + " tokens will get you " + candy + " candies and " + balloons + " balloons.";
		return result;
	}
}
