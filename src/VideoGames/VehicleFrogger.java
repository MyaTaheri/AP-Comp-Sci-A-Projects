package VideoGames;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

import javax.swing.JPanel;

public class VehicleFrogger extends JPanel
{
	int speed;
	private static BufferedImage image;
	int lane;
	int xPos = 100;

	public VehicleFrogger (BufferedImage image, int speed, int lane) 
	{
		this.lane = lane;
		
		this.speed = speed;
		this.image = image;
		Frogger game = new Frogger();
	}
	
	
}
