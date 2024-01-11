package VideoGames;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Day2 extends JPanel
{
	public static void main (String[] args)
	{
		// create an frame object - instantiate
		
		JFrame frame = new JFrame();
		frame.add(new Day2());
		frame.setSize(750,500);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
	}
	public void paint (Graphics g)
	{
		Graphics2D g2d = (Graphics2D)g;
		
		//g2d.setColor(new Color ((int)(Math.random() * 256), (int)(Math.random() * 256), (int)(Math.random() * 256)));
		//g2d.fillOval(90, 90, 100, 100);
		
		//with a for loop make 100 colors of different circles color on the screen
		
		int r = 50;
		
		for (int i = 0; i <= 100; i++)
		{
			g2d.setColor(new Color ((int)(Math.random() * 256), (int)(Math.random() * 256), (int)(Math.random() * 256)));
			//g2d.fillOval(((int)(Math.random() * 750)), ((int)(Math.random() * 500)), 100, 100);
			
			/*
			g2d.fillOval(r, 100, 100, 100);
			r = r+10;
			*/
			
			
		}
		
		
		
	}
}
