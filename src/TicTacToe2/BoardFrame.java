package TicTacToe2;

import java.awt.*;

import javax.swing.*;

public class BoardFrame extends JFrame
{
	
	TicTacToeModel bd;

	public BoardFrame(TicTacToeModel bd)
	{
		this.bd = bd;
	}
		
	public void init ()
	{
		setSize(600,600);
		GridLayout gridLayout = new GridLayout(3,3);
		setLayout(gridLayout);
		Container p = getContentPane();
		p.add(new CellPanel(1,1, bd));
		p.add(new CellPanel(1, 2, bd));
		p.add(new CellPanel(1,3, bd));
		p.add(new CellPanel(2,1, bd));
		p.add(new CellPanel(2,2,bd));
		p.add(new CellPanel(2,3,bd));
		p.add(new CellPanel(3,1,bd));
		p.add(new CellPanel(3,2, bd));
		p.add(new CellPanel(3,3, bd));
		setVisible(true);



	}
	
	

}

