package Guis;

import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.*;


public class MixingPictures extends JFrame implements ActionListener
{
	File input1 = new File("realElmo.png");
	File input2 = new File("elmo.png");
	BufferedImage imageElmo = ImageIO.read(input1);
	BufferedImage imageActor = ImageIO.read(input2);
	JLabel pictureLabelElmo;
	JLabel pictureLabelActor;
	int counter = 0;

	
	public MixingPictures() throws IOException
	{
		super ("MixingPictures");
		setSize (900, 650);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout (new FlowLayout());
		
		ImageIcon iconElmo = new ImageIcon (imageElmo);
		ImageIcon iconActor = new ImageIcon (imageActor);

		
		pictureLabelElmo = new JLabel(iconElmo);
		add(pictureLabelElmo);
		
		pictureLabelActor = new JLabel(iconActor);
		add(pictureLabelActor);
		
		JButton mixButton = new JButton ("Mix");
		mixButton.addActionListener(this);
		add(mixButton);
	}
	
	
	public static void main (String[] args) throws IOException
	{
		MixingPictures obj = new MixingPictures();
		obj.setVisible(true);	
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		String result = e.getActionCommand();
		
		if (result.equals("Mix"))
		{
			if (counter % 2 == 1)
			{
				pictureLabelElmo.setVisible(false);
				pictureLabelActor.setVisible(true);

				
			}
			if (counter % 2 == 0)
			{
				pictureLabelElmo.setVisible(true);
				pictureLabelActor.setVisible(false);

			}
			counter++;
			
			for (int y = 0; y < imageActor.getHeight(); y = y + 2)
			{
				for (int x = 0; x <imageActor.getWidth(); x = x +2)
				{
					Color oldC = new Color (imageActor.getRGB(x, y));
					imageElmo.setRGB(x, y, oldC.getRGB());

				}
			}
			ImageIcon icon = new ImageIcon (imageElmo);
			pictureLabelActor.setIcon(icon);
		}

		}
}
		

