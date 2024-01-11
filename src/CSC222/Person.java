package CSC222;

import java.util.Scanner;

//Mya Taheri CSC 222 10/24/22
//Module 5: Coding Assignment Constructors

public class Person 
{
	//Default cases:
	private String name = "No Name";
	protected int age = 0; 
	
	//Constructors
	public Person()
	{
	}
	public Person(String name, int age)
	{
		Scanner scnr = new Scanner (System.in);

		this.name = name;
		this.age = age;
		
		while (age < 0)
		{
			System.out.println("Enter valid age: ");
			age = scnr.nextInt();
			this.age = age;
		}
	}
	public Person(String name)
	{
		this.name = name;
	}
	public Person(int age)
	{
		Scanner scnr = new Scanner (System.in);

		this.age = age;
		while (age < 0)
		{
			System.out.println("Enter valid age: ");
			age = scnr.nextInt();
			this.age = age;
		}
	}
	
	//Methods
	
	//Precondition: none
	//Postcondition: user will be prompted for the name and age of the person
	public void read()
	{
		Scanner scnr = new Scanner (System.in);
		System.out.println("Enter age: ");
		age = scnr.nextInt();
		
		while (age < 0)
		{
			System.out.println("Enter valid age: ");
			age = scnr.nextInt();
			this.age = age;
		}
		
		System.out.println("Enter name: ");
		name = scnr.nextLine();	
		
	}
	
	//Precondition: newName must be defined
	//Postcondition: Instance variable is updated
	public void setName (String newName)
	{
		
		name = newName;
	}
	
	//Precondition: newAge must be defined and positive
	//Postcondition: Instance variable is updated
	public void setAge(int newAge)
	{
		
		Scanner scnr = new Scanner (System.in);

		age = newAge;
		while (age < 0)
		{
			System.out.println("Enter valid age: ");
			age = scnr.nextInt();
			this.age = age;
		}
		
	}
	//Precondition: newName and newAge must be defined
	//Postcondition: Instance variable is updated 
	public void setPerson(String newName, int newAge)
	{	
		name = newName;
		age = newAge;
	}

	//Precondition: none
	//Postcondition: Instance variable is returned
	public String getName()
	{
		return this.name;
	}
	
	//Precondition: none
	//Postcondition: Instance variable is returned
	public int getAge()
	{
		return this.age;
	}

	//Precondition: newPerson is defined
	//Postcondition: Returns if name and age matches newPerson
	public boolean equals (Person newPerson)
	{
		//Name are the same despite capilitziation
		return (newPerson.getName().equalsIgnoreCase(getName())) && (newPerson.getAge() == getAge());
	}
	
	//Precondition: newPerson is defined
	//Postcondition: Returns if name matches newPerson
	public boolean hasSameName (Person newPerson)
	{
		//Name are the same despite capilitziation
		return (newPerson.getName().equalsIgnoreCase(getName()));
	}
	
	//Precondition: newPerson is defined and age is positive
	//Postcondition: Returns if age matches newPerson
	public boolean hasSameAge (Person newPerson)
	{
		return (newPerson.getAge() == getAge());
	}
	
	//Precondition: newPerson is defined and age is positive
	//Postcondition: Returns if age is greater than newPerson
	public boolean isOlderThan (Person newPerson)
	{
		return (newPerson.getAge() < getAge());
	}
}
