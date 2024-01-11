package Guis;

import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.*;

public class MoreGrey extends JFrame implements ActionListener
{
	File input = new File("fish.jpeg");
	BufferedImage image = ImageIO.read(input);
	JLabel pictureLabel;
	
	public static void main (String[] args) throws IOException
	{
		MoreGrey obj = new MoreGrey();
		obj.setVisible(true);	}

	public MoreGrey() throws IOException
	{
		super ("More Grey");
		setSize (850, 650);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout (new FlowLayout());
		
		ImageIcon icon = new ImageIcon (image);
		
		pictureLabel = new JLabel(icon);
		add(pictureLabel);
		

		JButton greyButton = new JButton ("Grey");
		greyButton.addActionListener(this);
		add(greyButton);

	
	}
	
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		String result = e.getActionCommand();
		
		if (result.equals("Grey"))
		{

			for (int y = 0; y < image.getHeight(); y++)
			{
				for (int x = 0; x <image.getWidth(); x++)
				{
					Color oldC = new Color (image.getRGB(x, y));
					int red = (oldC.getRed());
					int green = (oldC.getGreen());
					int blue = (oldC.getBlue());
					int average = (red + green + blue) / 3;
					Color newC = new Color (average, average, average);
					image.setRGB(x, y, newC.getRGB());

				}
			}
			ImageIcon icon = new ImageIcon (image);
			pictureLabel.setIcon(icon);
		}
	}
}