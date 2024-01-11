package Hangman;

import java.awt.*;

import javax.swing.JFrame;
import javax.swing.WindowConstants;


public class ResultPanel extends Canvas implements HangmanViewListener 
{	
	//----------------------------------------------------------------------
	// Constants
	//----------------------------------------------------------------------
	
	private final static Color GREY = new Color (238,238,238);
	private final static int NUM_PART_IN_SEGMENT = 5;
	private final static int NUM_PART_IN_GAP = 1;
	
	//----------------------------------------------------------------------
	// Member Variables
	//----------------------------------------------------------------------

	private HangmanModel model;
	private int panelWidth;
	private int panelHeight;
	private int lineWidth;
	private int numberOfParts;
	private int numberOfPartsDrawn;
	private int lengthOfEachPart;
	private int leftPointX;
	private int constantY;
	private int rightPointX;
	private int letterConstantY;
	private int fontSize;
	private int brushStrokeSize;
	private int numSegments;
	private int numGaps;
	
	//----------------------------------------------------------------------
	// Constructor
	//----------------------------------------------------------------------

	public ResultPanel(HangmanModel hm)
	{
		this.model = hm;
	}
	
	//----------------------------------------------------------------------
	// Public Methods
	//----------------------------------------------------------------------

	public void refreshView()
	{
		repaint();
	}
	
	@Override
	public void paint(Graphics g)
	{	
		panelWidth = getWidth();
	    panelHeight = getHeight();
	    lineWidth = (int)Math.round(panelWidth * 0.8);
		numSegments = this.model.getWordLength();
		numGaps = numSegments -1;
		numberOfParts = (NUM_PART_IN_SEGMENT * numSegments) + (numGaps * NUM_PART_IN_GAP);
		numberOfPartsDrawn = 0;
		lengthOfEachPart = lineWidth / numberOfParts;
		leftPointX = (int)Math.round(panelWidth * 0.1);
		constantY = (int)Math.round(panelHeight * 0.5);
		letterConstantY = (int)Math.round(constantY - (0.02 * panelHeight));
		fontSize = (int)Math.round(panelWidth * 0.15);
		brushStrokeSize = (int)Math.round(panelWidth * 0.005);
	
		
		//drawLine(g);
		char[] guessResults = model.getGuessResults();
		
		for (int i = 0; i < guessResults.length; i++)
		{
			String s = Character.toString(guessResults[i]);
			drawSegment(g,s);
			drawGap(g);
		}
		
		/*
		drawSegment(g, "f");
		drawGap(g);
		drawSegment(g, "");
		drawGap(g);
		drawSegment(g, "o");
		drawGap(g);
		drawSegment(g, "w");
		drawGap(g);
		drawSegment(g, "");
		drawGap(g);
		drawSegment(g, "");
		*/
		
	}
	
	/*
	 * draw the gap between the segment
	 */
	public void drawGap(Graphics g)
	{
		Graphics2D g2d = (Graphics2D)g;
		g.setColor(GREY);
	   // g2d.setStroke(new BasicStroke(3));
	    g2d.setStroke(new BasicStroke(brushStrokeSize));
	    
	    int panelWidth = getWidth();
	    int panelHeight = getHeight();
	    int lineWidth = (int)Math.round(panelWidth * 0.8);
	    
	    leftPointX = (int)Math.round(rightPointX + lengthOfEachPart);
		g.drawLine(rightPointX, constantY, leftPointX, constantY);
		numberOfPartsDrawn = numberOfPartsDrawn + NUM_PART_IN_GAP;
	 
		
	}
	
	/*
	 * draw the segment and show the corresponding letter
	 */
	
	public void drawSegment(Graphics g, String letter)
	{
		Graphics2D g2d = (Graphics2D)g;
		g.setColor(Color.black);
	   // g2d.setStroke(new BasicStroke(3));
	    g2d.setStroke(new BasicStroke(brushStrokeSize));

		
	    int panelWidth = getWidth();
	    int panelHeight = getHeight();
	    int lineWidth = (int)Math.round(panelWidth * 0.8);
	    
	    g.setColor(Color.black);
		rightPointX = (int)Math.round(leftPointX + (lengthOfEachPart * NUM_PART_IN_SEGMENT));
		g.drawLine (leftPointX, constantY, rightPointX, constantY);
		numberOfPartsDrawn = numberOfPartsDrawn + NUM_PART_IN_SEGMENT;
		
		int midpointOfSegment = (int)Math.round((leftPointX + rightPointX) * 0.5);
		
		
		Font stringFont = new Font( "SansSerif", Font.PLAIN, this.fontSize);
		g2d.setFont( stringFont );
		
		int letterX = (int)Math.round(midpointOfSegment - (0.045 * panelWidth));
		
	    g2d.drawString(letter, letterX, letterConstantY);

		
	    
	    
		
	}
	
	//----------------------------------------------------------------------
	// Main Method
	//----------------------------------------------------------------------

	public static void main (String[] args)
	{
		HangmanModel hm= new HangmanModel();
		ResultPanel rp = new ResultPanel(hm);
		JFrame frame = new JFrame();
		
		
		frame.add(rp);
		frame.setSize(600,600);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

	}
	/*
	private void drawLine (Graphics g)
	{
		Graphics2D g2d = (Graphics2D)g;
		g.setColor(Color.black);
	    g2d.setStroke(new BasicStroke(3));
	   
	    int panelWidth = getWidth();
	    int panelHeight = getHeight();
	    int lineWidth = (int)Math.round(panelWidth * 0.8);
	    
	   // int leftPointX = (int)Math.round(panelWidth * 0.1);
	   // int leftPointY = (int)Math.round(panelHeight * 0.5);
	   // int rightPointX = leftPointX + lineWidth;
	   // int rightPointY = leftPointY;
	//	g.drawLine(leftPointX, leftPointY, rightPointX, rightPointY);
		
	    int numPartInSegment = 5;
	    int numPartInGap = 1;
	  //  int numLetterParts = this.word.length() * numPartInSegment;
	  //  int numGapParts = this.word.length() * numPartInGap - 1;
	  //  int numTotalParts = numLetterParts + numGapParts;
	    
		int numberOfParts = (numPartInSegment * this.word.length()) + ((this.word.length() * numPartInGap) - 1);
		int numberOfPartsDrawn = 0;
		int lengthOfEachPart = lineWidth / numberOfParts;
		Color grey = new Color (238,238,238);
		int leftPointX = (int)Math.round(panelWidth * 0.1);
		int constantY = (int)Math.round(panelHeight * 0.5);
		
		while (numberOfPartsDrawn <= numberOfParts)
		{
			//draw a segment
			g.setColor(Color.black);
			int rightPointX = (int)Math.round(leftPointX + (lengthOfEachPart * numPartInSegment));
			g.drawLine (leftPointX, constantY, rightPointX, constantY);
			numberOfPartsDrawn = numberOfPartsDrawn + numPartInSegment;
			//draw a gap
			g.setColor(grey);
			leftPointX = (int)Math.round(rightPointX + lengthOfEachPart);
			g.drawLine(rightPointX, constantY, leftPointX, constantY);
			numberOfPartsDrawn = numberOfPartsDrawn + numPartInGap;
		}
		*/
		
	/*
	private void getHeightTest ()
	{
		System.out.println(getPanelHeight());
	}
	
	public int getPanelHeight () 
	{
	    return Math.round(super.getHeight());
	  }
	
	public int getWidth()
	{
		return Math.round(super.getWidth());
	}

*/
	
	}
