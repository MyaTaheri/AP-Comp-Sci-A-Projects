package Objects;

public class House 
{
	//Characteristics or attributes
	private boolean windows;
	private int walls;
	private String address;
	private int room;
	
	//constructor- sets up initial values
//	public House()
//	{
//		windows = true;
//		walls = 4;
//		address = "427 Cherry Street";
//		room = 1;
//	}
	
	public House(boolean wi, int wa, String a, int r)
	{
		this.windows = wi;
		this.walls = wa;
		this.address = a;
		this.room = r;
	}
	
	public String toString()
	{
		return "Address: "  + address + "\nWalls: " + walls + "\nRoom(s): " + room + "\nWindows: " + windows;
	}
	
}
