package Objects;

import java.util.Scanner;

public class AirlineDriver 
{
	public static void main (String[] args)
	{
		String again = "yes";
		Airline customers = new Airline();
		Scanner kb = new Scanner (System.in);
		
		while (again.equalsIgnoreCase("yes"))
		{
			System.out.println("1] Enter in customer information");
			System.out.println("2] Search an airline");
			System.out.println("3] Search a destination");
			System.out.println("4] Search customer");
			System.out.println("5] Remove customer");
			System.out.println("6] Replace customer");
			System.out.println("7] Print out log");
			System.out.println("8] Exit program and lose data");
			int choice = kb.nextInt();
			if (choice == 1)
			{
				customers.addCustomers();
			}
			else if (choice == 2)
			{
				customers.searchAirline();
			}
			else if (choice == 3)
			{
				customers.searchDestination();
			}
			else if (choice == 4)
			{
				customers.searchCustomer();
			}
			else if (choice == 5)
			{
				customers.removeCustomer();
			}
			else if (choice == 6)
			{
				customers.replaceCustomer();
			}
			else if (choice == 7)
			{
				customers.printOut();
			}
			else if (choice == 8)
			{
				again = "no";
			}
			else
			{
				System.out.println("Sorry, that number wasn't an option");
			}
			
			System.out.println("--------------");
		}
		
	}

}
