public class TwoD
{
	String[][] board =  {{"1", "2", "3"} ,{"4", "5", "6"} ,{"7","8", "9"}};
	;
	
	public TwoD()
	{
		System.out.println("Hello :D");
	}
	
	public void makeArray()
	{
		int[] oneD = {5,6,7,8};
		int[][] twoD = { {1,2,3,4},
						 {5,6,7,8},
						 {9, 10, 11, 12}};
		
		System.out.println(twoD[2][2]);
	}
	
	public void printArray()
	{
		for (int row = 0; row < 3; row++)
		{
			for (int col = 0; col < 3; col++)
			{
				System.out.print(board[row][col]+ "\t");
			}
			System.out.println();
		}
	}
}
