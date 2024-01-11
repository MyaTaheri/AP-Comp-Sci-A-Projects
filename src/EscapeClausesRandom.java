
public class EscapeClausesRandom 
{
	public static void main (String[] args)
	{
	
		//the third child in a
		//family is always the worst
		//the first is the best
		/*
		System.out.println("The third child is a family is the worst.  The first is the best.");
		System.out.println("The third child is a ");
		System.out.println("         family is always the worst.");
		System.out.println("The first is the best");
		*/
		
		
		System.out.println("The third child is a\n\tfamily is always the worst \nthe first is the best");
		System.out.println("\"you miss 100% of the shots you take\"\t-Sarah");
		
		/*
		 * \t = tab
		 * \" = print "
		 * \n = new line
		 */
		
		double num1 = Math.random();
		double num2 = Math.random() * 10;
		double num3 = (int)num2;
		//casting - drops the decimals (truncating)
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		
		
	}
	

}
