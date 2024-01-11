package Objects;

public class BasketballDriver 
{
	public static void main (String[] args)
	{
		Basketball dustin = new Basketball();
		System.out.println(dustin);
		Basketball nick = new Basketball(.98,14,"Nick");
		System.out.println("\n" + nick + "\n");
		if (dustin.getFreeThrow() > nick.getFreeThrow())
		{
			System.out.println ("Dustin Wins");
		}
		else
		{
			System.out.println ("Nick Wins");
		}
		System.out.println("\nDustin's Points: " + dustin.getPoints());
		System.out.println("Nick's Points: " + nick.getPoints());

	}

}
