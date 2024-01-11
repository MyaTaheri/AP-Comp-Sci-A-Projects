package TicTacToe2;

import java.util.Scanner;

public class TicTacToeGame2 
{
	
//char player = 'X';

	public static void main (String[] args)
	{
		TicTacToeModel bd = new TicTacToeModel();
		bd.setFirstPlayer('X');
		BoardFrame board = new BoardFrame(bd);
		board.init();
		
	}
	
		
	/*
	 TicTacToeGame2 game = new TicTacToeGame2();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Welcome to Tic Tac Toe!");
		System.out.println("Would you like to know how to play?  If this is your first time playing, we recommend you to type Y");

	    String tutorial = scanner.nextLine();
	    if (tutorial.equals("Y"))
	    {
	    	game.tutorial();

	    }
	    
	    boolean isCorrectChar = false;
		   char player = 'X';
		    
		    /*
		    while (!(firstPlayer.equals('X') || firstPlayer.equals('O')))
		    {
		    	System.out.println("Sorry, that isn't a valid player.  Please try again");
		    	System.out.println("Enter first player (X or O):");
		 	    firstPlayer = scanner.nextLine();
		    }
		     
		

		    //Turn sequence:
		    boolean isGameover = false;
		    while (!isGameover)
		    {
			    System.out.println (player + "'s turn");
		    	
		    	int row = 9;
		    	int col = 9;
		    	
		    	boolean isValidMove = false;
			    while(!isValidMove)
			    {
			    	row = game.playerRowInput();
			    	col = game.playerColInput();
			    	isValidMove = bd.isValidMove(player, row, col);
			    	if (!isValidMove)
			    	{
				    	System.out.println("Sorry, that isn't a valid move. Please try again");
			    	}
			    }

			    bd.place(player, row, col);
			  
			    bd.print();
			    
			    if (player == 'X')
			    {
			    	player = 'O';
			    }
			    else if (player == 'O')
			    {
			    	player = 'X';
			    }
			    
			    if(bd.isWinner('X'))
			    {
			    	System.out.println("");
			    	System.out.println("");
			    	System.out.println("X is the Winner!");
			    	isGameover = true;
			    }
			    else if(bd.isWinner('O'))
			    {
			    	System.out.println("");
			    	System.out.println("");

			    	System.out.println("O is the Winner!");
			    	isGameover = true;
			    }
			    else if (bd.isTie())
			    {
			    	System.out.println("");
			    	System.out.println("");

			    	System.out.println("It is a tie");
			    	isGameover = true;
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
				System.out.println("Colomn:");
				String stringCol = scanner.nextLine();
			    return Integer.parseInt(stringCol);
			}
			
			
				
			public void tutorial()
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
	 */

		
	}
	
