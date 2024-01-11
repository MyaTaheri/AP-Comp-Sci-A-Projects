package Guis;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class FirstGui extends JFrame implements ActionListener {
	
	JLabel icon1Label;
	JLabel icon2Label;			
	int counter = 0;


	
	public FirstGui()
	{
		super("Picture Graphical User Interfaces");
		setSize(800, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout (new FlowLayout());
		JLabel qbLabel = new JLabel ("Text");
		add(qbLabel);
		JLabel tennisLabel = new JLabel ("MORE text");
		add (tennisLabel);
		JTextField name = new JTextField("Even MORE text", 10);
		//10 = how long
		add (name);
		JButton changePictureButton = new JButton("Change");
		changePictureButton.addActionListener(this);
		add (changePictureButton);
		ImageIcon icon1 = new ImageIcon ("frog.jpeg");
		icon1Label = new JLabel (icon1);
		add(icon1Label);	
		ImageIcon icon2 = new ImageIcon ("duck.jpg");
		icon2Label = new JLabel (icon2);
		add(icon2Label);
		}

	@Override
	public void actionPerformed(ActionEvent e) {
		String rst = e.getActionCommand();
		if (rst.equals("CHANGE"));
		{
			
			if (counter % 2 == 0) 
			{
				icon1Label.setVisible(true);
				icon2Label.setVisible(false);
			}
			if (counter % 2 == 1) 
			{
				icon2Label.setVisible(true);
				icon1Label.setVisible(false);

			}
			
			counter++;

		}
		
	}

}
