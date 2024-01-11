package CSC222;


import java.util.Scanner;

//Mya Taheri CSC 222 11/20/22
//Module 7: Coding Assignment Class Doctor

public class Doctor extends Person 
{
	protected String speciality;
	protected double officeFee;	
	
	//Default case:
	public Doctor()
	{
		this.speciality = "speciality";
		this.officeFee = 0;
	}
	
	public Doctor(String speciality, double officeFee)
	{
		Scanner scnr = new Scanner (System.in);
		
		this.speciality = speciality;
		this.officeFee = officeFee;
		
		while (officeFee < 0)
		{
			System.out.println("Enter (postive) office fee: ");
			officeFee = scnr.nextDouble();
			this.officeFee = officeFee;
		}
	}
	
	public Doctor(String speciality)
	{
		this.speciality = speciality;
		this.officeFee = 0;
	}
	
	public Doctor(double officeFee)
	{
		
		Scanner scnr = new Scanner (System.in);

		this.speciality = "speciality";
		this.officeFee = officeFee;
		
		while (officeFee < 0)
		{
			System.out.println("Enter (postive) office fee: ");
			officeFee = scnr.nextDouble();
			this.officeFee = officeFee;
		}
	}
	

	//Precondition: newOfficeFee must be defined and positive
	//Postcondition: Instance variable is updated
	public void setOfficeFee(double newOfficeFee)
	{
		Scanner scnr = new Scanner (System.in);
		
		this.officeFee= newOfficeFee;
		
		while (officeFee < 0)
		{
			System.out.println("Enter (postive) office fee: ");
			officeFee = scnr.nextDouble();
			this.officeFee = officeFee;
		}
	}
		
	//Precondition: newSpeciality must be defined
	//Postcondition: Instance variable is updated
	public void setSpeciality (String newSpeciality)
	{
		
		this.speciality= newSpeciality;
	}
	
	//Precondition: none
	//Postcondition: Instance variable is returned
	public String getSpeciality()
	{
		return this.speciality;
	}
	
	//Precondition: none
	//Postcondition: Instance variable is returned
	public double getOfficeFee()
	{
		return this.officeFee;
	}
	
	//Precondition: newDocotr is defined
	//Postcondition: Returns if name, age, officeFee, and speciality matches newDoctor
	public boolean equals (Doctor newDoctor)
	{
		//Name & speciality are the same despite capilitziation
		return (newDoctor.getName().equalsIgnoreCase(getName())) 
				&& (newDoctor.getAge() == getAge() 
				&& (newDoctor.getOfficeFee() == getOfficeFee()) 
				&& newDoctor.getSpeciality().equalsIgnoreCase(getSpeciality()));
	}
		
}
