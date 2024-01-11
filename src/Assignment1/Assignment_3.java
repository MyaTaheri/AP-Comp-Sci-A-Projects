package Assignment1;

public class Assignment_3 
{
	public static void main (String[] args)
	{
		
		/*
		 * Take in how many dollars and cents the user has.  
		 * Have the program calculate and display how many quarters, dimes, nickels, and pennies that the user has.
		 */
		
		int dollars = 5;
		int cents = 68;
		int total = dollars * 100 + cents;
		
		
		int numberOfQuarters = total/25;
		total  = total - (numberOfQuarters * 25);
		int numberOfDimes = total/10;
		total = total - (numberOfDimes * 10);
		int numberOfNickels = total/5;
		total = total - (numberOfNickels * 5);
		int numberOfPennies = total/1;
		
		System.out.println("I have $" + dollars + "." + cents);
		System.out.println("This makes up " + numberOfQuarters + " quarters, "+ numberOfDimes + " dimes, "
						 + numberOfNickels + " nickels, and " + numberOfPennies + " pennies." );
		
		
	}

}
