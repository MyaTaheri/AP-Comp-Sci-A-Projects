package CSC222;

//Mya Taheri CSC 222 11/12/22
//Module 6: Coding Assignment 

public class Time 
{
	private int hour;
	private int minute;
	
	public Time() 
	{
		this.hour = 0;
		this.minute = 0;
	}
	
	//Precondition: Hour is between 0-23 (inclusive) and minute is between 0-59 (inclusive)
	//Postcondition:
	public Time(int hour, int minute) 
	{
		if ((hour >= 0) && (hour <= 23))
			this.hour = hour;
		if ((minute >= 0) && (minute  <= 59))
			this.minute = minute;	
	}
		
	//Precondition: Hour is between 0-11 (inclusive) and minute is between 0-59 (inclusive)
	//Postcondition:
	public Time (int hour, int minute, boolean isAM)
	{
		if ((hour >= 0) && (hour <= 11))
			this.hour = hour;
		if ((minute >= 0) && (minute  <= 59))
			this.minute = minute;	
		if (!isAM)
			this.hour = this.hour + 12;
	}
	
	//Precondition: Checks if hour is between 0-23 (inclusive) and minute is between 0-59 (inclusive)
	//Postcondition: none
	public boolean isValid (int hour, int minute)
	{
		if (((hour >= 0) && (hour <= 23)) && ((minute >= 0) && (minute  <= 59)))
			return true;
		else 
			return false;	
	}
	
	//Precondition: Hour is between 0-23 (inclusive) and minute is between 0-59 (inclusive)
	//Postcondition: none
	//Instance variables updated
	public void setTime(int hour, int minute) 
	{
		if ((hour >= 0) && (hour <= 23))				
			this.hour = hour;
		if ((minute >= 0) && (minute  <= 59))
			this.minute = minute;	
	}
	
	//Precondition: Hour is between 0-11 (inclusive) and minute is between 0-59 (inclusive)
	//Postcondition: none
	//Instance variables updated
	public void setTime (int hour, int minute, boolean isAM)
	{
		if ((hour >= 0) && (hour <= 11))				
			this.hour = hour;
		if ((minute >= 0) && (minute  <= 59))
			this.minute = minute;	
		if (!isAM)
			this.hour = this.hour + 12;
	}
	
	//Precondition: none
	//Postcondition: none
	public void getTime24 ()
	{
		if (hour < 10)
		{
			System.out.print("0" + hour);
		}
		else
		{
			System.out.print(hour);
		}
		
		if (minute < 10)
		{
			System.out.print("0" + minute);
		}
		else
		{
			System.out.print(minute);
		}
		System.out.println();
	}
	
	//Precondition: none
	//Postcondition: none
	public void getTime12 ()
	{		
		//is AM
		if (hour < 12)
		{
			if (minute < 10)
				System.out.println(hour + ":0" + minute + " am");
			else
				System.out.println(hour + ":" + minute + " am");
		}
		//isPM
		else
		{
			if (minute < 10)
				System.out.println((hour-12) + ":0" + minute + " pm");
			else
				System.out.println((hour-12) + ":" + minute + " pm");
		}
	}
}
