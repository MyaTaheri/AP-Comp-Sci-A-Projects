package VideoGames;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Day1 extends JPanel
{
	//main method
	public static void main (String[] args)
	{	
		//f is the object from the JFrame class
		JFrame f = new JFrame("First Real Game");
		f.setSize(1000,300);
		f.add(new Day1());
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	//paint method
	public void paint(Graphics g)
	{
		Graphics2D g2 = (Graphics2D)g;
		Color darkBlue = new Color (98, 77,238);
		g2.setColor(Color.CYAN);
		g2.drawRect(20, 20, 100, 100);
		g2.setColor(darkBlue);
		g2.fillRect(100, 25, 41, 150);
		g.setColor(Color.BLACK);
		g2.fillOval(150, 20, 50, 75);
		g2.drawString("Megan vs Maureen",800, 50);
		g2.fillArc(300, 100, 50, 50, 0, 260);

		
	}
	
	
	
}
