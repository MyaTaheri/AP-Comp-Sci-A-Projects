package Objects;

public class Basketball 
{
	private double freeThrow;
	private int jersey;
	private String lastName;
	
	public Basketball()
	{
		freeThrow = Math.random();
		jersey = (int)(Math.random() * 70);
		lastName = "Last Name";	
	}
	
	public Basketball(double freeThrow, int jersey, String lastName)
	{
		this.freeThrow = freeThrow;
		this.jersey = jersey;
		this.lastName = lastName;
	}
	
	public String toString()
	{
		return "Free Throw Percent: " + this.freeThrow + "\nJersey Number: " + this.jersey + "\nLast Name: "+ this.lastName;
	}
	
	public double getFreeThrow()
	{
		return freeThrow;
	}
	
	public int getJersey()
	{
		return jersey;
	}
	
	public String getLastName()
	{
		return lastName;
	}
	/*
	 * This method returns the number of points pre-condition:
	 * 		- You must be a basketball player
	 */
	
	public int getPoints()
	{
		int amt = (int)(Math.random()*30);
		if (amt >= 20)
		{
			return 25;
		}
		else if (amt > 10)
		{
			return 15;
		}
		else 
		{
			return 5;
		}
	}
}
