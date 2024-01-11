package Guis;

import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.*;


public class ComboBox extends JFrame implements ActionListener
{
	
	JComboBox combo1;	
	JLabel cost;
	JTextField bill;
	double totalBill;
	
	public static void main (String[] args) throws IOException
	{
		ComboBox obj = new ComboBox();
		obj.setVisible(true);	}

	public ComboBox() throws IOException
	{
		super ("Combo Box");
		setSize (900, 650);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel nPanel = new JPanel();
		setLayout (new FlowLayout());
		
		totalBill = 0.0;
		
		cost = new JLabel (Double.toString(totalBill));
		add (cost);
		
		bill = new JTextField("0", 10);
		add (bill);
				
		
		combo1 = new JComboBox();
		
		
		combo1.addItem("Falls Church, VA");
		combo1.addItem("Washington, DC");
		combo1.addItem("New York City, NY");
		
		add (combo1);
		combo1.addActionListener(this);

	
	}
	
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		String place = (String)(combo1.getSelectedItem());
		
		
		if (place.equals("Falls Church, VA"))
		{
			totalBill = Double.parseDouble(bill.getText()) * 1.08;
			cost.setText(Double.toString(totalBill));
		}
		if (place.equals("Washington, DC"))
		{				
			totalBill = Double.parseDouble(bill.getText()) * 1.10;
			cost.setText(Double.toString(totalBill));
		}
		if (place.equals("New York City, NY"))
		{
			totalBill = Double.parseDouble(bill.getText()) * 1.11;
			cost.setText(Double.toString(totalBill));
		}
		
		
		
	}
	


}
