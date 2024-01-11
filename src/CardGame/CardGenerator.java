package CardGame;

public class CardGenerator 
{
	int numOfCards = 0;
	String[] remainingDeck;

	public CardGenerator(int numOfCards)
	{
		this.numOfCards = numOfCards;
		fillRDeck();
	}
	
	public String[] cards()
	{
		String[] listOfCards = new String[numOfCards];
		/*
		 * Formating for cards: 
		 * 
		 * Number:	 
		 * --------    
		 * Jack = 11						
		 * Queen = 12						
		 * King = 13							
		 * Ace = 1					
		 * 	
		 * Suit:
		 * -----
		 * Diamond = D
		 * Spades = S
		 * Hearts = H
		 * Clubs = C
		 * 
		 * Ex: 10S, 11S
		 */
		
		
		for (int i = 0; i < numOfCards; i++)
		{
			listOfCards[i] = cardNum() + cardSuit();
			if (isNotDrawn())
			{
				removeCardRDeck();
			}
		}
		
		
		return listOfCards;
	}
	private boolean isNotDrawn()
	{
		return true;
	}
	
	
	private void removeCardRDeck()
	{
	}
	
	private String cardNum()
	{
		return Integer.toString(((int)((Math.random()*12)+1)));
			

	}
	
	public void removeList()
	{
		
	}
	
	private void fillRDeck()
	{
		String suit = " ";
		int counter = 0;
		for (int i = 0; i < 4; i++)
		{
			for (int j = 1; j < 14; j++)
			{
				if (i == 0)
				{
					suit = "D";
				}
				else if (i == 1)
				{
					suit = "S";
				}
				else if (i == 2)
				{
					suit = "H";
				}
				else if (i == 3)
				{
					suit = "C";
				}
				
				this.remainingDeck[j + (counter * 13)] = Integer.toString(j) + suit;
			}
			counter++;
		}
	}
	
	private char cardSuit()
	{
		int random = ((int)((Math.random()*3)+1));
		char suit = ' ';
		if (random == 1)
		{
			suit = 'D';
		}
		else if (random == 2)
		{
			suit = 'S';
		}
		else if (random == 3)
		{
			suit = 'H';
		}
		else
		{
			suit = 'C';
		}
		
		return suit;
	}

}

