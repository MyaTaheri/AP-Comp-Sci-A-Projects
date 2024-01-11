package VideoGames;

import javax.swing.JPanel;
import javax.swing.JFrame;

import java.awt.Graphics;


import java.awt.*;
import javax.swing.*;

public class Stars extends JPanel 
{
	
	static Star s1 = new Star();
	static Star s2 = new Star();
	static Star s3 = new Star();
	public static void main (String [] args) throws InterruptedException
	{
		JFrame frame = new JFrame ("Stars");
		Stars game = new Stars();
		frame.add(game);
		frame.setSize(750,500);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		while(true)
		{
			s1.setXVelocity();
			s2.setXVelocity();
			s3.setXVelocity();
			s1.setYVelocity();
			s2.setYVelocity();
			s3.setYVelocity();
			game.repaint();
			Thread.sleep(50);
		}
	}
	
	public void paint (Graphics g)
	{
		Graphics2D g2d = (Graphics2D) g;
		g2d.setColor(s1.getColor());
		g2d.fillOval(s1.getXPosition(), s1.getYPosition(), 50, 50);	
		g2d.setColor(s2.getColor());
		g2d.fillOval(s2.getXPosition(), s2.getYPosition(), 50, 50);
		g2d.setColor(s3.getColor());
		g2d.fillOval(s3.getXPosition(), s2.getYPosition(), 50, 50);
}
}
