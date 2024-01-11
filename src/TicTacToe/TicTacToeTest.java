
package TicTacToe;



import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

import TicTacToe2.TicTacToeModel;

class TicTacToeTest {

	@Test
	void testEmpyBoard() 
	{
		TicTacToeModel model = new TicTacToeModel();
		
		assertTrue(model.freeSpace(1,1));
		assertTrue(model.freeSpace(1,2));
		assertTrue(model.freeSpace(1,3));
		
		assertTrue(model.freeSpace(2,1));
		assertTrue(model.freeSpace(2,2));
		assertTrue(model.freeSpace(2,3));
		
		assertTrue(model.freeSpace(3,1));
		assertTrue(model.freeSpace(3,2));
		assertTrue(model.freeSpace(3,3));
		//assertTrue(false);
	}
	/*
	@Test
	void testEmptyChar()
	{
		char[] c = new char[1];
		System.out.println(c[0]);
		assertTrue(c[0] == '\u0000');
		assertFalse(c[0] == 'X');
	}
	*/
	
	@Test
	void testPlace()
	{

		TicTacToeModel model = new TicTacToeModel();
		//Add this line so the computer knows that X is the first player
		model.setFirstPlayer('X');
		assertTrue(model.freeSpace(3,1));
		model.setMove(3, 1);
		assertTrue(model.getMove(3,1) == 'X');	
		
		assertTrue(model.freeSpace(2,1));
		model.setMove(2, 1);
		assertTrue(model.getMove(2,1) == 'O');

	}
////check if valid move
	@Test
	void testHorizontalWinner()
	{
		
		//Winner = n/a by n/a
		TicTacToeModel model = new TicTacToeModel();
		assertTrue(model.getGameStatus() == 'N');
		//assertFalse(model.isWinner('X'));
		//assertFalse(model.isWinner('O'));
		//Instead of writing both, we just check with getGameStatus if there is no winner
		
		//Winner = X (r1,c1)(r1,c2)(r1,c3)
		model.setFirstPlayer('X');
		//Add this line so the computer knows that X is the first player
		model.setMove(1, 1);
		model.setMove(2,1);
		model.setMove(1, 2);
		model.setMove(3, 2);
		model.setMove(1, 3);
		assertTrue(model.getGameStatus() == 'X');
		
		//Winner = O (r1,c1)(r1,c2)(r1,c3)
		model = new TicTacToeModel();
		assertTrue(model.getGameStatus() == 'N');
		model.setFirstPlayer('O');
		model.setMove(1, 1);
		model.setMove(2,1);
		model.setMove(1, 2);
		model.setMove(3, 2);
		model.setMove(1, 3);
		assertTrue(model.getGameStatus() == 'O');
		
		
		//Winner = X (r1,c1)(r1,c2)(r1,c3)
		model = new TicTacToeModel();
		model.setFirstPlayer('O');
		model.setMove(1, 1);
		model.setMove(2,1);
		model.setMove(1, 2);
		model.setMove(3, 2);
		model.setMove(1, 3);
		assertTrue(model.getGameStatus() =='O');
		
		
		//Winner = X (r2,c1)(r2,c2)(r2,c3)
		model = new TicTacToeModel();
		assertTrue(model.getGameStatus() == 'N');
		model.setFirstPlayer('X');
		model.setMove(2, 1);
		model.setMove(1, 1);
		model.setMove(2, 2);
		model.setMove(3, 2);
		model.setMove(2, 3);
		assertTrue(model.getGameStatus() == 'X');
		
		//Winner = O (r2,c1)(r2,c2)(r2,c3)
		model = new TicTacToeModel();
		assertTrue(model.getGameStatus() == 'N');
		model.setFirstPlayer('O');
		model.setMove(2, 1);
		model.setMove(1, 1);
		model.setMove(2, 2);
		model.setMove(3, 2);
		model.setMove(2, 3);
		assertTrue(model.getGameStatus() == 'O');
	
		//Winner = X (r3,c1)(r3,c2)(r3,c3)
		model = new TicTacToeModel();
		assertTrue(model.getGameStatus() == 'N');
		model.setFirstPlayer('X');
		model.setMove(3, 1);
		model.setMove(1,1);
		model.setMove(3, 2);
		model.setMove(1,2);
		model.setMove(3, 3);
		assertTrue(model.getGameStatus() == 'X');	
		
//		//Winner = O (r3,c1)(r3,c2)(r3,c3)
		model = new TicTacToeModel();
		assertTrue(model.getGameStatus() == 'N');
		model.setFirstPlayer('O');
		model.setMove(3, 1);
		model.setMove(1,1);
		model.setMove(3, 2);
		model.setMove(1,2);
		model.setMove(3, 3);
		assertTrue(model.getGameStatus() == 'O');	
	}

