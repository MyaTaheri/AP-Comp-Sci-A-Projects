package CSC222;
//Mya Taheri CSC 222 10/27/22
//Module 5: Coding Assignment Counter
	
public class Counter 
{
	int count = 0;
	
	//Precondition: none
	//Postcondition: Sets count to zero
	public void setCounterZero()
	{
		this.count = 0;
	}
	
	//Precondition: none
	//Postcondition: Adds one to count
	public void increaseCount()
	{
		this.count++;
	}

	//Precondition: count is greater than 0
	//Postcondition: Minus one to count 
	public void decreaseCount()
	{
		if (count > 0)
		{
			this.count--;
		}
	}

	//Precondition: none
	//Postcondition: returns count
	public int getCount()
	{
		return this.count;
	}

	//Precondition: none
	//Postcondition: prints count to the console
	public void printCount()
	{
		System.out.println("Count: " + this.count);
	}


}
