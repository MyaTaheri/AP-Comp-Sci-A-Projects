package Guis;


import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.*;

public class TempConvertion extends JFrame implements ActionListener
{
	JComboBox combo1;
	JTextField original;
	JLabel answer;
	JLabel converted;
	

	public static void main (String[] args) throws IOException
	{
		TempConvertion obj = new TempConvertion();
		obj.setVisible(true);	
	
	}

	public TempConvertion() throws IOException
	{
		super ("Combo Box");
		setSize (900, 650);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel nPanel = new JPanel();
		setLayout (new FlowLayout());
		
		
		original = new JTextField("0", 10);
		add (original);
		
		combo1 = new JComboBox();
		
		
		combo1.addItem("Farenheit");
		combo1.addItem("Celcius");
		
		
		add (combo1);
		combo1.addActionListener(this);
		
		converted = new JLabel ("Converted Temperature");
		add (converted);
	 
	}
	
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		String place = (String)(combo1.getSelectedItem());
		double degrees = 0;
		
		if (place.equals("Celcius"))
		{
			
			degrees = ((9.0/5.0) * Double.parseDouble(original.getText())) + 32.0;
			converted.setText(String.valueOf(degrees));
		}
		
		if (place.equals("Farenheit"))
		{				
		
			degrees = ((5.0/9.0) * (Double.parseDouble(original.getText()) - 32.0));
			converted.setText(String.valueOf(degrees));
		}
		
	}
	
}
