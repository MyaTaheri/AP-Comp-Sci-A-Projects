package PowerBall;

import java.util.Scanner;

public class PowerBall 
{
	int[] usersNum;
	int[] correctNum;
	int userPowerBall;
	int correctPowerBall;
	String winnings = "nothing";
	
	public PowerBall(int arrSize, int num2)
	{
		this.usersNum = new int[arrSize];
		this.correctNum = new int[arrSize];
	}
	
	public void selectUserNumbers()
	{
		Scanner input = new Scanner (System.in);
		for (int i = 0; i < usersNum.length; i++)
		{
			System.out.println("Enter a number between 1 - 69:");
			usersNum[i] = input.nextInt();
		}
		System.out.println("Enter a number for Power Ball (1-26):");
		userPowerBall = input.nextInt();

	}
	
	public void selectWinningNumbers()
	{
		for (int i = 0; i < correctNum.length; i++)
		{
			correctNum[i] = (int)(Math.random()* 68 + 1);
			
			for (int j = 0; j < i; j++)
			{
				if ((correctNum[i] == correctNum[j]))
				{
					correctNum[i] = (int)(Math.random()* 68 + 1);
				}			
			}
			
		}
		
		correctPowerBall = (int)(Math.random()* 25 + 1);
	}
	
	public void sortNumbers()
	{
		for (int j = 0; j <= correctNum.length; j++)
		{
			for (int i = 0; i < correctNum.length - 1; i++)
			{
				if (correctNum[i] > correctNum[i+1])
				{
					int larger = correctNum[i];
					
					correctNum[i] = correctNum [1+i];
					correctNum[i+1] = larger;		
					
				}
			}
		}
		
		for (int j = 0; j <= usersNum.length; j++)
		{
			for (int i = 0; i < usersNum.length - 1; i++)
			{
				if (usersNum[i] > usersNum[i+1])
				{
					int larger = usersNum[i];
					
					usersNum[i] = usersNum [1+i];
					usersNum[i+1] = larger;		
					
				}
			}
		}
	}
	
	public void checkForWin()
	{
		boolean powerBall = (userPowerBall == correctPowerBall);
		
		int numOfCorrect = 0;
		
		for (int i = 0; i < this.usersNum.length; i++)
		{
			for (int j = 0; j < this.correctNum.length; j++)
			{
				if (this.correctNum[j]==this.usersNum[i])
				{
					numOfCorrect++;
				}
			}
		}
		
		if (powerBall)
		{
			//Matching only the red ball: $4 winnings
			winnings = "$4";
		}
		if (powerBall && numOfCorrect == 1)
		{
			//Matching the red ball and one white ball: $4
			winnings = "$4";
		}
		if (powerBall && numOfCorrect == 2)
		{
			//Matching the red ball and two white balls: $7
			winnings = "$7";
		}
		if (numOfCorrect == 3)
		{
			//Matching three white balls: $7
			winnings = "$7";
		}
		if (powerBall && numOfCorrect == 3)
		{
			//Matching the red ball and three white balls: $100
			winnings = "$100";
		}
		if (numOfCorrect == 4)
		{
			//Matching four white balls: $100
			winnings = "$100";
		}
		if (powerBall && numOfCorrect == 4)
		{
			//Matching the red ball and four white balls: $50,000
			winnings = "$50,000";
		}
		if (numOfCorrect == 5)
		{
			//Matching five white balls: $1,000,000
			winnings = "$1,000,000";
		}
		if (powerBall  && correctNum[0] == usersNum [0]&& correctNum[1] == usersNum [1] && correctNum[2] == usersNum [2] && correctNum[3] == usersNum [3] && correctNum[4] == usersNum [4])
		{
			
			//Matching the red ball and five white balls: Jackpot!
			winnings = "Jackpot!";
		}
	}
	
	public void announcePrize()
	{
		System.out.println("-------");
		System.out.println("USERS numbers:");
		for (int i = 0; i < usersNum.length; i++)
		{
			System.out.print(usersNum[i] + " ");
		}
		System.out.println("Powerball: " + userPowerBall);
		System.out.println();
		System.out.println("WINNING numbers:");
		for (int j = 0; j < correctNum.length; j++)
		{
			System.out.print(correctNum[j] + " ");
		}
		System.out.println("Powerball: " + correctPowerBall);
		System.out.println("-------");
		System.out.println("Winnings: "+ winnings);
	}

}
