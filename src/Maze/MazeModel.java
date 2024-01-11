package Maze;

import java.util.Random;

public class MazeModel 
{
	static int row = 7;
	static int col = 7;
	
	public static void main (String[] args)
	{
		MazeModel mm = new MazeModel();
		
		int start = mm.random(0,11);
		int end = mm.random(0,11);
		
		int totalCells = row * col;
		
		int randomStartCell = mm.random(0, (totalCells+1));
		
		//Tests rowAndCol Method
		
		int[][] test = mm.rowAndCol(8);
		System.out.println("8 row: " + test[0][0]);
		System.out.println("8 col: " + test[0][1]);
		System.out.println("____");
		
		test = mm.rowAndCol(4);
		System.out.println("4 row: " + test[0][0]);
		System.out.println("4 col: " + test[0][1]);
		System.out.println("____");
		
		test = mm.rowAndCol(1);
		System.out.println("1 row: " + test[0][0]);
		System.out.println("1 col: " + test[0][1]);
		System.out.println("____");
		
		test = mm.rowAndCol(3);
		System.out.println("3 row: " + test[0][0]);
		System.out.println("3 col: " + test[0][1]);
		System.out.println("____");
		
		
		
	}
	
	public int random(int x, int y)
	{
		Random r = new Random();
		int low = x;
		int high = y;
		int result = r.nextInt(high-low)+low;
		
		return result;
		
	}
	
//	public int[][] adjacentCell()
//	{
//		
//		MazeModel mm = new MazeModel();
//		
//		int[][] adjacentCell = new int[1][2];
//		
//		String direction = mm.direction();
//		
//		return adjacentCell;
//	}
//	
	private String direction()
	{
		MazeModel mm = new MazeModel();
		
		String direction = " ";
		
		int randomD = mm.random(0, 5);
		
		if (randomD == 0)
		{
			direction = "north";
		}
		else if (randomD == 1)
		{
			direction = "south";
		}
		else if (randomD == 2)
		{
			direction = "east";
		}
		else if (randomD == 3)
		{
			direction = "west";
		}
		//else: Do nothing
		
		System.out.println(direction);
		return direction;
	}
	
	public int[][] enlargeArray (int[][] oldArray)
	{
		int lengthOne = oldArray.length;
		int lengthTwo = oldArray[0].length;
		int [][] newArray = new int [lengthOne + 1][lengthTwo];
		return newArray;
	}
	
	public int[][] addToVisit (int[][]oldArray, int[][] currentCell)
	{
		int[][] array = enlargeArray(oldArray);
		currentCell[0][0] = array[array.length][0];
		currentCell[0][1] = array[array.length][1];
		return array;
	}
	
	public boolean checkArray(int[][] currentCell, int[][] visited)
	{
		//figure this out
		return true;
	}
	
	public int[][] rowAndCol(int cellNumber)
	{
		//cellNumber = (# of col * row) - (num of col % col)
		// num of Col % col =  (# of col * row) - cellNumber
		// 
		
		
		int[][] rowAndCol = new int[1][2];
		
		int numOfCol = col;
		int numOfRow = row;
	
		
		int col = cellNumber % numOfCol;
		
		if (col == 0)
		{
			col = numOfCol;
		}
		//Else: Do Nothing
		
		int row = cellNumber / numOfCol + 1;
		
		if (col == numOfCol)
		{
			row--;
		}
		
		rowAndCol[0][1] = col; 
		
		rowAndCol[0][0] =row; 
		
		return rowAndCol;
		
		
		
	}
}