	@Test
	void testVerticalWinners()
	{
		
		//Winner = X (r1,c1)(r2,c1)(r3,c1)
		TicTacToeModel model = new TicTacToeModel();
		assertTrue(model.getGameStatus() == 'N');
		model.setFirstPlayer('X');
		model.setMove(1, 1);
		model.setMove(1,3);
		model.setMove(2, 1);
		model.setMove(3, 3);
		model.setMove(3, 1);
		assertTrue(model.getGameStatus() == 'X');
		
		//Winner = O (r1,c1)(r2,c1)(r3,c1)
		model = new TicTacToeModel();
		assertTrue(model.getGameStatus() == 'N');
		model.setFirstPlayer('O');
		model.setMove(1, 1);
		model.setMove(1,3);
		model.setMove(2, 1);
		model.setMove(3, 3);
		model.setMove(3, 1);
		assertTrue(model.getGameStatus() == 'O');
		
		//Winner = x (r1,c2)(r2,c2)(r3,c2)
		model = new TicTacToeModel();
		assertTrue(model.getGameStatus() == 'N');
		model.setFirstPlayer('X');
		model.setMove( 1, 2);
		model.setMove(2, 3);
		model.setMove(2, 2);
		model.setMove(1, 3);
		model.setMove(3, 2);
		assertTrue(model.getGameStatus() =='X');
		
		//Winner = o (r1,c2)(r2,c2)(r3,c2)
		model = new TicTacToeModel();
		assertTrue(model.getGameStatus() == 'N');
		model.setFirstPlayer('O');
		model.setMove(1, 2);
		model.setMove(2, 3);
		model.setMove(2, 2);
		model.setMove(1, 3);
		model.setMove(3, 2);
		assertTrue(model.getGameStatus() =='O');
		
		//Winner = x (r1,c3)(r2,c3)(r3,c3)
		model = new TicTacToeModel();
		assertTrue(model.getGameStatus() == 'N');
		model.setFirstPlayer('X');
		model.setMove(1, 3);
		model.setMove(2, 2);
		model.setMove(2, 3);
		model.setMove(1, 2);
		model.setMove(3, 3);
		assertTrue(model.getGameStatus() =='X');
		
		//Winner = O(r1,c3)(r2,c3)(r3,c3)
		model = new TicTacToeModel();
		assertTrue(model.getGameStatus() == 'N');
		model.setFirstPlayer('O');
		model.setMove(1, 3);
		model.setMove(2, 2);
		model.setMove(2, 3);
		model.setMove(1, 2);
		model.setMove(3, 3);
		assertTrue(model.getGameStatus() =='O');
	}
	
	@Test
	void testDiagonalWinners()
	{
		//Winner = O by diagonal (r1, c3)(r3, c1)(r2,c2)
		TicTacToeModel model = new TicTacToeModel();
		assertTrue(model.getGameStatus() == 'N');
		model.setFirstPlayer('O');
		model.setMove(1, 3);
		model.setMove(3,3);
		model.setMove(3, 1);
		model.setMove(3, 2);
		model.setMove(2, 2);
		assertTrue(model.getGameStatus() =='O');
		
		model = new TicTacToeModel();
		assertTrue(model.getGameStatus() == 'N');
		model.setFirstPlayer('X');
		model.setMove(1, 3);
		model.setMove(3,3);
		model.setMove(3, 1);
		model.setMove(3, 2);
		model.setMove(2, 2);
		assertTrue(model.getGameStatus() =='X');
		
		model = new TicTacToeModel();
		assertTrue(model.getGameStatus() == 'N');
		model.setFirstPlayer('X');
		model.setMove(1, 1);
		model.setMove(3, 1);
		model.setMove(2, 2);
		model.setMove(3, 2);
		model.setMove(3, 3);
		assertTrue(model.getGameStatus() =='X');
		
		
		model = new TicTacToeModel();
		assertTrue(model.getGameStatus() == 'N');
		model.setFirstPlayer('O');
		model.setMove(1, 1);
		model.setMove(3, 1);
		model.setMove(2, 2);
		model.setMove(3, 2);
		model.setMove(3, 3);
		assertTrue(model.getGameStatus() =='O');
	}
	
	@Test
	void testValidMoves()
	{
		TicTacToeModel model = new TicTacToeModel();
		
		assertFalse(model.isValidMove(4, 4));
		assertFalse(model.isValidMove(-1, -1));
		
		assertTrue(model.isValidMove(2, 1));
		model.setFirstPlayer('X');
		model.setMove(2, 1);
		assertFalse(model.isValidMove(2, 1));
		
		
		model = new TicTacToeModel();
		model.setFirstPlayer('O');
		model.setMove(2, 1);
		assertFalse(model.isValidMove(2, 1));	
		
		
	}
	
	@Test
	void testIsTie()
	{
		TicTacToeModel model = new TicTacToeModel();
		
		model.setFirstPlayer('X');
		model.setMove(1, 1);
		model.setMove(2, 1);
		model.setMove(2, 2);
		model.setMove(3, 2);
		model.setMove(3, 3);
		assertFalse (model.getGameStatus() == 'T');
		
		model = new TicTacToeModel();
		assertFalse (model.isTie());
		
		model.setMove(1, 1);
		model.setMove(2, 1);
		model.setMove(2, 2);
		model.setMove(3, 2);
		assertFalse (model.getGameStatus() == 'T');
		
		model.setMove(1, 1);
		model.setMove(1, 2);
		model.setMove(1, 3);
		model.setMove(2, 1);
		model.setMove(2, 3);
		model.setMove(2, 2);
		model.setMove(3, 2);
		model.setMove(3, 3);
		model.setMove(3, 1);
		assertTrue (model.getGameStatus() == 'T');
		}
	
	}

