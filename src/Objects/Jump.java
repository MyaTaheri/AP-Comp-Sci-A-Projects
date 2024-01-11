package Objects;

import java.util.Scanner;

public class Jump 
{
	//global variables- array and amount of students
	Scanner kb = new Scanner (System.in);
	private int amtStudents;
	private int[] jumpHeight;
	
	//constructor (2 arguments)
	public Jump (int amtStudents, String b)
	{
		this.amtStudents = amtStudents;
		this.jumpHeight = new int [amtStudents];
		fillArray();
	}

	//method fills the array
	private void fillArray() 
	{
		for (int k =0; k < jumpHeight.length; k++)
		{
			System.out.println("How high was your jump student " + (k+1));
			int j = kb.nextInt();
			this.jumpHeight[k]=j;
		}
		
	}
	
	
	//method returns the lowest jump
	public int getLowest()
	{
		int lowest = this.jumpHeight[0];
		for (int i = 0; i < jumpHeight.length; i++)
		{
			if (this.jumpHeight[i]<lowest)
				lowest = jumpHeight[i];
		}
	
		return lowest;
	}
	
	//method returns the highest jump
	public int getHighest()
	{
		int highest = this.jumpHeight[0];
		for (int i = 0; i < jumpHeight.length; i++)
		{
			if (this.jumpHeight[i]>highest)
				highest = jumpHeight[i];
		}
	
		return highest;
	}
}
