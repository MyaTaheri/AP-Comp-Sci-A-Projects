
public class AdditionPattern
{
	private int startingNum;
	private int addNum;
	private int currentNum;
	
	public AdditionPattern (int startingNum, int addNum)
	{
		this.startingNum = startingNum;
		this.addNum = addNum;
		currentNum = startingNum;
	}
	
	public int currentNumber()
	{
		return currentNum;
	}
	
	public void next()
	{
		currentNum = currentNum + addNum;
	}
	
	public void prev()
	{
		if (currentNum - addNum < startingNum)
		{
			currentNum = currentNum - addNum;
		}
	
	}
	
}