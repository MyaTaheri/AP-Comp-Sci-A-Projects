package Objects;

import java.util.Scanner;

public class SpotifyDriver
{
	public static void main (String[] args)
	{
		Scanner kb = new Scanner (System.in);
		String again = "yes";
		Spotify list1 = new Spotify();
		while (again.equalsIgnoreCase("yes"))
		{
			System.out.println("1] Enter a Song");
			System.out.println("2] Delete a Song");
			System.out.println("3] See if a song is on the list");
			System.out.println("4] See the entire song list");
			int choice = kb.nextInt();
			if (choice == 1)
			{
				list1.addSong();
			}
			else if (choice == 2)
			{
				list1.delete();
			}
			else if (choice == 3)
			{
				list1.seeSong();
			}
			else if (choice == 4)
			{
				list1.seeList();
			}
			else
			{
				System.out.println("Sorry, that number wasn't an option");
			}
			System.out.println("Would you like to run again?");
			again = kb.next();
			System.out.println("--------------");

		}
		System.out.println("Have a good day!");
	}
}
