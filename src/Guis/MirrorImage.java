package Guis;

import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.*;

public class MirrorImage extends JFrame implements ActionListener
{
	
	File input = new File("elmo.png");
	BufferedImage imageElmo = ImageIO.read(input);
	JLabel pictureLabelElmo;
	int counter = 0;
	
	public MirrorImage() throws IOException
	{
		super ("MixingPictures");
		setSize (900, 650);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout (new FlowLayout());
		
		ImageIcon iconElmo = new ImageIcon (imageElmo);
		
		pictureLabelElmo = new JLabel(iconElmo);
		add(pictureLabelElmo);
		
		JButton vButton = new JButton ("Vertical");
		vButton.addActionListener(this);
		add(vButton);
		
		JButton hButton = new JButton ("Horizontal");
		hButton.addActionListener(this);
		add(hButton);
		
	}

	public static void main (String[] args) throws IOException
	{
		MirrorImage obj = new MirrorImage();
		obj.setVisible(true);	
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e)
	{
		String result = e.getActionCommand();
		
		if (result.equals("Vertical"))
		{
			int midline = imageElmo.getWidth()/2;
			for (int y = 0; y < imageElmo.getHeight(); y++)
			{
				for (int x = 0; x < midline; x++)
				{
					Color c = new Color (imageElmo.getRGB(x, y));
					int newX = midline + (midline-x) - 1;
					imageElmo.setRGB(newX, y, c.getRGB());
				}
			}
			ImageIcon icon = new ImageIcon (imageElmo);
			pictureLabelElmo.setIcon(icon);
		}
		
		if (result.equals("Horizontal"))
		{
			int midline = imageElmo.getHeight()/2;
			for (int x = 0; x < imageElmo.getWidth(); x++)
			{
				for (int y = 0; y < midline; y++)
				{
					Color c = new Color (imageElmo.getRGB(x, y));
					int newY = midline + (midline-y) - 1;
					imageElmo.setRGB(x, newY, c.getRGB());
				}
			}
			ImageIcon icon = new ImageIcon (imageElmo);
			pictureLabelElmo.setIcon(icon);
		}
		
	}

}
