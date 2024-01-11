package BlackJack;

public class Card 
{
	int cardNumber;
	int intCardSuit;
	String strCardSuit;
	
	//0 = heart
	//1 = diamond
	//2 = spade
	//3 = clover
	
	public Card()
	{
		cardNumber = (int)(Math.random() * 14);
		intCardSuit = (int)(Math.random() * 3);
	}
	
	public int getCardNumber()
	{
		return cardNumber;
	}
	
	public String getCardSuit()
	{
		if (intCardSuit == 0)
		{
			strCardSuit = "diamond";
		}
		else if (intCardSuit == 1)
		{
			strCardSuit = "heart";
		}
		else if (intCardSuit == 2)
		{
			strCardSuit = "spades";
		}
		else if (intCardSuit == 3)
		{
			strCardSuit = "clover";
		}
		
		return strCardSuit;
	}
}

