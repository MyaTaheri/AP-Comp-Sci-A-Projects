import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.*;

public class KeyboardMovement extends JPanel implements KeyListener{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		JFrame frame = new JFrame("Keyboard movement");
		KeyboardMovement game = new KeyboardMovement();
		frame.add(game);
		frame.setSize(700,500);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

	@Override
	public void keyTyped(KeyEvent e) 
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) 
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) 
	{
		// TODO Auto-generated method stub
		
	}

}
