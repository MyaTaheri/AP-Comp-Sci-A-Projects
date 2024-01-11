package CSC222;

import java.util.Scanner;

//Mya Taheri CSC 222 9/19/22
//Module 2: Coding Assignment B

public class Module2_AssignB {
		
	private static Scanner scnr = new Scanner(System.in);
	
	public static void main(String[] args) 
	{
		
		threeString();
		System.out.println("-----------------");
		sentenceResponse();
		System.out.println("-----------------");
		dateChecker();
		System.out.println("-----------------");
		calorieChecker();
		System.out.println("-----------------");

	}
	
	public static void threeString()
	{
		
		/*
		 * Write a method that reads three strings from the keyboard. Although the strings are in no particular order,
		 *  display the string that would be second if they were arranged lexicographically.
		 */
		
		System.out.println("Enter String 1: ");
		String str1 = scnr.nextLine();
		
		System.out.println("Enter String 2: ");
		String str2 = scnr.nextLine();
		
		System.out.println("Enter String 3: ");
		String str3 = scnr.nextLine();
		
		
		
		if (str1.compareTo(str2) > 0 && str1.compareTo(str3) > 0)
		{
			//str 1 = last in lexicographic order
			if (str2.compareTo(str3) > 0)
			{
				 System.out.println("The second string in lexicographic order: " + str2);
			}
			else
			{
				System.out.println("The second string in lexicographic order: " + str3);
			}
		}
		
		else if (str2.compareTo(str1) > 0 && str2.compareTo(str3) > 0)
		{
			//str 2 = last in lexicographic order
			if (str1.compareTo(str3) > 0)
			{
				 System.out.println("The second string in lexicographic order: " + str1);
			}
			else
			{
				System.out.println("The second string in lexicographic order: " + str3);
			}
		}

		else if (str3.compareTo(str1) > 0 && str3.compareTo(str2) > 0)
		{
			//str 2 = last in lexicographic order
			if (str1.compareTo(str2) > 0)
			{
				 System.out.println("The second string in lexicographic order: " + str1);
			}
			else
			{
				System.out.println("The second string in lexicographic order: " + str2);
			}
		}
	    
		if (str3.equals(str2) || str3.equals(str1))
		{	
			//4 Scenarios:
			/*
			 *  1) str3 = str2 and the order is str3, str2, str1
			 *  2) str3 = str2 and the order is str1, str2, str3
			 *  3) str3 = str1 and the order is str3, str1, str2
			 *  4) str3 = str1 and the order is str2, str1, str3
			 */
			System.out.println("The second string in lexicographic order: " + str3);
		}
		
		else if (str2.equals(str3) || str2.equals(str1))
		{	
			
			System.out.println("The second string in lexicographic order: " + str2);
		}
		
		else if (str1.equals(str2) || str1.equals(str3))
		{	
			
			System.out.println("The second string in lexicographic order: " + str1);
		}
			
		
	}

	public static void sentenceResponse()
	{
		/*
		 * Write a method that reads a one-line sentence as input and then displays the 
		 * following response: 
		 * If the sentence ends with a question mark (?) and the 
		 * input contains an even number of characters, display the word Yes. 
		 * 
		 * If the sentence ends with a question mark and the input contains an odd number of
		 * characters, display the word No. 
		 *  
		 * If the sentence ends with an exclamation point (!), display the word Wow. 
		 * 
		 * In all other cases, display the words You always say followed by the input string 
		 * enclosed in quotes. 
		 * 
		 * Your output should all be on one line. Be sure to note that in the last case, your output must include 
		 * quotation marks around the echoed input string. In all other cases, there are
		 * no quotes in the output. Your program does not have to check the input to 
		 * see that the user has entered a legitimate sentence.
		 */
		
		System.out.println("Enter a one-line sentence: ");
	
		String sentence = scnr.nextLine();
		
		int charCount = sentence.length();
		
		if (sentence.substring(sentence.length()-1).equals("?"))
		{
			if (charCount % 2 == 0)
				System.out.println("Yes");
			else
				System.out.println("No");
		}
		else if (sentence.substring(sentence.length()-1).equals("!"))
		{
			System.out.println("Wow");
		}
		else
		{
			System.out.println("You always say \"" + sentence + "\"");
		}
	}

