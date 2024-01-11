package CSC222;

//Mya Taheri CSC 222 11/12/22
//Module 6: Coding Assignment 

public class TestReporter 
{
	private double highestScore;
	private double averageScore;
	private Student[] ourClass =  new Student[0];
	private int numOfStudents;
	
	//Precondition: Need at least one student in the class
	//Postcondition:
	public TestReporter()
	{
		highestScore = -1;
		averageScore = -1;
		numOfStudents = ourClass.length;
	}
	
	//Precondition:
	//Postcondition:
	public int getNumOfStudents()
	{
		numOfStudents = ourClass.length;
		return numOfStudents;
	}
	
	//Precondition:
	//Postcondition:
	public void addStudent (Student newStudent)
	{			
		ourClass = enlargeArrLength(ourClass);
		numOfStudents = ourClass.length;
		ourClass[numOfStudents - 1] = newStudent;
	}
	
	//Precondition:
	//Postcondition:
	public void setNameOfStudent(Student s, String newName)
	{
		s.setName(newName);
	}
	
	//Precondition:
	//Postcondition:
	public void setScoreOfStudent(Student s, double newScore)
	{
		s.setTestScore(newScore);
	}
	
	//Precondition:
	//Postcondition:
	public void findStats()
	{
		//highest:
		highestScore = ourClass[0].getTestScore();
		
		for (int i = 0; i < ourClass.length; i++)
		{
			if (ourClass[i].getTestScore() > highestScore)
				highestScore = ourClass[i].getTestScore();
		}
		
		//highest:
		
		averageScore = 0;
		
		for (int i = 0; i < ourClass.length; i++)
		{
			averageScore = averageScore + ourClass[i].getTestScore();
		}
		
		averageScore = averageScore / ourClass.length;
	}
	
	//Precondition:
	//Postcondition:
	public double getAverage()
	{
		return averageScore;
	}
	
	//Precondition:
	//Postcondition:
	public double getHighest()
	{
		return highestScore;
	}
	
	//Precondition:
	//Postcondition:
	public boolean isHigherThanAverage(Student s)
	{
		findStats();
		if (averageScore < s.getTestScore())
			return true;
		else
			return false;
	}
	
	//Precondition: arr is defined
	//Postcondition:
	private Student[] enlargeArrLength(Student[] arr)
	{
		Student[] newArr = new Student[arr.length + 1];
		
		for (int i = 0; i < arr.length; i++)
		{
			newArr[i] = arr[i];
		}
		
		return newArr;
	}
}
