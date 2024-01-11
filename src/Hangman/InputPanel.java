package Hangman;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.border.Border;

//panel w/ buttons
public class InputPanel extends JPanel
{
	//----------------------------------------------------------------------
	// Member Variables
	//----------------------------------------------------------------------
	
	private HangmanModel hm = null;
	
	//----------------------------------------------------------------------
	// Constructor
	//----------------------------------------------------------------------

	public InputPanel(HangmanModel hm)
	{
		this.hm = hm;
	}
	
	//----------------------------------------------------------------------
	// Public Methods
	//----------------------------------------------------------------------
	public void init()
	{
		Border border = BorderFactory.createLineBorder(Color.black);
		this.setBorder(border);
		
	    this.setLayout(new GridLayout(2, 13));
	    
	    Color grey = new Color (194, 198, 209);
	    
	    int i = 0;
	    
	    JButton[] buttonArray = new JButton[26];
	    

	    
	    for (char c = 'a'; c <= 'z'; c++)
	    {
	    	final int buttonIndex = i;	
	    	
		    buttonArray[buttonIndex] = new JButton(String.valueOf(c)); 
		    buttonArray[buttonIndex].setPreferredSize(new Dimension (50,50));
		    this.add(buttonArray[buttonIndex]);
		    
		    buttonArray[buttonIndex].addActionListener(new ActionListener()
		    //JButton b = buttonArray[buttonIndex]
		    //ActionListener a = new ActionListener()
			//b.addActionListener(a)
		    {  
		    	public void actionPerformed(ActionEvent e)
		    	{  

		    		buttonArray[buttonIndex].setBackground(grey);
		    		buttonArray[buttonIndex].setEnabled(false);
		    		char letter=buttonArray[buttonIndex].getText().charAt(0);
		    	   hm.guess(letter);
		    	   
		    	}  
		    });
		    
		    i = i + 1;


	    }
	}
	
	//----------------------------------------------------------------------
	// Main Method
	//----------------------------------------------------------------------
	
	public static void main(String[] args) 
	{  
	    
		JFrame testFrame = new JFrame();
	    testFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	    HangmanModel hm = new HangmanModel();
	    InputPanel panel = new InputPanel(hm);
	    panel.init();

	 
	    testFrame.getContentPane().add(panel);

	    testFrame.pack();
	    testFrame.setLocationRelativeTo(null);
	    testFrame.setVisible(true);
		testFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

	}  
	
}
