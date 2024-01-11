package CSC222;

public class PersonAddress
{
	public String firstName;
	public String lastName;
	public String email;
	public String telephoneNum;
	
	public String getFirstName()
	{
		return firstName;
	}
	
	public String getLastName()
	{
		return lastName;
	}
	
	public String getEmail()
	{
		return email;
	}
	
	public String getTelephoneNum()
	{
		return telephoneNum;
	}

	public void setEmail (String newEmail)
	{
		email = newEmail;
	}
	
	
	public void setTelephone (String newTelephoneNum)
	{
		telephoneNum = newTelephoneNum;
	}
	
	public boolean equalsName (PersonAddress anotherPersonAddress)
	{
		String otherPersonsName = anotherPersonAddress.getFirstName() + " " + anotherPersonAddress.getLastName();
		String personName = getFirstName() + " " + getLastName();
		
		return (otherPersonsName.equalsIgnoreCase(personName));

		
	}
}

