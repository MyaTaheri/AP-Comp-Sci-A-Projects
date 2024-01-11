import java.util.Scanner;

public class MathOperation 
{
	public static void main (String[] args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter in your first name");
		String firstName = kb.next();
		System.out.println("Welcome to MHS, " + firstName);
		System.out.println("How old are you?");
		int age = kb.nextInt();
		System.out.println("AGE: \n" + age);
		double root = Math.pow(age, (1.0/3));
		System.out.println("Power: " + root);
		double sroot = Math.sqrt(age);
		System.out.println("Square Root: " + sroot);
		// e = 2.71
		// pi = 3.14
		System.out.println(Math.PI);
		System.out.println(Math.E);
	}
}
