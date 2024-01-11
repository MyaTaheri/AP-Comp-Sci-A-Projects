package Objects;

import java.util.ArrayList;
import java.util.Scanner;

public class Spotify 
{
	ArrayList <String> songs = new ArrayList<>();
	
	public Spotify()
	{
		
	}
	
	public void addSong()
	{
		Scanner kb = new Scanner (System.in);
		System.out.println("What is the name of the song?");
		String name = kb.next();
		songs.add(name);
		System.out.println("Who is the artist?");
		songs.add(kb.next());
	}
	
	public void delete()
	{
		songs.remove(0);
		songs.remove(0);
	}
	
	public void seeSong()
	{
		Scanner kb = new Scanner (System.in);
		System.out.println("Name a song:");
		String name = kb.next();
		int spot = songs.indexOf(name);
		System.out.println("Song location: " + spot);
		System.out.println("Arist location: " + (int)(spot + 1));

		
	}
	
	public void seeList()
	{
		for (int i = 0; i < this.songs.size() - 2; i = i + 2)
		{
			System.out.print(songs.get(i) + ", ");
		}
		System.out.println(songs.get(songs.size()-2));
	}

}
