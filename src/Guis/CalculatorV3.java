package Guis;

import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.*;

public class CalculatorV3 extends JFrame implements ActionListener
{
	JTextField answerField;
	int[] nums = new int[100];
	String[] operation = new String[100];
	int numCounter;
	int opeartionCounter;

	public static void main (String[] args) throws IOException
	{
		CalculatorV3 obj = new CalculatorV3();
		obj.setVisible(true);	
	}
	
	public CalculatorV3() throws IOException
	{
		super ("Combo Box");
		setSize (900, 650);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel nPanel = new JPanel();
		setLayout (new BorderLayout());
		JPanel northPanel = new JPanel();
			answerField = new JTextField(50);
			northPanel.add(answerField);
//			Font bigFont = answerField.getFont().deriveFont(Font.PLAIN, 100f);
//            answerField.setFont(bigFont);
		add(northPanel,BorderLayout.NORTH);
		
		JPanel centerPanel = new JPanel();
			centerPanel.setLayout(new GridLayout(5,4));
			
			JButton openParen = new JButton ("(");
			centerPanel.add(openParen);
			openParen.addActionListener(this);
			JButton closeParen = new JButton (")");
			centerPanel.add(closeParen);
			closeParen.addActionListener(this);
			JButton percent = new JButton ("%");
			centerPanel.add(percent);
			percent.addActionListener(this);
			JButton clear = new JButton ("C");
			centerPanel.add(clear);
			clear.addActionListener(this);
		
		
			
			JButton seven = new JButton ("7");
			centerPanel.add(seven);
			seven.addActionListener(this);
			JButton eight = new JButton ("8");
			centerPanel.add(eight);
			eight.addActionListener(this);
			JButton nine = new JButton ("9");
			centerPanel.add(nine);
			nine.addActionListener(this);
			JButton divide = new JButton ("/");
			centerPanel.add(divide);
			divide.addActionListener(this);
			
			

			
			JButton four = new JButton ("4");
			centerPanel.add(four);
			four.addActionListener(this);
			JButton five = new JButton ("5");
			centerPanel.add(five);
			five.addActionListener(this);
			JButton six = new JButton ("6");
			centerPanel.add(six);
			six.addActionListener(this);
			JButton times = new JButton ("*");
			centerPanel.add(times);
			times.addActionListener(this);
			
			JButton one = new JButton ("1");
			centerPanel.add(one);
			one.addActionListener(this);
			JButton two = new JButton ("2");
			centerPanel.add(two);
			two.addActionListener(this);
			JButton three = new JButton ("3");
			centerPanel.add(three);
			three.addActionListener(this);
			JButton minus = new JButton ("-");
			centerPanel.add(minus);
			minus.addActionListener(this);
			
			JButton zero = new JButton ("0");
			centerPanel.add(zero);
			zero.addActionListener(this);
			JButton dot = new JButton (".");	
			centerPanel.add(dot);
			dot.addActionListener(this);
			JButton equal = new JButton ("=");
			centerPanel.add(equal);
			equal.addActionListener(this);
			JButton plus = new JButton ("+");
			centerPanel.add(plus);
			plus.addActionListener(this);

		add(centerPanel,BorderLayout.CENTER);
		

	
	}
	
	@Override
	public void actionPerformed(ActionEvent e) 
	{
	
		String result = e.getActionCommand();
		
		if (result.equals("1"))
		{
			answerField.setText(answerField.getText() + "1");
		}
		if (result.equals("2"))
		{
			answerField.setText(answerField.getText() + "2");
		}
		if (result.equals("3"))
		{
			answerField.setText(answerField.getText() + "3");
		}
		if (result.equals("4"))
		{
			answerField.setText(answerField.getText() + "4");
		}
		if (result.equals("5"))
		{
			answerField.setText(answerField.getText() + "5");
		}
		if (result.equals("6"))
		{
			answerField.setText(answerField.getText() + "6");
		}
		if (result.equals("7"))
		{
			answerField.setText(answerField.getText() + "7");
		}
		if (result.equals("8"))
		{
			answerField.setText(answerField.getText() + "8");
		}
		if (result.equals("9"))
		{
			answerField.setText(answerField.getText() + "9");
		}
		if (result.equals("0"))
		{
			answerField.setText(answerField.getText() + "0");
		}
		if (result.equals("."))
		{
			answerField.setText(answerField.getText() + ".");
		}
		
		
		if (result.equals("*"))
		{
			nums[numCounter] = Integer.parseInt(answerField.getText());
			numCounter++;
			answerField.setText(answerField.getText() + "*");
			
				
		}
		if (result.equals("+"))
		{
			nums[numCounter] = Integer.parseInt(answerField.getText());
			numCounter++;
			answerField.setText(answerField.getText() + "+");
			operation[opeartionCounter] = "+";
			opeartionCounter++;
		}
		if (result.equals("-"))
		{
			nums[numCounter] = Integer.parseInt(answerField.getText());
			numCounter++;
			answerField.setText(answerField.getText() + "-");
			operation[opeartionCounter] = "-";
			opeartionCounter++;
		}
		if (result.equals("/"))
		{
			nums[numCounter] = Integer.parseInt(answerField.getText());
			numCounter++;
			answerField.setText(answerField.getText() + "/");
			operation[opeartionCounter] = "/";
			opeartionCounter++;
		}
		if (result.equals("%"))
		{
			nums[numCounter] = Integer.parseInt(answerField.getText());
			numCounter++;
			answerField.setText(answerField.getText() + "%");
			operation[opeartionCounter] = "%";
			opeartionCounter++;
		}
		
		
		
		if (result.equals("="))
		{
			int length1 = str1.length() + 1;
			double answer = 0;
			str2 = answerField.getText().substring(length1);
		
			if (operation.equals("*"))
			{
				answer = Double.parseDouble(str1) * Double.parseDouble(str2);
				answerField.setText(String.valueOf(answer));
			}
			
			if (operation.equals("+"))
			{
				answer = Double.parseDouble(str1) + Double.parseDouble(str2);
				answerField.setText(String.valueOf(answer));
			}
			
			if (operation.equals("-"))
			{
				answer = Double.parseDouble(str1) - Double.parseDouble(str2);
				answerField.setText(String.valueOf(answer));
			}
			
			if (operation.equals("/"))
			{
				answer = Double.parseDouble(str1) / Double.parseDouble(str2);
				answerField.setText(String.valueOf(answer));
			}
			
			if (operation.equals("%"))
			{
				answer = nums[0] * 0.01;
				answerField.setText(String.valueOf(answer));
			}
			
			

		
		
		
		if (result.equals("C"))
		{
			answerField.setText("");
			for (int i = 0; i < nums.length; i++)
			{
				nums[i] = 0;
			}
			for (int j = 0; j < operation.length; j++)
			{
				operation[j] = "";
			}
		}
		
		
	}
	
	
	
}
