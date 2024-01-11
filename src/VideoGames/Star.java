package VideoGames;

import java.awt.*;
import javax.swing.*;

public class Star 
{
	public int xPosition, yPosition, xVelocity, yVelocity;
	public int red, green, blue;
	
	//constructors
	
	public Star()
	{
		xPosition = (int)(Math.random() * 700);
		yPosition = (int)(Math.random() * 450);
		xVelocity = (int)(Math.random() * 7 - 3);
		yVelocity = (int)(Math.random() * 7 - 3);
		
		red = (int)(Math.random() * 255);
		green = (int)(Math.random() * 255);
		blue = (int)(Math.random() * 255);
	}
	
	public int getXPosition()
	{
		return xPosition;
	}
	
	public int getYPosition()
	{
		return yPosition;
	}
	
	public int getXVelocity()
	{
		return xVelocity;
	}
	
	public int getYVelocity()
	{
		return xPosition;
	}
	
	public Color getColor()
	{
		return new Color (red, green, blue); 
	}
	
	public void setXVelocity()
	{
		xPosition = xPosition + xVelocity;
	}
	public void setYVelocity()
	{
		yPosition = yPosition + yVelocity;
	}
	
//	public int getRed()
//	{
//		return red;
//	}
//	
//	public int getGreen()
//	{
//		return green;
//	}
//	
//	public int getBlue()
//	{
//		return blue;
//	}

}
