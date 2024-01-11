import java.util.Scanner;

public class LoopExamples 
{
	public static void main (String[] args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("What is your name?");
		String name = kb.next();
		
		String again = "yes";
		
//		//do-While loop
//		do
//		{
//			System.out.println(name);
//			System.out.println(Math.random());
//			System.out.println("Would  you like to run again?");
//			again = kb.next();
//		} while (again.equalsIgnoreCase("yes"));
//		System.out.println("goodbye");
//		
//		//calories 
//		//cereal - 300
//		//pizza - 600
//		//donuts - 100
//		
		
	
			
			
			int pizza = 0;
			int donut = 0;
			int cereal = 0;
			
			
			do
			{
				System.out.println("What did you eat?");
				String food = kb.next();
				
				if (food.equalsIgnoreCase("pizza"))
				{
					pizza = pizza + 1;
				}
				else if (food.equalsIgnoreCase("donut"))
				{
					donut = donut+ 1;
		
				}
				else if (food.equalsIgnoreCase("cereal"))
				{
					cereal = cereal+ 1;
					
				}
				else
				{
					System.out.println("that is not a food");
				}
				System.out.println("Would  you like to run again?");
				again = kb.next();
			} while (again.equalsIgnoreCase("yes"));
			System.out.println("goodbye");
				
			

			
			int total = (pizza *600) + (cereal * 300) + (donut*100);
			
			System.out.println("You ate " + total + " calories." );

		
	}

}
