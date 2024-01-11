
public class Owner 
{
	public static void main (String[] args)
	{
		Pet pet1 = new Pet();
		pet1.printInfo();
		Pet pet2 = new Pet(5, 27);
		pet2.printInfo();
		
		Dog dog1 = new Dog();
		dog1.printInfo();
		Dog dog2 = new Dog(false, "Poodle");
		dog2.printInfo();
		
		
	}
}
