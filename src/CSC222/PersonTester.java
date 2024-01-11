package CSC222;

public class PersonTester 
{
	public static void main (String[] args)
	{
		//Test Person Constructors
		Person person1 = new Person();
		Person person2 = new Person(27);
		Person person3 = new Person("E");
		Person person4 = new Person("S", 19);
		
		//Test getName()
		System.out.println("Method: getName()");
		System.out.println("Expected: E");
		System.out.println(person3.getName());
		
		System.out.println("------");
		
		//Test getAge()
		System.out.println("Method: getAge()");
		System.out.println("Expected: 27");
		System.out.println(person2.getAge());
		
		
		System.out.println("------");
		
		//Test read()
		System.out.println("Method: read()");
		System.out.println("Expected: inputed age, inputed name");
		person1.read();
		//ENTER "John Doe"
		System.out.println(person1.getAge());
		System.out.println(person1.getName());
		
		System.out.println("------");
		
		//Test setName()
		System.out.println("Method: setName()");
		System.out.println("Expected: N");
		person2.setName("N");
		System.out.println(person2.getName());

		System.out.println("------");
		
		//Test setAge()
		System.out.println("Method: setAge()");
		System.out.println("Expected: 44");
		person3.setAge(44);
		System.out.println(person3.getAge());

		System.out.println("------");
		
		//Test setPerson()
		System.out.println("Method: setPerson()");
		System.out.println("Expected: U 34");
		person3.setPerson("U", 34);
		System.out.println(person3.getName() + " " + person3.getAge());

		System.out.println("------");
		
		//Test equals()
		System.out.println("Method: equals()");
		System.out.println("Expected: false");
		System.out.println(person3.equals(person1));

		Person person5 = new Person("S", 19);
		System.out.println("Method: equals()");
		System.out.println("Expected: true");
		System.out.println(person4.equals(person5));
		System.out.println("------");
		
		//Test hasSameName()
		System.out.println("Method: hasSameName()");
		System.out.println("Expected: false");
		System.out.println(person3.equals(person2));
		
		Person person6 = new Person("S", 23);
		System.out.println("Method: equals()");
		System.out.println("Expected: true");
		System.out.println(person4.equals(person6));
		System.out.println("------");
		
		//Test hasSameAge()
		System.out.println("Method: hasSameAge()");
		System.out.println("Expected: false");
		System.out.println(person2.equals(person1));
		
		Person person7 = new Person("S", 27);
		System.out.println("Method: equals()");
		System.out.println("Expected: true");
		System.out.println(person2.equals(person7));
		System.out.println("------");
		
		//Test isOlder()
		System.out.println("Method: isOlder()");
		System.out.println("Expected: false");
		System.out.println(person1.isOlderThan(person4));
		
		Person person8 = new Person("K", 100);
		System.out.println("Method: isOlder()");
		System.out.println("Expected: true");
		System.out.println(person8.isOlderThan(person3));
		System.out.println("------");

	}

}
