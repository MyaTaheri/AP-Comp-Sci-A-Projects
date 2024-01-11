package Hangman;

import java.util.Random;


public class HangmanModel 
{
	//----------------------------------------------------------------------
	// Constants
	//----------------------------------------------------------------------

	private static final String[] WORDS = {"sushi", "awesome", "jazz", "butter", "horse", "flower","abstract","heater", 
			   "orange", "bear", "ghost", "fox",  "socks", "eye", "wood","science","goldfish",
			   "math","purple","prune","error", "eraser", "marker","love","triangle","owl",
			   "popcorn","fish", "idea", "cube","plant", "elves","eleven", "computer","father",
			   "numbers", "glasses", "notebook", "spoon","printer", "magnet","postcard",
			   "fridge", "cookie","tissue", "pillow","game", "wrap", "marble", "roses", "candle",
			   "elephant","mantel","pencil","skull", "juice", "abode", "map", "man", "aroma", "quirky", "zero"};

	private static final char NO_GUESS_CHAR = ' ';

	//----------------------------------------------------------------------
	// Member Variables
	//----------------------------------------------------------------------
	
	private String word = "";
	
	private char[] guessedLetters = new char[0];
	
	private int step = 0;
	
	private static int DEFAULT_SIZE = 5;
	
	private HangmanViewListener[] listeners = new HangmanViewListener[DEFAULT_SIZE];
	
	private int numListeners = 0;
	
	//----------------------------------------------------------------------
	// Constructors
	//----------------------------------------------------------------------
	
	public HangmanModel()
	{
		// By default initialize the object to no selected word nor guess letters
		word = "";
		guessedLetters = new char[0];
	}
	
	//----------------------------------------------------------------------
	// Public Methods
	//----------------------------------------------------------------------
	
	public void registerView(HangmanViewListener listener)
	{
		
		this.listeners[numListeners] = listener;
		numListeners++;
		
		resize();
	}
	
	public void init()
	{
		// Select a random word
		Random rand = new Random();
		int randomNumber = rand.nextInt(WORDS.length);
		this.word = WORDS[randomNumber];

		
		// Initialize to no letters guess yet
		this.guessedLetters = new char[word.length()];
		
		for (int i = 0; i < word.length(); i++)
		{
			guessedLetters[i] = NO_GUESS_CHAR;
		}
	
	}
	

	public int getWordLength()
	{
		return this.word.length();
	}
	
	public char[] getGuessResults()
	{
		return this.guessedLetters;
	}
	
	public int getStep()
	{
		return this.step;
	}
	
	public int[] getLetterPositions(char letter)
	{
		int[] indexArray = new int[0];
		
		for (int i = 0; i < word.length(); i++)
		{
			if (word.charAt(i)==(letter))
			{
				indexArray = increaseArray(indexArray, i);
			}
			//else: Do nothing
		}
		
		return indexArray;
	
	}

	//----------------------------------------------------------------------
	// Private Methods
	//----------------------------------------------------------------------
		
	
	private void refreshAllViews()
	{
	
		for (int i = 0; i < numListeners; i++)
		{
			listeners[i].refreshView();
		}
	}
	
	private void resize()
	{
		if (numListeners == listeners.length)
		{
			HangmanViewListener[] newListeners = new HangmanViewListener[listeners.length + DEFAULT_SIZE];
			for (int i = 0; i < listeners.length; i++)
			{
				newListeners[i] = listeners[i];				
			}
			
			listeners = newListeners;
		}
	}
	
	private int[] increaseArray (int[] smallerArray, int newInt)
	{
		//i is what you are adding to the array in the first open position
		int smallerArraySize = smallerArray.length;
		
		int[] biggerArray = new int[smallerArraySize + 1];
		
		for (int i = 0; i < smallerArraySize; i++)
		{
			biggerArray[i] = smallerArray[i];
		}
		
		biggerArray[smallerArraySize] = newInt;
		
		return biggerArray;
	}
	
	
	
	public void guess (char c)
	{
		int[] arrayPositions = getLetterPositions(c);
		
		//incorrect guess
		if (arrayPositions.length < 1)
		{
			this.step = this.step + 1;
		}
		//correct guess
		else
		{
			for (int i = 0; i < arrayPositions.length; i++)
			{
				updateGuessResults(arrayPositions[i],c);
			}
		}
		refreshAllViews();

		
	}
	
	public void updateGuessResults(int letterIndex, char letter)
	{
		guessedLetters[letterIndex] = letter;
	}
	
	public String getWord()
	{
		return this.word;
	}
	//create method guess letter
	//button calls hangmanmodel.guessletter
	//print true or false if it is in or not (maybe even location)
	
	//----------------------------------------------------------------------
	// Main Method
	//----------------------------------------------------------------------
	
	public static void main(String[] args) 

	{
		HangmanModel hm = new HangmanModel();
		hm.init();
		int[] intPositionArray = hm.getLetterPositions('e');
		for (int i = 0; i < intPositionArray.length; i++)
		{
			//System.out.println(intPositionArray[i]);
		}
		
	}
	
}


