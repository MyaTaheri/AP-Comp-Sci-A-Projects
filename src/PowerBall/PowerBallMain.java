package PowerBall;

public class PowerBallMain 
{
	public static void main (String[] args)
	{
		PowerBall dean = new PowerBall(5,1);
		//let the user select 6 numbers in an array
		dean.selectUserNumbers();
		//the computer randomly selects the 6 winning numbers in a 2nd array
		dean.selectWinningNumbers();
		//put both arrays in order
		dean.sortNumbers();
		//count how many numbers are correct
		dean.checkForWin();
		//return a winning/losing sentence
		dean.announcePrize();
	}

}
