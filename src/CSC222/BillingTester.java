package CSC222;

//Mya Taheri CSC 222 11/25/22
//Module 7: Coding Assignment Class Patient & Billing

public class BillingTester 
{
	public static void main (String[] args)
	{
		Patient patient1 = new Patient ("763241", "John Proctor");
		patient1.setAge(17);
		Doctor doctor1 = new Doctor ("General", 25.71);
		doctor1.setAge(16);
		doctor1.setName("Elizabeth Proctor");
		
		Billing bill1 = new Billing (patient1, doctor1);
		
		Patient patient2 = new Patient ("17849", "Dolly Sheep");
		patient2.setAge(28);
		Doctor doctor2 = new Doctor ("Brain", 58.23);
		doctor2.setAge(76);
		doctor2.setName("Parton Cow");
		
		Billing bill2 = new Billing (patient2, doctor2);
		
		Patient patient3 = new Patient ("7777", "John Proctor");
		patient3.setAge(17);
		
		//----------------------
		// Billing Class Test
		//----------------------
		
		//Test totalIncome()  
		System.out.println("Method: totalCost()");
		System.out.println("Expected: 1700.316 ");
		System.out.println(bill2.totalCost(29.2));
																						
		System.out.println("------");
		
		
		//----------------------
		// Patient Class Test
		//----------------------
		
		//Test setIdNum()  
		System.out.println("Method: setIdNum()");
		System.out.println("Expected: 7777");
		patient1.setIdNum("7777");
		System.out.println(patient1.getIdNum());
																								
		System.out.println("------");
		
		//Test equals()  
		System.out.println("Method: equals()");
		System.out.println("Expected: true  ");
		System.out.println(patient1.equals(patient3));
																										
		System.out.println("------");
		
		//Test equals()  
		System.out.println("Method: equals()");
		System.out.println("Expected: false");
		System.out.println(patient1.equals(patient2));
																												
		System.out.println("------");


		
	}
}
