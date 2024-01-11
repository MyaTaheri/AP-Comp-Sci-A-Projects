package TicTacToe2;

public class TicTacToeModel 

{

	private char player;
	private char[][] board = {{' ', ' ', ' '}, {' ', ' ', ' '}, {' ', ' ', ' '}};

	public TicTacToeModel()
	{
	}

	public boolean isValidMove(int row, int col)
	{
		boolean isValidMove = ((0 < row) && (row < 4)) && 				//isRowInside
				 	          ((0 < col) && (col < 4)) && 				//isColInside
				 	          (getGameStatus() == 'N') &&				//isGameOver
				              (freeSpace(row, col));				    //isSpaceFree
		return isValidMove;
	}

	public void setFirstPlayer(char firstPlayer)
	{
		this.player = firstPlayer;
	}

	public boolean freeSpace(int row, int col)
	{
		
		return getMove(row,col) == ' ';
	}
	
	public String toString()
	{
		String string1 = "";
		
		string1 = string1 + "  " + board[0][0] + "  |" + "  " +  board[0][1] + "  |  " + board[0][2] + "  " + "\n";
		string1 = string1 + " --------------" + "\n";
		string1 = string1 + "  " + board[1][0] + "  |" + "  " +  board[1][1] + "  |  " + board[1][2] + "  " + "\n";
		string1 = string1 + " --------------"+ "\n";
		string1 = string1 + "  " + board[2][0] + "  |" + "  " +  board[2][1] + "  |  " + board[2][2] + "  " + "\n";

		return string1;
	}
	
	public char getPlayer ()
	{
		return this.player;
	}
	
	public char getMove(int row, int col)
	{
		return board[row - 1][col - 1];
	}
	public void setMove (int row, int col)
	{
		if(isValidMove(row, col))
		{
		
			board[row-1][col-1] = this.player;
		
			if (this.player == 'X')

			{
				this.player = 'O';
			}

			else

			{
				this.player = 'X';
			}

		}
		//Else: Do nothing.  If invalid move don't place the move.
		
	}


	public boolean isWinner (char player)
	{
		boolean isWinner = false;
		
		if(isRowWinner(0, player) || isRowWinner(1, player) || isRowWinner(2, player) ||
		   isColWinner(0, player) || isColWinner(1, player) || isColWinner(2, player) ||
		   isDiagWinner(player))

		{

			isWinner = true;

		}

		return isWinner;

		}

		private boolean isRowWinner(int row, char player)

		{

			boolean isRowWinner = false;

			isRowWinner = (board[row][0] == board[row][1]) && (board[row][0] == board[row][2] && (board[row][0] == player));

			return isRowWinner;

		}

		private boolean isColWinner (int col, char player)
		{

			boolean isColWinner = false;
			isColWinner = ((board[0][col] == board[1][col])&& (board[0][col]==board[2][col]) && (board[0][col] == player));
			return isColWinner;

		}

		private boolean isDiagWinner (char player)

		{

			boolean isDiagWinner = false;

			if ((board[0][0] == player) && (board[1][1] == player) && (board [2][2] == player)) 

			{
				isDiagWinner = true;
			}

			else if((board[0][2] == player) && (board[1][1] == player) && (board[2][0] == player))

			{
				isDiagWinner = true;
			}

			else

			{
				isDiagWinner = false;
			}

			return isDiagWinner;

		}

		

		public char getGameStatus()

		{
			// N = no winner
			// X = X won
			// O = O won
			// T = Tie


			char winner = 'N';

			if (isWinner('X'))
			{
				winner = 'X';
			}
			if (isWinner('O'))
			{
				winner = 'O';
			}
			else if (isTie())
			{
				winner = 'T';
			}	
			//Else: winner = 'N' by default
	
			return winner;

		}


		public boolean isTie()

		{
			boolean isTie = false;
			boolean isFull = (board[0][0] != ' ') && (board[0][1] != ' ') && (board[0][2] != ' ') &&
							 (board[1][0] != ' ') && (board[1][1] != ' ') && (board[1][2] != ' ') && 
							 (board[2][0] != ' ') && (board[2][1] != ' ') && (board[2][2] != ' ');

			isTie = isFull && !isWinner('X') && !isWinner('O');

			return isTie;
			
			//true = it is Tie
			//false = it is NOT a tie
	
			// 2 conditions to be called a tie
			//1. no more spaces
			//2. no winner

		}

}