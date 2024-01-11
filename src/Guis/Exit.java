package Guis;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Exit extends JFrame implements ActionListener
{
	JLabel icon1Label;
	JLabel icon2Label;
	JLabel foulOrNot;
	int counter = 0;
	
	public Exit()
	{
		super ("Foul or Not");
		setSize (1200, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		
		JButton exitButton = new JButton ("EXIT");
		exitButton.addActionListener(this);
		add(exitButton);
		
		JButton checkButton = new JButton ("CHECK");
		checkButton.addActionListener(this);
		add(checkButton);
		
		ImageIcon icon1 = new ImageIcon ("fail1.jpeg");
		icon1Label = new JLabel (icon1);
		add(icon1Label);	
		
		ImageIcon icon2 = new ImageIcon ("fail2.png");
		icon2Label = new JLabel (icon2);
		add(icon2Label);
		icon2Label.setVisible(false);
		
		foulOrNot = new JLabel ("Is this a foul or not?");
		add (foulOrNot);
		
		JButton noButton = new JButton("NO");
		noButton.addActionListener(this);
		add(noButton);
		
		JButton yesButton = new JButton("YES");
		yesButton.addActionListener(this);
		add(yesButton);
		
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		String word = e.getActionCommand();
		if (word.equals("EXIT"))
			System.exit(0);
		if (word.equals("CHECK"))
		{
			if (counter % 2 == 1) 
			{
				icon1Label.setVisible(true);
				icon2Label.setVisible(false);
			}
			if (counter % 2 == 0) 
			{
				icon2Label.setVisible(true);
				icon1Label.setVisible(false);

			}
			
			counter++;
			foulOrNot.setText("Is this a foul or not?");


		}
		if(word.equals("YES"))
			foulOrNot.setText("Correct - that is a foul");
		if(word.equals("NO"))
			foulOrNot.setText("Incorrect -  that was a foul");
			
		
	}

}
