package Assignment7;

import java.util.Scanner;

public class Assignment1 
{
	public static void main (String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("What grade are you in?");
		int gradeLevel = input.nextInt();
		
		System.out.println("How may IB/AP classes are you taking?");
		int numIBClass = input.nextInt();
		
		int numIncClass = 1;
		double total = 0;
		
		String again = "Yes";
		
		for (int i = 0; i < numIBClass; i++)
		{
			System.out.println("What grade did you get in IB/AP Course " + numIncClass);
			String gradeIB = input.next();
			
			if (gradeIB.equalsIgnoreCase("A"))
			{
				total = total + 5.00;
			}
			else if (gradeIB.equalsIgnoreCase("B"))
			{
				total = total + 4.00;

			}
			else if (gradeIB.equalsIgnoreCase("C"))
			{
				total = total + 3.00;

			}
			else if (gradeIB.equalsIgnoreCase("D"))
			{
				total = total + 2.00;

			}
			else if (gradeIB.equalsIgnoreCase("F"))
			{
				total = total + 0.00;
			}
			else
			{
				System.out.println("You inputted an incorrect grade.  Please rerun program.");
			}
		
			numIncClass++;
		}	
			numIncClass = 0;
			
			do
			{
				numIncClass++;
				
				System.out.println("What grade did you get in Course " + numIncClass);
				String grade = input.next();
				
				if (grade.equalsIgnoreCase("A"))
				{
					total = total + 4.00;
				}
				else if (grade.equalsIgnoreCase("B"))
				{
					total = total + 3.00;
	
				}
				else if (grade.equalsIgnoreCase("C"))
				{
					total = total + 2.00;
	
				}
				else if (grade.equalsIgnoreCase("D"))
				{
					total = total + 1.00;
	
				}
				else if (grade.equalsIgnoreCase("F"))
				{
					total = total + 0.00;
				}
				else
				{
					System.out.println("You inputted an incorrect grade.  Please rerun program.");
				}
				
				System.out.println("Would you like to input another course?");
				again = input.next();
				
				
			} while (again.equalsIgnoreCase("yes"));
			
			System.out.println("______________");
			System.out.println("Total points earned: " + total);
			int totalClasses = numIncClass + numIBClass;
			System.out.println ("Total number of classes: " + totalClasses);
			double gpa = total/totalClasses;
			System.out.println("GPA: " + gpa);
			
			if (gpa >= 4.0 && gradeLevel == 12)
			{
				System.out.println("Extra Honors: Valedictorian Scholar & NHS Canidate");
			}
			else if (gpa >= 3.5 && gradeLevel >= 11)
			{
				System.out.println("Extra Honors: NHS Canidate");
			}
			else if (gpa >= 3.0 && gradeLevel <= 10)
			{
				System.out.println("Extra Honors: Mustang Scholar");
			}

	}
}
