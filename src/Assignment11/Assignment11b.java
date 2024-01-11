package Assignment11;

public class Assignment11b 
{
	/*
	 * Create a program that reads through a sentence and changes the word 
	 * hate to love and changes the word night to day.  Write a method called
	 * convertor that receives a sentence in the parameter and returns the translated sentence.
	 */
	
	public static void main (String [] args)
	{
		System.out.println(converter("I hate to play lacrosse at night"));
	}
	
	public static String converter (String sentence)
	{
		String newSentence = sentence;
		newSentence = newSentence.replace("hate", "love");
		newSentence = newSentence.replace("night", "day");
		return ("The line of text to be changed is:\n" + sentence + "\nI have rephrased that line to read: \n"
				+ newSentence);
	}

}
