package VideoGames;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.geom.AffineTransform;
import java.awt.image.AffineTransformOp;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.*;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.plaf.basic.BasicInternalFrameTitlePane.SystemMenuBar;

public class Frogger extends JPanel implements KeyListener
{
	private static BufferedImage image;
	private static BufferedImage image2;	
	private static BufferedImage image3;
	private static BufferedImage car1a;
	private static BufferedImage car1b;
	private static BufferedImage car2a;	
	private static BufferedImage car2b;
	private static BufferedImage log;

	private static BufferedImage car3;



	static boolean death = false;
	static int car2aX = 50;
	static int car2bX = 100;
	static int car1aX = 75;
	static int car1bX = 299;
	static int car3X = 432;
	static int lane = 1;
	static int yFrog = 720;
	static int xFrog = 220;
	static int lives = 3;

	public static void main (String[] args) throws InterruptedException
	{
		JFrame frame= new JFrame ("Frogger");
		Frogger game = new Frogger();
		frame.add(game);
		frame.setVisible(true);
		frame.setSize (500, 800);
		frame.addKeyListener(game);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		try
		{
			image = ImageIO.read(new File("frog.png"));
			image2 = ImageIO.read(new File ("grass.png"));
			image3 = ImageIO.read(new File ("flipfrog.png"));
			car1a = ImageIO.read(new File ("car1a.png"));
			car1b = ImageIO.read(new File ("car1b.png"));
			car2a = ImageIO.read(new File ("car2a.png"));
			car2b = ImageIO.read(new File ("car2b.png"));
			car3 = ImageIO.read(new File ("car3.png"));
			log = ImageIO.read(new File ("log.png"));
		}
		catch (IOException e)
		{
			System.out.print("Error 404: Image not found");
		}
		while (true)
		{
			game.repaint();
			car2aX = car2aX + 2;
			car2bX = car2bX + 2;
			car1aX++;
			car1bX++;
			car3X = car3X + 3;
			Thread.sleep(20);
			
			if (game.death())
			{
				xFrog = 220;
				yFrog = 720;
				death = false;
				lane = 1;
				lives--;
				System.out.println("lives: " + lives);
			}

			
		}
	}
	public void paint (Graphics g)
	{
		Graphics2D g2d = (Graphics2D)g;
		
		g.drawImage(image2, 0, 200, 500, 500, this);
		g2d.setColor(Color.black);
		g2d.fillRect(0, 415 , 500, 400);
		g2d.setColor(new Color (9 ,56, 166));

		g2d.fillRect(0, 0, 500, 355);

		g.drawImage(image2, 0, 720, 500, 500, this);

		g.drawImage(image, xFrog, yFrog, 50, 50, this);
		
		vehicleDraw(g, car2a, 2);
		
		vehicleDraw(g, car2b, 5);
		
		vehicleDraw(g, car1a, 3);
		
		vehicleDraw(g, car3, 4);
		
		vehicleDraw(g, car1b, 6);
		
		
		



	
	}
	
	private void vehicleDraw (Graphics g, Image image, int lane)
	{
		Graphics2D g2d = (Graphics2D)g;
		
		if (image == car1a)
		{
			g.drawImage(image, car1aX, 775 - (int)(lane * 59.5), 70, 45, this);
		}
		if (image == car1b)
		{
			g.drawImage(image, car1bX, 775 - (int)(lane * 59.5), 70, 45, this);
		}
		if (image == car2a)
		{
			g.drawImage(image, car2aX, 775 - (lane * 63), 70, 65, this);
		}
		if (image == car2b)
		{
			g.drawImage(image, car2bX, 775 - (lane * 63), 70, 65, this);
		}
		if (image == car3)
		{
			 g.drawImage(image, car3X, 775 - (int)(lane * 59.5), 70, 45, this);
		}
//car 1: g.drawImage(image, car1X, 775 - (int)(lane * 59.5), 70, 45, this);
//car 2 : g.drawImage(image, car2X, 775 - (lane * 63), 70, 65, this);
//car 3:  g.drawImage(image, car3X, 775 - (int)(lane * 59.5), 70, 45, this);
		
		if (car1aX >= 575)
		{
			car1aX = -50;
		}
		if (car1bX >= 600)
		{
			car1bX = -50;
		}
		if (car2aX >= 600)
		{
			car2aX = -50;
		}
		if (car2bX >= 600)
		{
			car2bX = -50;
		}
		if (car3X >= 575)
		{
			car3X = -50;
		}
		
	}
	public static void waterVehicleDraw (Graphics g, Image image, int lane)
	{
		
	}
	
	private boolean death ()
	{
		if (lane == 1)
		{
			//can't die
		}
		//death from car
		else if (lane == 2)
		{
			death = (car2aX - 50 <= xFrog) && (xFrog <= car2aX + 75);
		}
		else if (lane == 3)
		{
			death = (car1aX - 40 <= xFrog) && (xFrog <= car1aX + 65);
		}
		else if (lane == 4)
		{
			death = (car3X - 40 <= xFrog) && (xFrog <= car3X + 65);
		}
		else if (lane == 5)
		{
			death = (car2bX - 50 <= xFrog) && (xFrog <= car2bX + 75);

		}
		else if (lane == 6)
		{
			death = (car1bX - 40 <= xFrog) && (xFrog <= car1bX + 65);
		}
		// death from water
		else if (lane == 7)
		{
			//safe
		}
		else if (lane == 8)
		{
		}
		else if (lane == 9)
		{
		}
		else if (lane == 10)
		{
		}
		else if (lane == 11)
		{
		
		}
		else if (lane == 12)
		{
		}
		else if (lane == 13)
		{
		}
		
		return death;
	}
	
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		
		if ((e.getKeyChar() == 'w' || e.getKeyCode()==38 ) && yFrog  > 0 && lives >= 1)
		{
			yFrog= yFrog - 60;
			lane++;
			
		}
		if ((e.getKeyChar() == 's' || e.getKeyCode()==40 ) && (yFrog  + 80) < 800 && lives >= 1) 
		{
			yFrog = yFrog + 60;
			lane--;
		}
		
		if ((e.getKeyChar() == 'a' || e.getKeyCode() == 37) && xFrog + 5 > 0   && lives >= 1)
		{
			xFrog= xFrog - 15;
			
//			AffineTransform tx = AffineTransform.getScaleInstance(-1, 1);
//			tx.translate(-image.getWidth(null), 0);
//			AffineTransformOp op = new AffineTransformOp(tx, AffineTransformOp.TYPE_NEAREST_NEIGHBOR);
//			image = op.filter(image, null);
		}
		if ((e.getKeyChar() == 'd' || e.getKeyCode() == 39) && xFrog + 50 < 500 && lives >= 1)
		{
			xFrog = xFrog + 15;
//			AffineTransform tx = AffineTransform.getScaleInstance(-1, 1);
//			tx.translate(-image.getWidth(null), 0);
//			AffineTransformOp op = new AffineTransformOp(tx, AffineTransformOp.TYPE_NEAREST_NEIGHBOR);
//			image = op.filter(image, null);

		}
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	

}
