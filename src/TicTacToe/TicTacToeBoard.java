//
//package TicTacToe;
//
//public class TicTacToeBoard 
//{
//	char[][] board = {{' ', ' ', ' '}, {' ', ' ', ' '}, {' ', ' ', ' '}};
//	public void place (char player, int row, int col)
//	{
//		board[row - 1][col - 1] = player;
//		// x [row?][col?]
//	}
//	
//	public boolean isValidMove(char player, int row, int col)
//	{
//		boolean isValidMove = ((0 < row) && (row < 4)) && 				//isRowInside
//				 	          ((0 < col) && (col < 4)) && 				//isColInside
//				              ((board[row - 1][col - 1] == ' ')) &&		//isSpaceFree
//				              (((player == 'X') || (player == 'O')));	//isCorrectChar
//		return isValidMove;
//		/*
//		 isRowInside = (-1 < row) && (row < 3); 
//		if (isRowInside)
//		{
//			boolean isColInside = (-1 < col) && (col < 3);
//			if(isColInside)
//			{
//				boolean isSpaceFree = board[row - 1][col - 1] == ' ';
//				if (isSpaceFree)
//				{
//					boolean isCorrectChar = (player == 'X') || (player == 'O');
//					if(isCorrectChar)
//					{
//						isValidMove = true;
//					}
//				}
//			}
//		}
//		*/
//		/*
//		if (isRowInside && isColInside)
//		{
//			boolean isSpaceFree = board[row - 1][col - 1] == ' ';
//			boolean isCorrectChar = (player == 'X') || (player == 'O');
//			if (isSpaceFree && isCorrectChar)
//			{
//				isValidMove = true;
//			}
//		}
//		*/
//		
//	}
//	
//	public char check (int row, int col)
//	{
//		//checks what is in a certain position
//		char playertoken = board[row - 1][col -1];
//		return playertoken;
//	}
//	
//	public boolean isWinner (char player)
//	{
//		boolean isWinner = false;
//		
//		if(isRowWinner(0, player) || isRowWinner(1, player) || isRowWinner(2, player) ||
//		   isColWinner(0, player) || isColWinner(1, player) || isColWinner(2, player) ||
//		   isDiagWinner(player))
//		{
//			isWinner = true;
//		}
//		
//		return isWinner;
//		}
//	
//	
//		private boolean isRowWinner(int row, char player)
//		{
//			boolean isRowWinner = false;
//			
//			isRowWinner = (board[row][0] == board[row][1]) && (board[row][0] == board[row][2] && (board[row][0] == player));
//			
//			return isRowWinner;
//		}
//		
//		private boolean isColWinner (int col, char player)
//		{
//			boolean isColWinner = false;
//			isColWinner = ((board[0][col] == board[1][col])&& (board[0][col]==board[2][col]) && (board[0][col] == player));
//			return isColWinner;
//		}
//		private boolean isDiagWinner (char player)
//		{
//			boolean isDiagWinner = false;
//			if ((board[0][0] == player) && (board[1][1] == player) && (board [2][2] == player)) 
//			{
//				isDiagWinner = true;
//			}
//			else if((board[0][2] == player) && (board[1][1] == player) && (board[2][0] == player))
//			{
//				isDiagWinner = true;
//			}
//			else
//			{
//				isDiagWinner = false;
//			}
//			return isDiagWinner;
//		}
//		
//		
//		
//		
//		
//		public boolean isTie()
//		{
//			boolean isTie = false;
//			boolean isFull = (board[0][0] != ' ') && (board[0][1] != ' ') && (board[0][2] != ' ') &&
//							 (board[1][0] != ' ') && (board[1][1] != ' ') && (board[1][2] != ' ') && 
//							 (board[2][0] != ' ') && (board[2][1] != ' ') && (board[2][2] != ' ');
//			isTie = isFull && !isWinner('X') && !isWinner('O');
//			return isTie;
//			//true = it is Tie
//			//false = it is NOT a tie
//			
//			// 2 conditions to be called a tie
//			//1. no more spaces
//			//2. no winner
//		}
//		
//		
//		
//		
//	/*
//           |    |
//        -------------
//		   |    |
//	   --------------
//	   	   |    |
//
//	
//	 */
//}
