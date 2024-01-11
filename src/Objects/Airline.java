package Objects;

import java.util.ArrayList;
import java.util.Scanner;

public class Airline 
{
	ArrayList <String> log = new ArrayList();
	
	public void addCustomers() //DONE!
	{
		Scanner kb = new Scanner (System.in);
		System.out.println("Enter Last Name:");
		String name = kb.next();
		log.add(name);
		System.out.println("Enter Airline:");
		String airline = kb.next();
		log.add(airline);
		System.out.println("Enter Destination:");
		String destination = kb.next();
		log.add(destination);
 
	}
	
	public void searchAirline() //DONE!
	{
		Scanner kb = new Scanner (System.in);
		System.out.println("Enter Airline:");
		String airline = kb.next();	
		int location = log.indexOf(airline);
		if (location < 0 || location % 3 != 1)
		{
			System.out.println("Sorry, there is no one flying on the airline " + airline);
		}
		for (int i = 1; i < log.size() - 1; i = i + 3)
		{
			if (airline.equalsIgnoreCase(log.get(i)))
			{
				System.out.println ("Last Name: " + log.get(i-1));
				System.out.println ("Airline: " + log.get(i));
				System.out.println ("Destination: " + log.get(i + 1));
			}
		}
		
	}

	public void searchDestination()  //DONE!
	{
		Scanner kb = new Scanner (System.in);
		System.out.println("Enter Destination:");
		String destination = kb.next();	
		int location = log.indexOf(destination);
		if (location < 0 || location % 3 != 2)
		{
			System.out.println("Sorry, there is no one flying to " + destination);
		}
		for (int i = 2; i < log.size(); i = i + 3)
		{
			if (destination.equalsIgnoreCase(log.get(i)))
			{
				System.out.println ("Last Name: " + log.get(i - 2));
				System.out.println ("Airline: " + log.get(i - 1));
				System.out.println ("Destination: " + log.get(i));
			}
		}
	}

	public void searchCustomer() //DONE!
	{
		Scanner kb = new Scanner (System.in);
		System.out.println("Enter Customer's Last Name:");
		String name = kb.next();	
		int location = log.indexOf(name);
		if (location < 0)
		{
			System.out.println("Sorry, there is no one with the last name of " + name);
		}
		else 
		{
			System.out.println ("Last Name: " + log.get(location));
			System.out.println ("Airline: " + log.get(location + 1));
			System.out.println ("Destination: " + log.get(location + 2));


		}
	}

	public void removeCustomer() //DONE!
	{
		Scanner kb = new Scanner (System.in);
		System.out.println("Enter Customer's Last Name:");
		String name = kb.next();	
		int location = log.indexOf(name);
		if (location < 0)
		{
			System.out.println("Sorry, there is no one with the last name of " + name);
		}
		else 
		{
			log.remove(location);
			log.remove(location + 1);
			log.remove(location + 2);


		}
	}

	public void replaceCustomer()  //DONE!
	{
		Scanner kb = new Scanner (System.in);
		System.out.println("Enter Old Customer's Last Name:");
		String oldName = kb.next();	
		int location = log.indexOf(oldName);
		if (location < 0)
		{
			System.out.println("Sorry, there is no one with the last name of " + oldName);
		}
		else 
		{
			System.out.println("Enter New Customer's Last Name:");
			String newName = kb.next();
			log.set(location,newName);

		}
	}

	public void printOut() //DONE!
	{
		for (int i = 0; i < this.log.size(); i++)
		{
			System.out.print(log.get(i) + ", ");
		}
		System.out.println(log.get(log.size()-1));
	}

	

}
