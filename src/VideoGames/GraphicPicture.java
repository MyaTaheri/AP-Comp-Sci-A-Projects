package VideoGames;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class GraphicPicture extends JPanel
{ 
	
	//main method
	public static void main (String[] args)
	{	
		//f is the object from the JFrame class
		JFrame f = new JFrame("Snowman Graphic");
		f.add(new GraphicPicture());
		f.setSize(750,500);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	//paint method
	public void paint(Graphics g)
	{
		Graphics2D g2d = (Graphics2D)g;
		Color backgroundColor = new Color (51,124,233);
		g2d.setColor(backgroundColor);
		g2d.fillRect(0, 0, 750, 500);
		
		Color shadowSnowmanColor = new Color (195,221,242);
		Color shadowColor = new Color (35,102,202);
		Color armsColor = new Color (70, 42,26);
		
		
		g2d.setColor(shadowColor);
		g2d.fillOval(175, 320, 162, 81);
		
//		g2d.setStroke(new BasicStroke(4));
//		g2d.setColor(armsColor);
//		
//		g2d.drawLine(180, 230, 200, 250);
//		
//		g2d.setStroke(new BasicStroke(1));

		
		// Body of Snowman
		g2d.setColor(shadowSnowmanColor);
		g2d.fillOval(193, 135, 120, 120);
		
		g2d.setColor(Color.WHITE);
		g2d.fillOval(193, 135, 115, 115);

		g2d.setColor(shadowSnowmanColor);
		g2d.fillOval(180, 230, 153, 153);
		
		g2d.setColor(Color.WHITE);
		g2d.fillOval(180, 230, 142, 142);
		
		g2d.fillOval(240, 215, 50, 60);
		
		
		g2d.setColor(Color.BLACK);
		g2d.fillOval(220, 175, 15, 15);

		g2d.fillOval(270, 175, 15, 15);
		
		

		
		

		
	}
	


}
