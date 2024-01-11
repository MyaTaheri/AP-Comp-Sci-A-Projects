package Guis;


import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.*;

public class Calculator extends JFrame implements ActionListener
{
	JComboBox combo1;
	JTextField num1;
	JTextField num2;
	JLabel answer;
	double result = 0.0;
	

	public static void main (String[] args) throws IOException
	{
		Calculator obj = new Calculator();
		obj.setVisible(true);	
		}

	public Calculator() throws IOException
	{
		super ("Combo Box");
		setSize (900, 650);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel nPanel = new JPanel();
		setLayout (new FlowLayout());
		
		
		num1 = new JTextField("0", 10);
		add (num1);
		
		num2 = new JTextField("0", 10);
		add (num2);
		
		combo1 = new JComboBox();
		
		
		combo1.addItem("+");
		combo1.addItem("-");
		combo1.addItem("/");
		combo1.addItem("*");
		
		add (combo1);
		combo1.addActionListener(this);
		
		
		answer = new JLabel(String.valueOf(result));
		add (answer);

	
	}
	
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		String place = (String)(combo1.getSelectedItem());
		
		if (place.equals("+"))
		{
			result = Double.parseDouble(num1.getText()) + Double.parseDouble(num2.getText());
			answer.setText(String.valueOf(result));
		}
		
		if (place.equals("-"))
		{				
			result = Double.parseDouble(num1.getText()) - Double.parseDouble(num2.getText());
			answer.setText(String.valueOf(result));
		}
		if (place.equals("/"))
		{
			result = Double.parseDouble(num1.getText()) / Double.parseDouble(num2.getText());
			answer.setText(String.valueOf(result));
		}
		if (place.equals("*"))
		{
			result = Double.parseDouble(num1.getText()) * Double.parseDouble(num2.getText());
			answer.setText(String.valueOf(result));
		}
		
		
		
	}
	
}
