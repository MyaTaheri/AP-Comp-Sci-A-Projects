package VideoGames;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class FroggerTitle extends JPanel
{ 
	
	//main method
	public static void main (String[] args)
	{	
		JFrame frame= new JFrame ("Frogger");
		FroggerTitle game = new FroggerTitle();
		frame.add(game);
		frame.setVisible(true);
		frame.setSize (500, 800);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	//paint method
	public void paint(Graphics g)
	{
		Graphics2D g2d = (Graphics2D)g;
//		g2d.setFont(getFont());
		g2d.drawString("F R O G G E R", 100, 200);
		
		
	}
	


}
