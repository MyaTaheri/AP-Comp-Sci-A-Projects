package CSC222;

//Mya Taheri CSC 222 11/12/22
//Module 6: Coding Assignment 

public class TestReporterTester
{
	//Table of Students on UML / planning doc
	
	public static void main (String[] args)
	{
		
		
		Student s1 = new Student ("Dory Fish", 68.2);
		Student s2 = new Student ("Nemo Fish", 95.2);
		Student s3 = new Student ("Marlin Fish", 98.7);
		Student s4 = new Student ("Squirt Turtle", 94.6);
		Student s5 = new Student ("Crush Turtle", 12.3);
		
		TestReporter tr = new TestReporter();
		
		//Test addStudent()
		System.out.println("Method: addStudent()");
		System.out.println("Expected: no output");
		tr.addStudent(s1);
		tr.addStudent(s2);
		tr.addStudent(s3);
		tr.addStudent(s4);
		tr.addStudent(s5);
																
		System.out.println("------");
		
		//Test getNumOfStudents()
		System.out.println("Method: getNumOfStudents()");
		System.out.println("Expected: 5");	
		System.out.println(tr.getNumOfStudents());
		
		System.out.println("------");
				
	
		//Test setNameOfStudent()
		System.out.println("Method: setNameOfStudent()");
		System.out.println("Expected: Bubble Octopus");	
		tr.setNameOfStudent(s5, "Bubble Octopus");
		System.out.println(s5.getName());
														
		System.out.println("------");
				
		//Test setScoreOfStudent()
		System.out.println("Method: setScoreOfStudent()");
		System.out.println("Expected: 33.3");
		tr.setScoreOfStudent(s5, 33.3);
		System.out.println(s5.getTestScore());
														
		System.out.println("------");
				
		//Test findStat()
		System.out.println("Method: findStats()");
		System.out.println("Expected: no ouput");
		tr.findStats();
														
		System.out.println("------");
				
		//Test getAverage()
		System.out.println("Method: getAverage()");
		System.out.println("Expected: 78.0 ");	
		System.out.println(tr.getAverage());
														
		System.out.println("------");
				
		//Test getHighest()
		System.out.println("Method: getHighest()");
		System.out.println("Expected: 98.7");
		System.out.println(tr.getHighest());
														
		System.out.println("------");
				
		//Test isHigherThanAverage()
		System.out.println("Method: isHigherThanAverage()");
		System.out.println("Expected: false ");	
		System.out.println(tr.isHigherThanAverage(s1));

												
		System.out.println("------");

		//Test isHigherThanAverage()
		System.out.println("Method: isHigherThanAverage()");
		System.out.println("Expected: true");	
		System.out.println(tr.isHigherThanAverage(s3));
													
		System.out.println("------");
	}

}