	public static void dateChecker()
	{
		/*
		 * Write a method that reads a string from the keyboard and tests whether it 
		 * contains a valid date. Display the date and a message that indicates whether
		 * it is valid. If it is not valid, also display a message explaining why it is 
		 * not valid. The input date will have the format mm/dd/yyyy. A valid month value 
		 * mm must be from 1 to 12 (January is 1). The day value dd must be from 1 to a 
		 * value that is appropriate for the given month. September, April, June, and 
		 * November each have 30 days. February has 28 days except for leap years when it 
		 * has 29. The remaining months all have 31 days each. A leap year is any year 
		 * that is divisible by 4 but not divisible by 100 unless it is also divisible by 400.
		 */
		
		System.out.println("Enter date in mm/dd/yyyy format:" );
		String fullDate = scnr.nextLine();
		
		String strMonth = fullDate.substring(0,2);
		int month = Integer.parseInt(strMonth);
		
		String strDay = fullDate.substring(3,5);
		int day = Integer.parseInt(strDay);

		String strYear = fullDate.substring(6);
		int year = Integer.parseInt(strYear);
		
		boolean isValidDate = true;
		
		boolean isLeapYear = false;
		isLeapYear = (year % 4 == 0);
			if (year % 100 == 0)
				isLeapYear = isLeapYear && (year % 400 == 0);
		
		if (year > 0)
		{
			if (month == 1)
			{
				if (day > 31 || day < 0)
				{
					
					System.out.println(fullDate + " is NOT a valid date because they is no " + day + "st in January");
				}
			}
			else if (month == 2)
			{
				if (isLeapYear)
				{
					if (day > 29 || day < 0)
					{
						isValidDate = false;
						System.out.println(fullDate + " is NOT a valid date because they is no " + day + "st in Feburary " + year);
					}
				}
				else
					if (day > 28)
					{
						isValidDate = false;
						System.out.println(fullDate + " is NOT a valid date because they is no " + day + "st in Feburary " + year);
					}
			}
			else if (month == 3)
			{
				if (day > 31 || day < 0)
				{
					isValidDate = false;
					System.out.println(fullDate + " is NOT a valid date because they is no " + day + "st in March");
				}
			}
			else if (month == 4)
			{
				if (day > 30 || day < 0)
				{
					isValidDate = false;
					System.out.println(fullDate + " is NOT a valid date because they is no " + day + "st in April");
				}
			}
			else if (month == 5)
			{
				if (day > 31 || day < 0)
				{
					isValidDate = false;
					System.out.println(fullDate + " is NOT a valid date because they is no " + day + "st in May");
				}
			}
			else if (month == 6)
			{
				if (day > 30 || day < 0)
				{
					isValidDate = false;
					System.out.println(fullDate + " is NOT a valid date because they is no " + day + "st in June");
				}
			}
			else if (month == 7)
			{
				if (day > 31 || day < 0)
				{
					isValidDate = false;
					System.out.println(fullDate + " is NOT a valid date because they is no " + day + "st in July");
				}
			}
			else if (month == 8)
			{
				if (day > 31 || day < 0)
				{
					isValidDate = false;
					System.out.println(fullDate + " is NOT a valid date because they is no " + day + "st in August");
				}
			}
			else if (month == 9)
			{
				if (day > 30 || day < 0)
				{
					isValidDate = false;
					System.out.println(fullDate + " is NOT a valid date because they is no " + day + "st in Septemeber");
				}
			}
			else if (month == 10)
			{
				if (day > 31 || day < 0)
				{
					isValidDate = false;
					System.out.println(fullDate + " is NOT a valid date because they is no " + day + "st in October");
				}
			}
			else if (month == 11)
			{
				if (day > 30 || day < 0)
				{
					isValidDate = false;
					System.out.println(fullDate + " is NOT a valid date because they is no " + day + "st in Novemeber");
				}
			}
			else if (month == 12)
			{
				if (day > 31 || day < 0)
				{
					isValidDate = false;
					System.out.println(fullDate + " is NOT a valid date because they is no " + day + "st in December");
				}
			}
			else
			{
				isValidDate = false;
				System.out.println(fullDate + " is NOT a valid date because you entered an invalid month");
			}
		}
		else
		{
			isValidDate = false;
			System.out.println(fullDate + " is NOT a valid date because you can't have a negative year");

		}
		if (isValidDate)
			System.out.println(fullDate + " is a valid date");
			

	}

	public static void calorieChecker()
	{
		/*
		 * Repeat the calorie counting program from problem 5 in a new method. 
		 * This time ask the user to input the string “M” if the user is a man and 
		 * “W” if the user is a woman.   Use only the male formula to calculate calories 
		 * if “M” is entered and use only the female formula to calculate calories if “W” 
		 * is entered.  Output the number of chocolate bars to consume as before.
		 */
		
		System.out.println("Input Weight (lbs): ");
		double weight = scnr.nextDouble();
		System.out.println("Insert Height (inch): ");
		double height = scnr.nextDouble();
		System.out.println("Insert age (years): ");
		int age = scnr.nextInt();
		System.out.println("Insert gender (M for Males and F for Females): ");
		String gender = scnr.next();
	
		
		double BMR = 0.0;
		
		if (gender.equalsIgnoreCase("m"))
		{
			BMR = 66 + (6.3 * weight) + (12.9 * height) - (6.8 * age);
			BMR = BMR / 230;
			System.out.println("Number of Chocolate Bars able to be eated by MALES to maintain one’s weight: " + BMR);


		}
		else if (gender.equalsIgnoreCase("f"))
		{
			BMR = 655 + (4.3 * weight) + (4.7 * height) - (4.7 * age);
			BMR = BMR / 230;
			System.out.println("Number of Chocolate Bars able to be eated by FEMALES to maintain one’s weight: " + BMR);


		}
		
		
	}

}
