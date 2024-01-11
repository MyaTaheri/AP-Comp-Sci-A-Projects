import java.util.Scanner;

public class KeyboardDemo 
{
	public static void main (String[] args)
		{
			Scanner kb = new Scanner (System.in);
			String fav = "Helen";
			System.out.println(fav + " is my favorite student");
			System.out.println("Who is your favorite student this year?");
			fav = kb.next();
			System.out.println(fav + " is my new favorite student");
			System.out.println (fav + " is how old?");
			int age = kb.nextInt();
			System.out.println(fav + " is " + age + " years old");
			System.out.println("How much GPA does you have " + fav);
			double gpa = kb.nextDouble();
			System.out.println(fav + ", you are really smart");
		//Scanner input = new Scanner (System.in);
			
			//PEMDAS
		}
}
