package Guis;

import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.*;


public class MoreRed extends JFrame implements ActionListener
{
	
	//Gloval Variables:
	File input = new File("fish.jpeg");
	BufferedImage image = ImageIO.read(input);
	JLabel pictureLabel;
	
	public static void main (String[] args) throws IOException
	{
		MoreRed obj = new MoreRed();
		obj.setVisible(true);	}

	public MoreRed() throws IOException
	{
		super ("More Red");
		setSize (900, 650);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout (new FlowLayout());
		
		ImageIcon icon = new ImageIcon (image);
		
		pictureLabel = new JLabel(icon);
		add(pictureLabel);
		
		JButton redButton = new JButton ("Add Red");
		redButton.addActionListener(this);
		add(redButton);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		String result = e.getActionCommand();
		
		if (result.equals("Add Red"))
		{
			for (int y = 0; y < image.getHeight(); y++)
			{
				for (int x = 0; x <image.getWidth(); x++)
				{
					Color oldC = new Color (image.getRGB(x, y));
					int red = (oldC.getRed());
					int green = (oldC.getGreen());
					int blue = (oldC.getBlue());
					if (red < 240)
						red = red + 10;
					else
						red = 0;
					Color newC = new Color (red, green, blue);
					image.setRGB(x, y, newC.getRGB());

				}
			}
			ImageIcon icon = new ImageIcon (image);
			pictureLabel.setIcon(icon);
		}
		
	}
	


}
