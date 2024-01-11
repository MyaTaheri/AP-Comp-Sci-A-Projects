package Hangman;

import java.awt.*;
import java.awt.geom.AffineTransform;

import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class HangmanCanvas extends Canvas implements HangmanViewListener 
{
	

	//----------------------------------------------------------------------
	// Member Variables
	//----------------------------------------------------------------------
	
	private HangmanModel hm = null;
	
	//----------------------------------------------------------------------
	// Constructor
	//----------------------------------------------------------------------

	public HangmanCanvas(HangmanModel hm)
	{
		this.hm = hm;
	}
	
	//----------------------------------------------------------------------
	// Main Method
	//----------------------------------------------------------------------

	public static void main (String[] args)
	{
		HangmanModel hm2 = new HangmanModel();
		
		hm2.init();
		
		HangmanCanvas hgt = new HangmanCanvas(hm2);
		JFrame frame = new JFrame();
		
		
		//Case 1: Make No guesses (Check)
		//Should draw just the noose
		
		
		//Case 2: Make a Right Guess (Check)
		// Should draw just the noose
		//hm2.guess('e');
		
		//Case 3: Make a Right Guess, then a wrong guess
		 //Should draw just the noose and a head
		// hm2.guess('e');
		// hm2.guess('x');
		// System.out.println(hm2.getStep());
		
		//Case 4: Make a right guess, then wrong guess, then right guess  
		// Should draw noose and head 
	//	hm2.guess('g');
		//hm2.guess('x');
		//hm2.guess('a');
		
		//Case 5: Make a right guess, then wrong guess, then right guess, then wrong guess
		// Should draw noose and head and neck
		//hm2.guess('g');
		//hm2.guess('x');
		//hm2.guess('z');
		
//		
		
		frame.add(hgt);
		frame.setSize(600,600);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
		
		
		//4 cases:
		//Make no guesses and should print default
		// make right guess and it should print the default
		/// make one wrong guess and it should print one additional part
		//make a right guess and it shouldn't change the picture.
		
		


		

		
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
		if (hm.getStep() == 0)
		{
			stepZero(g);
		}
		else if (hm.getStep() == 1)
		{
			stepZero(g);
			stepOne(g);
		}
		else if (hm.getStep() == 2)
		{
			stepZero(g);
			stepOne(g);
			stepTwo(g);

		}
		else if (hm.getStep() == 3)
		{
			stepZero(g);
			stepOne(g);
			stepTwo(g);
			stepThree(g);
		}
		else if (hm.getStep() == 4)
		{
			stepZero(g);
			stepOne(g);
			stepTwo(g);
			stepThree(g);
			stepFour(g);
		}
		else if (hm.getStep() == 5)
		{
			stepZero(g);
			stepOne(g);
			stepTwo(g);
			stepThree(g);
			stepFour(g);
			stepFive(g);
		} 
		else if (hm.getStep() == 6)
		{
			stepZero(g);
			stepOne(g);
			stepTwo(g);
			stepThree(g);
			stepFour(g);
			stepFive(g);
			stepSix(g);
		}
		else if (hm.getStep() == 7)
		{
			stepZero(g);
			stepOne(g);
			stepTwo(g);
			stepThree(g);
			stepFour(g);
			stepFive(g);
			stepSix(g);
			stepSeven(g);
		}
		else
		{
			loseGame(g);
		}
	}
	
	
	public int getHeight () 
	{
	    return Math.round(super.getHeight()+ 22);
	}
	
	public int getWidth()
	{
		return Math.round(super.getWidth());
	}

	//----------------------------------------------------------------------
	// Private Methods
	//----------------------------------------------------------------------
	
	private void stepZero(Graphics g)
	{
		Graphics2D g2d = (Graphics2D)g;
		g.setColor(Color.black);
	    g2d.setStroke(new BasicStroke(4));

		int y1PostV1 = (int)Math.round(getHeight() * 0.15384615);
		int x1PostV1 = (int)Math.round(getWidth() * 0.16666666);
		int y2PostV1 = (int)Math.round(getHeight() * 0.84615385);
		int x2PostV1 = (int)Math.round(getWidth() * 0.16666666);
		g.drawLine(x1PostV1, y1PostV1, x2PostV1, y2PostV1);
		
		int y1PostV2 = (int)Math.round(getHeight() * 0.15384615);
		int x1PostV2 = (int)Math.round(getWidth() * 0.5);
		int y2PostV2 = (int)Math.round(getHeight() * 0.25);
		int x2PostV2 = (int)Math.round(getWidth() * 0.5);
		g.drawLine(x1PostV2, y1PostV2, x2PostV2, y2PostV2);
		
		
		int x1PostH1 = (int)Math.round(getWidth() * 0.16666666);
		int y1PostH1 = (int)Math.round(getHeight() * 0.15384615);
		int x2PostH1 = (int)Math.round(getWidth() * 0.5);
		int y2PostH1 = (int)Math.round(getHeight() * 0.15384615);
		g.drawLine(x1PostH1, y1PostH1, x2PostH1, y2PostH1);
		
		int x1PostH2 = (int)Math.round(getWidth() * 0.05);
		int y1PostH2 = (int)Math.round(getHeight() * 0.84615385);
		int x2PostH2 = (int)Math.round(getWidth() * 0.33333334);
		int y2PostH2 = (int)Math.round(getHeight() * 0.84615385);
		g.drawLine(x1PostH2, y1PostH2, x2PostH2, y2PostH2);
		
		

	}
	
	private void stepOne (Graphics g)
	{			

		Graphics2D g2d = (Graphics2D)g;
		Color darkPurple = new Color(66, 12, 164);
		g.setColor(darkPurple);
		g2d.setStroke(new BasicStroke(3));

		int Xdiameter = (int)Math.round(getWidth() * 0.18384615);
		int Ydiameter = (int)Math.round(getHeight() * 0.18384615);
		int xCircle = (int)Math.round(getWidth() * 0.408076925); //
		int yCircle = (int)Math.round(getHeight() * 0.25);
		
		g.drawOval(xCircle, yCircle, Xdiameter, Ydiameter);
	}
	
	private void stepTwo(Graphics g)
	{
		
		Graphics2D g2d = (Graphics2D)g;
		Color darkPurple = new Color(66, 12, 164);
		g.setColor(darkPurple);		   
		g2d.setStroke(new BasicStroke(3));
	    
		//int Xdiameter = (int)Math.round(getWidth() * 0.18384615);
		//int Ydiameter = (int)Math.round(getHeight() * 0.18384615);
		int x1Body = (int)Math.round(getWidth() * 0.5);
		int y1Body = (int)Math.round(getHeight() * 0.43384615);
		int x2Body = (int)Math.round(getWidth() * 0.5);
		int y2Body = (int)Math.round(((getHeight() * 0.6)));
		
		g.drawLine(x1Body, y1Body, x2Body, y2Body);
	}
	
	private void stepThree (Graphics g)
	{
		Graphics2D g2d = (Graphics2D)g;
		Color darkPurple = new Color(66, 12, 164);
		g.setColor(darkPurple);		   
		g2d.setStroke(new BasicStroke(3));
		
		int y1LArm = (int)Math.round(((getHeight() * 0.45846154)));
		int y2LArm = (int)Math.round(getHeight() * 0.54);
		int x1LArm = (int)Math.round(getWidth() * 0.5);
		int x2LArm = (int)Math.round(getWidth() * 0.45);
				
		g.drawLine(x1LArm, y1LArm, x2LArm, y2LArm);

	}
	
	private void stepFour (Graphics g)
	{
		Graphics2D g2d = (Graphics2D)g;
		Color darkPurple = new Color(66, 12, 164);
		g.setColor(darkPurple);		   
		g2d.setStroke(new BasicStroke(3));
		
		int y1RArm = (int)Math.round(getHeight() * 0.45846154);
		int y2RArm = (int)Math.round(getHeight() * 0.54);//0.84891741
		int x1RArm = (int)Math.round(getWidth() * 0.5);
		int x2RArm = (int)Math.round(getWidth() * 0.55);
		
				
		g.drawLine(x1RArm, y1RArm, x2RArm, y2RArm);

	}
	
	private void stepFive (Graphics g)
	{
		Graphics2D g2d = (Graphics2D)g;
		Color darkPurple = new Color(66, 12, 164);
		g.setColor(darkPurple);		   
		g2d.setStroke(new BasicStroke(3));
		
		int y1RLeg = (int)Math.round(getHeight() * 0.66538661);//1.25544644
		int y2RLeg = (int)Math.round(getHeight() * 0.6);
		int x1RLeg = (int)Math.round(getWidth() * 0.54);
		int x2RLeg = (int)Math.round(getWidth() * 0.5);
				
		g.drawLine(x1RLeg, y1RLeg, x2RLeg, y2RLeg);

	}
	
	private void stepSix (Graphics g)
	{
		Graphics2D g2d = (Graphics2D)g;
		Color darkPurple = new Color(66, 12, 164);
		g.setColor(darkPurple);		   
		g2d.setStroke(new BasicStroke(3));
		
		int y1LLeg = (int)Math.round(getHeight() * 0.6);//1.25544644
		int x1LLeg = (int)Math.round(getWidth() * 0.5);
		int y2LLeg = (int)Math.round(getHeight() * 0.66538661);
		int x2LLeg = (int)Math.round(getWidth() * 0.46);
				
		g.drawLine(x1LLeg, y1LLeg, x2LLeg, y2LLeg);

	}
	
	private void stepSeven(Graphics g)
	{
		Graphics2D g2d = (Graphics2D)g;
		Color darkPurple = new Color(66, 12, 164);
		g.setColor(darkPurple);		   
		g2d.setStroke(new BasicStroke(3));
		
		int Ydiameter = (int)Math.round(getHeight() * 0.028384615);
		int Xdiameter = (int)Math.round(getWidth() * 0.028384615);
		int lEyeX = (int)Math.round((getWidth() * 0.485) - Xdiameter);
		int lEyeY = (int)Math.round((getHeight() * 0.355));
		
		g.fillOval(lEyeX, lEyeY, Xdiameter, Ydiameter);
		
		int rEyeX = (int)Math.round((getWidth() * 0.54280887) - Xdiameter); //0.9178088799999999 //0,.44280887
		int rEyeY = (int)Math.round((getHeight() * 0.355));
		
		g.fillOval(rEyeX, rEyeY, Xdiameter, Ydiameter);
		
		int headDiameter = (int)Math.round(getHeight() * 0.18384615);
		
		g2d.setStroke(new BasicStroke(2));

		int rEyebrowX = (int)Math.round(((getWidth() * 0.565) - Xdiameter));
		int rEyebrowY = (int)Math.round(((getHeight() * 0.365) - Ydiameter));
		int rEyebrowW = (int)Math.round(getWidth() * 0.025);
		int rEyebrowH = (int)Math.round(getHeight() * 0.1);
		
		g.drawArc(rEyebrowX,rEyebrowY, rEyebrowW, rEyebrowH, 19, 87);
		
		
		int lEyebrowX = (int)Math.round(((getWidth() * 0.062) - Xdiameter));
		int lEyebrowY = (int)Math.round(((getHeight() * 0.092) - Ydiameter));
		int lEyebrowW = (int)Math.round(getWidth() * 0.025);
		int lEyebrowH = (int)Math.round(getHeight() * 0.1);
		int startAngle = -19;
		int arcAngle = -87;
		
		AffineTransform oldXForm = g2d.getTransform();

		g2d.translate(getWidth() *0.5, getHeight() * 0.5);
		g2d.rotate(Math.toRadians(180));
		
		g.drawArc(lEyebrowX,lEyebrowY, lEyebrowW, lEyebrowH, startAngle, arcAngle);			

		g2d.translate(0, 0);

		int frownX = (int)Math.round(getWidth() * 0.475);
		int frownY = (int)Math.round(getHeight() * 0.4);
		int frownWidth = (int)Math.round(getWidth() * 0.04780887);
		int frownHeight = (int)Math.round(getHeight() * 0.025);;
		
		g2d.setTransform(oldXForm);
		g.drawArc(frownX, frownY, frownWidth, frownHeight, 10 , 115 );
		

		
	}
	
	private void loseGame (Graphics g) 
	{
	
		
		g.clearRect(0, 0, getWidth(), getHeight());
		
		stepZero(g);
		stepOne(g);
		stepTwo(g);
		stepThree(g);
		stepFour(g);
		stepFive(g);
		stepSix(g);
		//stepSeven(g);
		
		Graphics2D g2d = (Graphics2D)g;
		Color darkRed = new Color(95, 4, 29 );
		g.setColor(darkRed);		   
		g2d.setStroke(new BasicStroke(3));
		
		int Ydiameter = (int)Math.round(getHeight() * 0.028384615);
		int Xdiameter = (int)Math.round(getHeight() * 0.028384615);


		int l1DeadEyeX1 = (int)Math.round((getWidth() * 0.485) - Xdiameter);
		int l1DeadEyeY1 = (int)Math.round((getHeight() * 0.355));
		int l1DeadEyeX2 = (int)Math.round((getWidth() * 0.485));
		int l1DeadEyeY2 = (int)Math.round((getHeight() * 0.355 + Ydiameter));			
		g.drawLine(l1DeadEyeX1, l1DeadEyeY1, l1DeadEyeX2, l1DeadEyeY2);
		
		int l2DeadEyeX1 = (int)Math.round((getWidth() * 0.485));
		int l2DeadEyeY1 = (int)Math.round((getHeight() * 0.355));
		int l2DeadEyeX2 = (int)Math.round((getWidth() * 0.485) - Xdiameter);
		int l2DeadEyeY2 = (int)Math.round((getHeight() * 0.355 + Ydiameter));
		g.drawLine(l2DeadEyeX1, l2DeadEyeY1, l2DeadEyeX2, l2DeadEyeY2);
		
		int r1DeadEyeX1 = (int)Math.round((getWidth() * 0.54280887) - Xdiameter);
		int r1DeadEyeY1 = (int)Math.round((getHeight() * 0.355));
		int r1DeadEyeX2 = (int)Math.round((getWidth() * 0.54280887));
		int r1DeadEyeY2 = (int)Math.round((getHeight() * 0.355) + Ydiameter);
		
		g.drawLine(r1DeadEyeX1, r1DeadEyeY1, r1DeadEyeX2, r1DeadEyeY2);
		
		int r2DeadEyeX1 = (int)Math.round((getWidth() * 0.54280887));
		int r2DeadEyeY1 = (int)Math.round((getHeight() * 0.355));
		int r2DeadEyeX2 = (int)Math.round((getWidth() * 0.54280887) - Xdiameter);
		int r2DeadEyeY2 = (int)Math.round((getHeight() * 0.355) + Ydiameter);

		g.drawLine(r2DeadEyeX1, r2DeadEyeY1, r2DeadEyeX2, r2DeadEyeY2);
		
		g2d.setStroke(new BasicStroke(2));
		
		int mouthY = (int)Math.round(getHeight() * 0.02 + (int)Math.round((getHeight() * 0.355) + Ydiameter));
		int mouthX1 = (int)Math.round((getWidth() * 0.53));
		int mouthX2 = (int)Math.round((getWidth() * 0.47280887));
		
		g.drawLine(mouthX1, mouthY, mouthX2, mouthY);
		
	}
	
	private void winGame(Graphics g)
	{
		g.clearRect(0, 0, getWidth(), getHeight());
		
		stepZero(g);
		
		Graphics2D g2d = (Graphics2D)g;
		Color darkPurple = new Color(66, 12, 164);
		g.setColor(darkPurple);		   
		g2d.setStroke(new BasicStroke(3));
		
		//Step Six
		int y1LLeg = (int)Math.round(getHeight() * 0.78076724);//1.25544644
		int x1LLeg = (int)Math.round(getWidth() * 0.7);
		int y2LLeg = (int)Math.round(getHeight() * 0.84615385);
		int x2LLeg = (int)Math.round(getWidth() * 0.66);
				
		g.drawLine(x1LLeg, y1LLeg, x2LLeg, y2LLeg);
		
		//Step Five
		int y2RLeg = (int)Math.round(getHeight() * 0.78076724);//1.25544644
		int y1RLeg = (int)Math.round(getHeight() * 0.84615385);
		int x1RLeg = (int)Math.round(getWidth() * 0.74);
		int x2RLeg = (int)Math.round(getWidth() * 0.7);
		
		g.drawLine(x1RLeg, y1RLeg, x2RLeg, y2RLeg);

		
		//Step Two
		int x1Body = (int)Math.round(getWidth() * 0.7);
		int y1Body = (int)Math.round(((getHeight() * 0.61461339)));
		int x2Body = (int)Math.round(getWidth() * 0.7);
		int y2Body = (int)Math.round(((getHeight() * 0.78076724)));
		
		g.drawLine(x1Body, y1Body, x2Body, y2Body);
		//int y1PostH2 = (int)Math.round(getHeight() * 0.84615385);
		
		//Step Three
		
		int y1LArm = (int)Math.round(((getHeight() * 0.63922928))); //added
		int y2LArm = (int)Math.round(getHeight() * 0.72076774); //added
		int x1LArm = (int)Math.round(getWidth() * 0.65); //added
		int x2LArm = (int)Math.round(getWidth() * 0.7); //added
				
		g.drawLine(x1LArm, y1LArm, x2LArm, y2LArm);
		
		//Step Four
		int y1RArm = (int)Math.round(((getHeight() * 0.63922928)));
		int y2RArm = (int)Math.round(getHeight() * 0.72076774);//0.84891741
		int x1RArm = (int)Math.round(getWidth() * 0.75);	//added
		int x2RArm = (int)Math.round(getWidth() * 0.7); // added
		
				
		g.drawLine(x1RArm, y1RArm, x2RArm, y2RArm);
		
		//Step One
		int Xdiameter = (int)Math.round(getWidth() * 0.18384615);
		int Ydiameter = (int)Math.round(getHeight() * 0.18384615);
		int xCircle = (int)Math.round((getWidth() * 0.7) - (Xdiameter * 0.5));
		int yCircle = (int)Math.round(getHeight() * 0.430766774);
		
		g.drawOval(xCircle, yCircle, Xdiameter, Ydiameter);
		
		//Step Seven
		int YEdiameter = (int)Math.round(getHeight() * 0.028384615);
		int XEdiameter = (int)Math.round(getWidth() * 0.028384615);
		int lEyeX = (int)Math.round((getWidth() * 0.685) - XEdiameter);
		int lEyeY = (int)Math.round((getHeight() * 0.53576774));
		
		g.fillOval(lEyeX, lEyeY, XEdiameter, YEdiameter);
		
		int rEyeX = (int)Math.round((getWidth() * 0.74280887) - XEdiameter); //0.9178088799999999 //0,.44280887
		int rEyeY = (int)Math.round((getHeight() * 0.53576774));
		
		g.fillOval(rEyeX, rEyeY, XEdiameter, YEdiameter);
		
		g2d.setStroke(new BasicStroke(2));
	
		int SWidth = (int)Math.round(Xdiameter * 0.15); //(Xdiameter * 0.5 + 
		int Sx = (int)Math.round(Xdiameter * 0.44 +xCircle);
		int SHeight = (int)Math.round(Ydiameter * 0.1111111111);
		int Sy = (int)Math.round(Ydiameter * 0.75 + yCircle);
		
		g.drawArc(Sx, Sy, SWidth, SHeight,0,-180);
		
		
	}
	
}
