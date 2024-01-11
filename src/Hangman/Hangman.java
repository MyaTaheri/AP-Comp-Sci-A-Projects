package Hangman;

import java.awt.*;
import javax.swing.*;


public class Hangman 
{
	//----------------------------------------------------------------------
	// Public Methods
	//----------------------------------------------------------------------

	public void init ()
	{
		// Create a single model object to share with all panels
		HangmanModel hm = new HangmanModel();
		hm.init();
		
		// Create a frame that will contain all the panel
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setPreferredSize(new Dimension(600,400));
		
        // Use a GridBagLayout to layout the panels in the frame
		GridBagLayout layout = new GridBagLayout();
		frame.setLayout(layout);

		
		// Add the drawing canvas
		HangmanCanvas hmCanvas = new HangmanCanvas(hm);
		GridBagConstraints canvasConstraints = new GridBagConstraints();
		canvasConstraints.gridwidth = 4;
		canvasConstraints.gridheight = 4;
		canvasConstraints.fill = GridBagConstraints.BOTH;
		canvasConstraints.gridx = 0;
		canvasConstraints.gridy = 0;
		canvasConstraints.weightx = 0.5;
		canvasConstraints.weighty = 1;
		frame.add(hmCanvas, canvasConstraints);
		
		
		// Add the results panel for showing the letter
		ResultPanel resultPanel = new ResultPanel(hm);
		GridBagConstraints resultPanelConstraints = new GridBagConstraints();
		resultPanelConstraints.fill = GridBagConstraints.BOTH;
		resultPanelConstraints.gridwidth = 4;
		resultPanelConstraints.gridheight = 4;
		resultPanelConstraints.gridx = 4;
		resultPanelConstraints.gridy = 0;
		resultPanelConstraints.weightx = 0.5;
		canvasConstraints.weighty = 1;
		frame.add(resultPanel, resultPanelConstraints);

		// Add the input panel for keyboard
		InputPanel inputPanel = new InputPanel(hm);
		inputPanel.init();

		GridBagConstraints inputPanelConstraints = new GridBagConstraints();
		inputPanelConstraints.gridwidth = 8;
		inputPanelConstraints.gridheight = 2;
		inputPanelConstraints.fill = GridBagConstraints.BOTH;
		inputPanelConstraints.gridx = 0;
		inputPanelConstraints.gridy = 4;
		inputPanelConstraints.weightx = 1;
		canvasConstraints.weighty = 1;
		frame.add(inputPanel, inputPanelConstraints);
		
		// Show the frame
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        

		hm.registerView(hmCanvas);
		hm.registerView(resultPanel);
	}
	
	//----------------------------------------------------------------------
	// Main Method
	//----------------------------------------------------------------------

	public static void main (String[] args)
	{
		Hangman h = new Hangman();
		h.init();
		
		

		//ISSUE HERE
		

	}

	

}