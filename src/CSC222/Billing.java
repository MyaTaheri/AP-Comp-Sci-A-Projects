package CSC222;

import java.util.Scanner;

//Mya Taheri CSC 222 11/25/22
//Module 7: Coding Assignment Class Patient & Billing

public class Billing 
{
	Patient patient;
	Doctor doctor;
	
	public Billing (Patient patient, Doctor doctor)
	{
		this.patient = patient;
		this.doctor = doctor;
	}
	public Billing (Doctor doctor)
	{
		this.doctor = doctor;
	}
	public Billing (Patient patient)
	{
		this.patient = patient;
	}
	public Billing ()
	{
		
	}
	
	public void setDoctor (Doctor newDoctor)
	{
		this.doctor = newDoctor;
	}
	
	public void setPatient (Patient patient)
	{
		this.patient = patient;
	}
	
	//Precondtion: Hour is positive
	//Postcondition: none
	public double totalCost (double hours)
	{
		Scanner scnr = new Scanner (System.in);
		
		while (hours < 0)
		{
			System.out.println("Enter valid age: ");
			hours = scnr.nextInt();
		}
		return this.doctor.getOfficeFee() * hours;
	}
}
