package Guis;


import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.*;

public class MoreRGB extends JFrame implements ActionListener
{
	File input = new File("fish.jpeg");
	BufferedImage image = ImageIO.read(input);
	JLabel pictureLabel;
	JTextField amountOfRGB;
	
	public static void main (String[] args) throws IOException
	{
		MoreRGB obj = new MoreRGB();
		obj.setVisible(true);	}

	public MoreRGB() throws IOException
	{
		super ("More RGB");
		setSize (850, 650);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout (new FlowLayout());
		
		ImageIcon icon = new ImageIcon (image);
		
		pictureLabel = new JLabel(icon);
		add(pictureLabel);
		
		amountOfRGB = new JTextField(10);
		add (amountOfRGB);
		
		
		JButton redButton = new JButton ("Red");
		redButton.addActionListener(this);
		add(redButton);
		
		JButton blueButton = new JButton ("Blue");
		blueButton.addActionListener(this);
		add(blueButton);
		
		JButton greenButton = new JButton ("Green");
		greenButton.addActionListener(this);
		add(greenButton);
		
		
		
	
	}
	
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		String result = e.getActionCommand();
		
		if (result.equals("Red"))
		{
			int change = Integer.parseInt(amountOfRGB.getText());

			for (int y = 0; y < image.getHeight(); y++)
			{
				for (int x = 0; x <image.getWidth(); x++)
				{
					Color oldC = new Color (image.getRGB(x, y));
					int red = (oldC.getRed());
					int green = (oldC.getGreen());
					int blue = (oldC.getBlue());
					if (red < 255-change)
						red = red + change;
					else
						red = 0;
					Color newC = new Color (red, green, blue);
					image.setRGB(x, y, newC.getRGB());

				}
			}
			ImageIcon icon = new ImageIcon (image);
			pictureLabel.setIcon(icon);
		}
		
		if (result.equals("Green"))
		{
			int change = Integer.parseInt(amountOfRGB.getText());

			for (int y = 0; y < image.getHeight(); y++)
			{
				for (int x = 0; x <image.getWidth(); x++)
				{
					Color oldC = new Color (image.getRGB(x, y));
					int red = (oldC.getRed());
					int green = (oldC.getGreen());
					int blue = (oldC.getBlue());
					if (green < 255 - change)
						green = green + change;
					else
						green = 0;
					Color newC = new Color (red, green, blue);
					image.setRGB(x, y, newC.getRGB());

				}
			}
			ImageIcon icon = new ImageIcon (image);
			pictureLabel.setIcon(icon);
		}
		
		if (result.equals("Blue"))
		{
			int change = Integer.parseInt(amountOfRGB.getText());

			for (int y = 0; y < image.getHeight(); y++)
			{
				for (int x = 0; x <image.getWidth(); x++)
				{
					Color oldC = new Color (image.getRGB(x, y));
					int red = (oldC.getRed());
					int green = (oldC.getGreen());
					int blue = (oldC.getBlue());
					if (blue < 255-change)
						blue = blue + change;
					else
						blue = 0;
					Color newC = new Color (red, green, blue);
					image.setRGB(x, y, newC.getRGB());

				}
			}
			ImageIcon icon = new ImageIcon (image);
			pictureLabel.setIcon(icon);
		}
		
	}
	


}
