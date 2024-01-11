
public class Dog extends Pet
{
	private boolean loyal;
	private String breed;
	
	public Dog()
	{
		super();
		loyal = true;
		breed = "Lab";
	}
	
	public Dog(boolean x, String y)
	{
		super(15,4.0);
		loyal = x;
		breed = y;
	}
	
	public void printInfo()
	{
		System.out.println("Mouth: " + mouth + "\nMass: " + mass + "\n");
		System.out.println("Breed: " + breed + "\nLoyal: " + loyal + "\n************");
	}
}
