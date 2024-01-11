package TicTacToe2;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import javax.swing.border.Border;


import javax.swing.*;



public class CellPanel extends JPanel
{
	TicTacToeModel bd;
	int row;
	int col;

	public CellPanel(int row, int col, TicTacToeModel bd)
	{
		super();
		this.bd = bd;
		this.row = row;
		this.col = col;
		Border border = BorderFactory.createLineBorder(Color.black);
		this.setBorder(border);
		this.enableEvents(MouseEvent.MOUSE_EVENT_MASK);
		
	}
	
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		
		drawMove(g);
		
		//bd.check(row, col);
		
	}
	
	@Override
	protected void processMouseEvent(MouseEvent me) 
	{
		super.processMouseEvent(me);
		if (me.getButton() == MouseEvent.BUTTON1) 
		{
			if (me.getID() == MouseEvent.MOUSE_CLICKED)
			{
				Graphics g = me.getComponent().getGraphics();
				
					bd.setMove(this.row, this.col);
					drawMove(g);

					char winner = bd.getGameStatus();
							
					if (winner == 'X' )	
					{
						JOptionPane.showMessageDialog(this.getParent(), "X Won!!");
					}
					else if (winner == 'O')
					{
						JOptionPane.showMessageDialog(this.getParent(), "O Won!!");
	
					}
					else if (winner == 'T')
					{
						JOptionPane.showMessageDialog(this.getParent(), "Tie Game");
					}
					//Else: No winner yet
			}
			
		}
	}
	
	@Override
	protected void processKeyEvent(KeyEvent ke) {
		super.processKeyEvent(ke);
	}
	
	
	
	
	private void drawX(Graphics g)
	{
		//orange?
	
		Graphics2D g2d = (Graphics2D)g;
		

		Dimension d = this.getSize();
		
		
		double w = d.getWidth();
		double h = d.getHeight();
		double adjust = 0.25;
		
		//thicker line
	    g2d.setStroke(new BasicStroke(3));
	    

	    Color orange = new Color(242, 129, 53);
	    g2d.setColor(orange);
	    
	    int line1X1 = (int)Math.round(w * adjust);
		int line1Y1 = (int)Math.round(h * adjust);
		int line1X2 = (int)Math.round(w - (adjust * w));
		int line1Y2 = (int)Math.round(h - (h * adjust));
		
		g2d.drawLine(line1X1, line1Y1, line1X2, line1Y2);
		
		int line2X1 = (int)Math.round(w * adjust);
		int line2Y1 = (int)Math.round(h - (h * adjust));
		int line2X2 = (int)Math.round(w - (w * adjust));
		int line2Y2 = (int)Math.round(h * adjust);
		
		g2d.drawLine(line2X1, line2Y1, line2X2, line2Y2);


	}

	
	private void drawO(Graphics g)
	{
		Graphics2D g2d = (Graphics2D)g;
		

		
		Dimension d = this.getSize();
		
		
		double w = d.getWidth();
		double h = d.getHeight();
		double adjust = 0.25;
		
		//thicker line
	    g2d.setStroke(new BasicStroke(3));
	    
	    Color blue = new Color(72,107,232);
	    g2d.setColor(blue);
	
		int circleX = (int)Math.round(w * adjust);
		int circleY = (int)Math.round(h * adjust);
		int circleWidth = (int)Math.round(w * 0.5);
		int circleHeight = (int)Math.round(h * 0.5);

		g2d.drawOval(circleX, circleY, circleWidth, circleHeight);

	}
	
	private void drawMove(Graphics g)
	{
		
		if (bd.getMove(this.row, this.col) == 'X')
		{
			drawX(g);
		}
		else if (bd.getMove(this.row, this.col) == 'O')
		{
			drawO(g);
		}
		else
		{
			
		}
	}
	
	
	
	
	}
