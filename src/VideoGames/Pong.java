package VideoGames;


import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.*;

/*
 * TODO:
 *  * Score for everytime you hit??
 */

public class Pong extends JPanel implements KeyListener
{
	static int lives;
//	static int width = 750;
//	static int height = 500;
	static int xPos = 375;
	static int yPos = 250;
	static int xPosPaddle = 30;
	static int yPosPaddle = 250;
//	static int minXBoundries = 720;
//	static int minYBoundries = 10;
//	static int maxXBoundries =15;
//	static int maxYBoundries = 480;
	static int speed = 10;
	static int red = (int)(Math.random() * 256);
	static int blue = (int)(Math.random() * 256);
	static int green = (int)(Math.random() * 256);

	
	public static void main (String [] args) throws InterruptedException
	{
		JFrame frame = new JFrame ("Pong");
		Pong pong = new Pong();
		frame.add(pong);
		frame.setSize(750,500);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		lives = 5;
	
		frame.addKeyListener(pong);

		int vx = 2;
		int vy = 2;
		
		int speedCount = 1;
		
		while(true)
		{
			frame.repaint();
			Thread.sleep(speed);
	
			
			if (xPos + 50 + vx > 720)	
			{
				 vx *= -1;
			
			}	
			if(yPos + vy < 10 || yPos + 50 + vy > 480) 
			{
		        
				vy *= -1;
		    }
			
		    
		    if (xPos < 15 && lives > 0)
		    {
		    	lives--;
		    	xPos = 375;
		    	yPos = 250;
		    	speed = 10;
		    	speedCount = 1;
		    	System.out.println("Speed Reset: " + speed);
		    }
		    
		    
		    if (xPos < (xPosPaddle + 30) && xPos > xPosPaddle)
		    {
		    	if (yPos < (yPosPaddle + 100) && yPos > yPosPaddle)
		    	{
		    		vx *= -1;
		    		vy *= -1;
		    		
		    		System.out.println("hit");
		    	
		    		if (speedCount % 6 == 0 && speed > 0)
		    		{
		    			speed--;
		    			System.out.println("Speed increase: " + speed);
		    		}
		    		
		    		speedCount++;
		    	}
		    }
		    xPos += vx;
		    yPos += vy;	
		}
	}
	
	public void paint (Graphics g)
	{
		Graphics2D g2d = (Graphics2D)g;
		
//		width = getWidth();
//		height = getHeight();
		
		Color purple = new Color (161, 138, 255);
		g2d.setColor(purple);
	//	g2d.fillRect(0, 0, width, height);
		g2d.fillRect(0, 0, 750, 500);

		
		g2d.setColor(Color.white);
	//	g2d.fillRect((int)(width * 0.02), (int)(height * 0.02),(int)(width * 0.96), (int)(height * 0.96));
		g2d.fillRect(15, 10, 720, 480);
		
		
		Color darkPurple = new Color (34, 16, 84);
		
		g2d.setColor(darkPurple);
	//g2d.fillRect((int)(width * 0.4), (int)(height * 0.05), (int)(width * 0.2), (int)(height * 0.07));
		g2d.fillRect(300,25, 150, 35);
		
		
		g2d.setColor(Color.white);
		
		//int fontSize = (int)(height * 0.06);
		int fontSize = 30;
		g.setFont(new Font("SansSerif", Font.PLAIN, fontSize));
		
		//g2d.drawString("Lives " + lives, (int)(width * 0.426666667), (int)(height* 0.11));
		g2d.drawString("Lives " + lives, 320, 55);

				
		g2d.setColor(Color.BLACK);			
		g2d.fillOval(xPos, yPos, 50, 50);
		
		g2d.setColor(new Color (red, green, blue));
		g2d.fillRect(xPosPaddle, yPosPaddle, 30, 100);

	}

	@Override
	public void keyTyped(KeyEvent e) 
	{
		
	}

	@Override
	public void keyPressed(KeyEvent e)
	{
		if (lives > 0 )
		{
			if (e.getKeyChar() == 'w' && (yPosPaddle - 5) > 7)
			{
				yPosPaddle= yPosPaddle - 5;
			}
			if (e.getKeyChar() == 's' && (yPosPaddle + 100) < 490)
			{
				yPosPaddle = yPosPaddle + 5;
	
			}
		}		
		
	}

	@Override
	public void keyReleased(KeyEvent e) 
	{
		
	}
	
	
//	public JPanel border ()
//	{
//		 //BorderFactory.createLineBorder(Color, int thickness)
//        JPanel panel_LineBorder = new JPanel();
//        Color purple = new Color (161, 138, 255);
//        panel_LineBorder.setBorder(BorderFactory.createLineBorder(purple, 10));
//        panel_LineBorder.add(new  JLabel("Line Border"));
//        border.add(panel_LineBorder);
//        
//        return border;
//	}
}
