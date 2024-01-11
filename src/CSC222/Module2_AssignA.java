package CSC222;

import java.util.Scanner;

public class Module2_AssignA 
{
	private static Scanner keyboard = new Scanner(System.in);
	
	public static void main (String[] args)
	{
		twoStrings();
		System.out.println("-----------------");
		convertHate();
		System.out.println("-----------------");
		madLibs();
		System.out.println("-----------------");
		waterWell();
		System.out.println("-----------------");
		calories();
		System.out.println("-----------------");

	}

	public static void twoStrings ()
	{
		/*
		 * Write a method that reads two strings from the user’s keyboard. Display each string, 
		 * along with its width, on two separate lines. Then create a new string by joining the
		 * two strings with a space between them. Display the new string and its length on a 
		 * new separate line.
		 */
		
		System.out.println("Enter String 1:");
		String str1 = keyboard.nextLine();
		
		System.out.println("Enter String 2:");
		String str2 = keyboard.nextLine();
		
		int str1Length = str1.length();
		int str2Length = str2.length();
		
		System.out.println("String 1 Length: " + str1Length);
		System.out.println("String 2 Length: " + str2Length);
		
		System.out.println("New String: " + str1 + " " + str2);
		int newStrLength = str1Length + str2Length;
		System.out.println("New String Length: " + newStrLength);
		
		
	}
	
	public static void convertHate()
	{
		/*
		 * Write a method that reads a line of text from the keyboard and then displays the
		 * line, but with the FIRST occurrence of hate changed to love. 
		 */
		
		System.out.println("Enter a line of text:");
		String sentence = keyboard.nextLine();
		String newSentence = sentence;
		if (sentence.indexOf("hate") > 0)
		{
			newSentence = newSentence.substring(0, sentence.indexOf("hate")) + "love" 
					+ newSentence.substring(sentence.indexOf("hate") + 4, sentence.length());
			System.out.println ("I have rephrased that line to say:");
			System.out.println(newSentence);
		}
		else
		{
			System.out.println ("I have NOT rephrased that line and it is:");
			System.out.println(newSentence);

		}
		//newSentence = sentence.replace("hate", "love"); This replaces ALL hate
		
		

	}
	
	public static void madLibs ()
	{
		/*
		 * Write a method that asks the user to enter a favorite color, a favorite food, a 
		 * favorite animal, and the first name of a friend or relative. The program should 
		 * then print the following two lines, with the user’s input replacing the items in 
		 * italics: I had a dream that Name ate a Color Animal and said it tasted like Food!
		 */
		
		System.out.println("Enter favorite color:");
		String color = keyboard.nextLine();
		
		System.out.println("Enter favorite food:");
		String food = keyboard.nextLine();
		
		System.out.println("Enter favorite animal:");
		String animal = keyboard.nextLine();
		
		System.out.println("First name of a friend or relative:");
		String name = keyboard.nextLine();
		
		System.out.print("I had a dream that " + name + " ate a " + color + " " + animal + " and said it tasted like " + food + "!\n");

	}
	
	public static void waterWell()
	{
		/*
		 * Write a method that allows the user to input the radius of the well casing in 
		 * inches (a typical well will have a 3 inch radius) and the depth of the well in 
		 * feet (assume water will fill this entire depth, although in practice that will not
		 * be true since the static water level will generally be 50 feet or more below the 
		 * ground surface).  The program should output the number of gallons stored in the 
		 * well casing.
		 */
		
		System.out.println("Enter radius of the well (inch): ");
		double radius = keyboard.nextDouble();
		System.out.println("Enter depth of the well (feet): ");
		double depth = keyboard.nextDouble();
		
		//convert radius to cubic foot
		radius = radius / 12;
		
		double volume = Math.PI * radius * radius * depth;
		
		//convert volume to gallons
		volume = volume * 7.48;
		
		
		System.out.println("Volume (gallons): " + volume);
		
		if (volume >= 250)
		{
			System.out.println("This is enough water for a family of 4 and there is no need to "
					+ "install a separate holding tank.");
		}
		else
		{
			System.out.println("This is not enough water for a family of 4 and you should "
					+ "install a separate holding tank.");
		}

	}

	public static void calories()
	{
		/*
		 * Write a method that allows the user to input their weight in pounds, height 
		 * in inches, and age in years.  The program should then output the number of 
		 * chocolate bars that should be consumed to maintain one’s weight for both a
		 *  woman and a man of the input weight, height, and age.
		 *  
		 *  A typical chocolate bar will contain around 230 calories.
		 */
		
		System.out.println("Input Weight (lbs): ");
		double weight = keyboard.nextDouble();
		System.out.println("Insert Height (inch): ");
		double height = keyboard.nextDouble();
		System.out.println("Insert age (years): ");
		int age = keyboard.nextInt();
	
		
		double BMRMale = 0.0;
		double BMRFemale = 0.0;
		
		BMRFemale = 655 + (4.3 * weight) + (4.7 * height) - (4.7 * age);
		BMRMale = 66 + (6.3 * weight) + (12.9 * height) - (6.8 * age);
		
		double numOfChocoBarsMale = BMRMale / 230;
		double numOfChocoBarsFemale = BMRFemale / 230;
		
		System.out.println("Number of Chocolate Bars able to be eated by FEMALES to maintain one’s weight: " + numOfChocoBarsFemale);
		System.out.println("Number of Chocolate Bars able to be eated by MALES to maintain one’s weight: " + numOfChocoBarsMale);

	}
}
