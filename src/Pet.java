public class Pet
{
	public int mouth;
	public double mass;
	
	public Pet()
	{
		mouth = 10;
		mass = 100;
		printInfo();
	}
	
	public Pet (int x, double y)
	{
		mouth = x;
		mass = y;
	}
	
	public void printInfo()
	{
		System.out.println("Mouth: " + mouth + "\nMass: " + mass + "\n************");
	}
}
