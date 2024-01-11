package CSC222;

import java.util.Scanner;

//Mya Taheri CSC 222 11/12/22
//Module 6: Coding Assignment

public class Student 
{
	private String name;
	private double testScore;
	
	public Student()
	{
		//Default Cases:
		name = "unknown";
		testScore = -1.0;
	}
	public Student (String name, double testScore)
	{
		Scanner scnr = new Scanner (System.in);

		this.name = name;
		this.testScore = testScore;
		
		while (testScore < 0)
		{
			System.out.println("Enter valid (postive) test score: ");
			testScore = scnr.nextDouble();
		}
	}
	
	//Precondition: none
	//Postcondition: Instance variable name is updated
	public void setName(String newName)
	{
		name = newName;
	}

	//Precondition: newTestScore must be positive
	//Postcondition: Instance variable testScore is updated
	public void setTestScore(double newTestScore)
	{			
		Scanner scnr = new Scanner (System.in);

		testScore = newTestScore;
		while (testScore < 0)
		{
			System.out.println("Enter valid (postive) test score: ");
			testScore = scnr.nextDouble();
		}
		
	}
	
	//Precondition: newTestScore must be positive
	//Postcondition: Instance variable testScore is updated
	public void readInput()
	{
		Scanner scnr = new Scanner (System.in);
		
		System.out.println("Enter name: ");
		this.name = scnr.nextLine();
		
		System.out.println("Enter test score: ");
		this.testScore = scnr.nextDouble();
		while (testScore < 0)
		{
			System.out.println("Enter valid (postive) test score: ");
			testScore = scnr.nextInt();
		}
	}
	
	//Precondition: none
	//Postcondition: none
	public void writeOutput()
	{
		System.out.println("Name: " + name);
		System.out.println("Test Score: " + testScore);
	}
	
	//Precondition: none
	//Postcondition: none
	public String getName()
	{
		return name;
	}
	
	//Precondition: none
	//Postcondition: none
	public double getTestScore()
	{
		return testScore;
	}

}

