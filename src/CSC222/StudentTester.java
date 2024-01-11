package CSC222;

//Mya Taheri CSC 222 11/6/22
//Module 6: Coding Assignment 

public class StudentTester 
{
	public static void main (String[] args)
	{
		//Test Constructors
		Student s1 = new Student();
		Student s2 = new Student ("Ferb Flynn", 92.4);
		
		//Test getName()
		System.out.println("Method: getName()");
		System.out.println("Expected: unknown");
		System.out.println(s1.getName());
						
		System.out.println("------");
		
		//Test getTestScore()
		System.out.println("Method: getName()");
		System.out.println("Expected: 92.4");
		System.out.println(s2.getTestScore());
						
		System.out.println("------");
		
		//Test setName()
		System.out.println("Method: setName()");
		System.out.println("Expected: Candice Flynn");
		s1.setName("Candice Flynn");
		System.out.println(s1.getName());
						
		System.out.println("------");
		
		//Test setTestScore()
		System.out.println("Method: setTestScore()");
		System.out.println("Expected: 68.7");
		s1.setTestScore(68.7);
		System.out.println(s1.getTestScore());
						
		System.out.println("------");
		
		//Test setTestScore()
		System.out.println("Method: setTestScore()");
		System.out.println("Expected: error");
		s1.setTestScore(-20);
		//ENTER 68.7
		System.out.println(s1.getTestScore());
						
		System.out.println("------");
		
		
		//Test writeOuput()
		System.out.println("Method: writeOuput()");
		System.out.println("Expected: Ferb Flynn /n 92.4");
		s2.writeOutput();
						
		System.out.println("------");
		
		
		
		//Test readInput()
		System.out.println("Method: readInput()");
		//ENTER Phineas Flynn, 99.8
		System.out.println("Expected: Phineas Flynn /n 99.8");
		s1.readInput();
		s1.writeOutput();
						
		System.out.println("------");
		
		
	}
}
