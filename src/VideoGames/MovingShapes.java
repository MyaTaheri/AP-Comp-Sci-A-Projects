package VideoGames;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JFrame;
import javax.swing.JPanel;


public class MovingShapes extends JPanel
{
	private static int xPos = 50;


	public static void main(String[] args) throws InterruptedException
	{
		JFrame frame = new JFrame("Moving parts");
		MovingShapes picture = new MovingShapes();
		
		frame.add(picture);
		frame.setSize(750,500);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		
		while(true)
		{
			picture.repaint();
			Thread.sleep(5);
			
			int direction = 0;
			
			
			if (direction % 2 == 0 && xPos <= 700)
			{
				xPos++;
				
			}
			else 
			{
				for (int i = 0; i <= 700; i++)
				{
					picture.repaint();
					Thread.sleep(5);
					xPos--;
					
					//moving *= -1 or 1

				}
			}
	
			
		
			
			
			/*
			xPos++;
			if (xPos >= 700)
			{
				xPos = 0;
			}
			*/
			
			
		}
		
	}
	
	public void paint (Graphics g)
	{
		Graphics2D g2d = (Graphics2D)g;
		/*
		int radius = (int)(Math.random() * 300);
		g2d.setColor(new Color ((int)(Math.random() * 256), (int)(Math.random() * 256), (int)(Math.random() * 256)));
		g2d.fillOval((int)(Math.random() * 750), (int)(Math.random() * 500), radius, radius);
		*/
		
		g2d.setColor(Color.blue);
		g2d.fillOval(xPos, 50, 50, 50);
		
		
		
	}

}
