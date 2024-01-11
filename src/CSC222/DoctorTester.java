package CSC222;

//Mya Taheri CSC 222 11/20/22
//Module 7: Coding Assignment Class Doctor

public class DoctorTester
{
	public static void main (String[] args)
	{
		//-----------------------------
		//Test Constructors
		//-----------------------------

		Doctor person1 = new Doctor();
		Doctor person2 = new Doctor(-27);
		//When error occurs, enter 27
		Doctor person3 = new Doctor("Kids");
		Doctor person4 = new Doctor("Bone", 19.0);
		
				
			
		//-----------------------------
		//Test Methods
		//-----------------------------

		
		//Test getOfficeFee()  
		System.out.println("Method: getOfficeFee()");
		System.out.println("Expected: 19.0");	
		System.out.println(person4.getOfficeFee());
																				
		System.out.println("------");
		
		//Test setOfficeFee() > invalid argument
		System.out.println("Method: setOfficeFee()");
		System.out.println("Expected: 78.2");	
		person1.setOfficeFee(-78.2);
		//When occurs, enter 78.2
		System.out.println(person1.getOfficeFee());

												
		System.out.println("------");
			
		//Test setOfficeFee() > valid argument
		System.out.println("Method: setOfficeFee()");
		System.out.println("Expected: 87.2086");	
		person3.setOfficeFee(87.2086);
		System.out.println(person3.getOfficeFee());
														
		System.out.println("------");
		
		//Test getSpecaility()  
		System.out.println("Method: getSpecaility()");
		System.out.println("Expected: Bone");
		System.out.println(person4.getSpeciality());
																				
		System.out.println("------");
		
		//Test setSpecialty()   
		System.out.println("Method: setSpecialty()");
		System.out.println("Expected: General");
		person1.setSpeciality("General");
		System.out.println(person1.getSpeciality());
																
		System.out.println("------");
		
		//Test equals()
		System.out.println("Method: equals()");
		System.out.println("Expected: true");	
		Doctor person5 = new Doctor("Bone", 19.0);
		person5.setAge(21);
		person5.setName("Dr. Fries");
		person4.setAge(21);
		person4.setName("Dr. Fries");
		
		
		System.out.println(person4.equals(person5));

																				
		System.out.println("------");

		//Test equals()
		System.out.println("Method: equals()");
		System.out.println("Expected: false");	
												
		System.out.println(person4.equals(person3));
		
		System.out.println("------");
		
	}
	
	

}
