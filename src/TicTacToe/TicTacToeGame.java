package TicTacToe;
import java.util.Scanner;

import TicTacToe2.TicTacToeModel;

public class TicTacToeGame {
	
	//Starting sequence:
	// "Would you like to know how to play? Y or N"
	//"Enter first player (X or O):"
	
	//turn(repeated over and over):
	//
	//1. If yes where do you want to place? (place) 
	//2. Check if it is a Valid Move?	(isMoveValid)
	//2.5 Go to step 2 if not valid move? 	(recall place())
	//3. Print board (Tic Tac Toe Board) (print)
	//4. Check if there is winner.  If yes, end game.  If no, repeat turn for player O (isWinner)
	//5. Is there still space on the board? If not declare tie (isTie)
	
	//Once Winner is declared:
	//Would you like to replay? (shouldReplay)
	
	//	States of the board
	// No Winner - Empty
	// Winner - X 
	// Winner - O
	// No winner - Semi-Full
	// Tie
	
	
	//all to be in main method:
	//TicTacToeGame game = new TicTacToeGame();

	//game.run();

	private TicTacToeModel model = new TicTacToeModel();

	public static void main (String[] args)
	{		
		TicTacToeGame game = new TicTacToeGame();
		game.run();
	}
	
	public void run()
	{
				
		char player = 'N';
		Scanner scanner = new Scanner(System.in);
		System.out.println("Welcome to Tic Tac Toe!");
		System.out.println("Would you like to know how to play?  If this is your first time playing, we recommend you to type Y");

	    String tutorial = scanner.nextLine();
	    if (tutorial.equalsIgnoreCase("Y"))
	    {
	    	tutorial();

	    }
	   
	   
	   boolean isCorrectChar = false;
	   
	    while (!isCorrectChar)
	    {
	    	System.out.println("Enter first player (X or O):");
	 	    player = scanner.nextLine().charAt(0);
	 	    isCorrectChar = (player =='X' || player == 'O');
	    	if(!isCorrectChar)
	    	{
	    		System.out.println("Sorry, that isn't a valid player.  Please try again");
	    	}
	 	  
	    }
	    model.setFirstPlayer(player);
	    

	    //Turn sequence:
	    while (model.getGameStatus() == 'N')
	    {
		    System.out.println (model.getPlayer() + "'s turn");
		    	    	
	    	int row = 9;
	    	int col = 9;
	    	
	    	boolean isValidMove = false;
		    while(!isValidMove)
		    {
		    	row = playerRowInput();
		    	col = playerColInput();
		    	isValidMove = model.isValidMove(row, col);
		    	if (!isValidMove)
		    	{
			    	System.out.println("Sorry, that isn't a valid move. Please try again");
		    	}
		    }

		    model.setMove(row, col);
		  
		    System.out.println(model);
		    
		   
		    if(model.isWinner('X'))
		    {
		    	System.out.println("");
		    	System.out.println("");
		    	System.out.println("X is the Winner!");
		    }
		    else if(model.isWinner('O'))
		    {
		    	System.out.println("");
		    	System.out.println("");

		    	System.out.println("O is the Winner!");
		    }
		    else if (model.isTie())
		    {
		    	System.out.println("");
		    	System.out.println("");
		    	System.out.println("It is a tie");
		    }
	    }
	}
	
	public int playerRowInput()
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Row: ");
	    String stringRow = scanner.nextLine();	    
	    return Integer.parseInt(stringRow);
	}
	
	public int playerColInput()
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Column:");
		String stringCol = scanner.nextLine();
	    return Integer.parseInt(stringCol);
	}
	
	
		
	public void tutorial ()
		{	
			System.out.println("");
			System.out.println("HOW TO PLAY TIC TAC TOE:");
			System.out.println("");
			System.out.println("The goal of the game is to beat your opponent.");
	    	System.out.println("Each player picks a symbol to represent them either Xs or Os.");
	    	System.out.println("Alternating turns each player picks one empty space and");
	    	System.out.println("writes their symbol in it.  The first player to get ");
	    	System.out.println("three in a row horizontally, vertically, diagonally.");
	    	System.out.println( "If no one wins after the board if full the game is declared a tie");
			System.out.println("");
			System.out.println("");

	    	System.out.println("HOW TO PlACE YOUR PIECE IN THIS GAME:");
			System.out.println("");
			System.out.println("You will be asked your row and your column of ");
			System.out.println("where you would like to play your piece");
			System.out.println("You can refrence the diagram below on how to answer");
			System.out.println("");
			System.out.println("");
			System.out.println("");			
			System.out.println ("  " + "R1, C1" + "  |" + "  " +  "R1, C2" + "  |  " + "R1, C3" + "  ");
			System.out.println (" -------------------------------");
			System.out.println ("  " + "R2, C1" + "  |" + "  " +  "R2, C2 "+ "  |  " + "R2, C3" + "  ");
			System.out.println (" -------------------------------");
			System.out.println ("  " + "R3, C1" + "  |" + "  " +  "R3, C2" + "  |  " + "R3, C3" + "  ");
			System.out.println("");
			System.out.println("");

	    	System.out.println( "__________________________________________________");
	    	System.out.println("");
			System.out.println("");

		}
	
	private void print()
	{
		System.out.println(model);
		//system.out.println "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n";

	}
	

}
