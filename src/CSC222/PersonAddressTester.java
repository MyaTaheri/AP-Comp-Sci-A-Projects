package CSC222;

public class PersonAddressTester
{
	public static void main (String[] args)
	{
		PersonAddress person1 = new PersonAddress();
		person1.firstName = "Alan";
		person1.lastName = "Lee";
		person1.email = "alee@gmail.com";
		person1.telephoneNum = "171-734-1537";
		
		PersonAddress person2 = new PersonAddress();
		person2.firstName = "Jane";
		person2.lastName = "Trevor";
		person2.email = "jtrevor@gmail.com";
		person2.telephoneNum = "684-293-8763";
		
		PersonAddress person3 = new PersonAddress();
		person3.firstName = "Alan";
		person3.lastName = "Lee";
		person3.email = "alee2@gmail.com";
		person3.telephoneNum = "171-734-1538";
		

		
		//Test getFirstName();
		System.out.println("Method: getFirstName()");
		System.out.println("Expected: Alan");
		System.out.println(person1.getFirstName());
		
		System.out.println("------");


		//Test getLastName();
		System.out.println("Method: getLastName()");
		System.out.println("Expected: Trevor");
		System.out.println(person2.getLastName());

		System.out.println("------");

		
		//Test getEmail();
		System.out.println("Method: getEmail()");
		System.out.println("Expected: alee@gmail.com");
		System.out.println(person1.getEmail());

		System.out.println("------");

		
		//Test getTelephoneNumber();
		System.out.println("Method: getTelephoneNum()");
		System.out.println("Expected: 684-293-8763");
		System.out.println(person2.getTelephoneNum());

		System.out.println("------");

		
		//Test setEmail();
		System.out.println("Method: setEmail()");
		System.out.println("Expected: alee2@gmail.com");
		person1.setEmail("alee2@gmail.com");
		System.out.println(person1.getEmail());
		
		System.out.println("------");

		
		//Test setTelphoneNumber();
		System.out.println("Method: setTelephoneNum()");
		System.out.println("Expected: 282-398-1423");
		person1.setTelephone("282-398-1423");
		System.out.println(person1.getTelephoneNum());
		
		System.out.println("------");
		
		
		//Test equalsName();
		System.out.println("Method: equalName()");
		System.out.println("Expected: false");
		System.out.println(person1.equalsName(person2));
		System.out.println("Expected: true");
		System.out.println(person1.equalsName(person3));
		
	}
}
