package CSC222;

//Mya Taheri CSC 222 11/25/22
//Module 7: Coding Assignment Class Patient & Billing

public class Patient extends Person
{
	private String idNum;
	
	public Patient (String idNum, String name)
	{
		this.name = name;
		this.idNum = idNum;
	}
	
	public Patient (String idNum)
	{
		this.idNum = idNum;
	}
	
	public Patient ()
	{
		this.idNum = "DNE";
	}
	
	public void setIdNum(String newId)
	{
		this.idNum = newId;
	}
	
	public String getIdNum()
	{
		return idNum;
	}
	
	
	//Precondition: All variables are defined
	//Postcondition: Returns if the 2 patients are equal
	public boolean equals (Patient patient)
	{
		//Name are the same despite capilitziation
		return (patient.getName().equalsIgnoreCase(getName())) 
				&& (patient.getAge() == getAge() 
				&& (patient.getIdNum() == getIdNum()));
		}
}
