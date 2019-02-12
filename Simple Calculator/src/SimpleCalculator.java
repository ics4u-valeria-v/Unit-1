/*
 * Created by: Valeria Veverita
 * Created on: 12-January-2018
 * This program performs easy algebraic calculations
 */

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class SimpleCalculator {

	private JFrame frame;
	private JTextField txtFirst;
	private JTextField txtSecond;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SimpleCalculator window = new SimpleCalculator();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public SimpleCalculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.ORANGE);
		frame.setBounds(100, 100, 346, 327);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblAnswer = new JLabel("First Number");
		lblAnswer.setHorizontalAlignment(SwingConstants.CENTER);
		lblAnswer.setForeground(new Color(0, 128, 128));
		lblAnswer.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblAnswer.setBounds(33, 223, 272, 39);
		frame.getContentPane().add(lblAnswer);
		
		//hide the answer label 
		lblAnswer.setVisible(false);
		
		
		txtFirst = new JTextField();
		txtFirst.setBounds(33, 60, 86, 20);
		frame.getContentPane().add(txtFirst);
		txtFirst.setColumns(10);
		
		txtSecond = new JTextField();
		txtSecond.setBounds(204, 60, 86, 20);
		frame.getContentPane().add(txtSecond);
		txtSecond.setColumns(10);
		
		JLabel lblFirst = new JLabel("First Number");
		lblFirst.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblFirst.setBounds(33, 34, 86, 14);
		frame.getContentPane().add(lblFirst);
		
		JLabel lblSecond = new JLabel("Second Number");
		lblSecond.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblSecond.setBounds(204, 34, 101, 14);
		frame.getContentPane().add(lblSecond);
		
		//ADD BUTTON
		JButton btnAdd = new JButton("+");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				//declare local variables
				double firstNum, secondNum;
				double sum;
				String firstNum_str;
				String secondNum_str;
				
				//get the first and second number from the text field
				firstNum_str = txtFirst.getText();
				secondNum_str = txtSecond.getText();
				
				//check if the first number is a double
				try 
				{
					//convert the string to a double
					firstNum = Double.parseDouble(firstNum_str);
					
					//check if the second number is a double
					try
					{
						//convert the string to a double
						secondNum = Double.parseDouble(secondNum_str);
						//calculate the sum of the numbers
						sum = firstNum + secondNum;
						//display the answer
						lblAnswer.setText(""+ sum);
						lblAnswer.setVisible(true);
					}
					catch(NumberFormatException e1)
					{
						//ask the user to enter a number/double
						lblAnswer.setText("Enter a number in the second cell");
						lblAnswer.setVisible(true);
					}
				}
				catch(NumberFormatException e1)
				{
					//ask the user to enter a number/double
					lblAnswer.setText("Enter a number in the first cell");
					lblAnswer.setVisible(true);
				}
				
			}
		});
		btnAdd.setForeground(new Color(0, 100, 0));
		btnAdd.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnAdd.setBounds(33, 126, 89, 23);
		frame.getContentPane().add(btnAdd);
		
		//SUBTRACTION BUTTON
		JButton lblSubt = new JButton("-");
		lblSubt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				//declare local variables
				double firstNum, secondNum;
				double sum;
				String firstNum_str;
				String secondNum_str;
				
				//get the first and second number from the text field
				firstNum_str = txtFirst.getText();
				secondNum_str = txtSecond.getText();
				
				//check if the first number is a double
				try 
				{
					//convert the string to a double
					firstNum = Double.parseDouble(firstNum_str);
					
					//check if the second number is a double
					try
					{
						//convert the string to a double
						secondNum = Double.parseDouble(secondNum_str);
						//calculate the sum of the numbers
						sum = firstNum - secondNum;
						//display the answer
						lblAnswer.setText(""+ sum);
						lblAnswer.setVisible(true);
					}
					catch(NumberFormatException e1)
					{
						//ask the user to enter a number/double
						lblAnswer.setText("Enter a number in the second cell");
						lblAnswer.setVisible(true);
					}
				}
				catch(NumberFormatException e1)
				{
					//ask the user to enter a number/double
					lblAnswer.setText("Enter a number in the first cell");
					lblAnswer.setVisible(true);
				}
			}
		});
		lblSubt.setForeground(new Color(72, 61, 139));
		lblSubt.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblSubt.setBounds(204, 126, 89, 23);
		frame.getContentPane().add(lblSubt);
		
		//MULTIPLICATION BUTTON
		JButton btnMult = new JButton("*");
		btnMult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//declare local variables
				double firstNum, secondNum;
				double sum;
				String firstNum_str;
				String secondNum_str;
				
				//get the first and second number from the text field
				firstNum_str = txtFirst.getText();
				secondNum_str = txtSecond.getText();
				
				//check if the first number is a double
				try 
				{
					//convert the string to a double
					firstNum = Double.parseDouble(firstNum_str);
					
					//check if the second number is a double
					try
					{
						//convert the string to a double
						secondNum = Double.parseDouble(secondNum_str);
						//calculate the sum of the numbers
						sum = firstNum * secondNum;
						//display the answer
						lblAnswer.setText(""+ sum);
						lblAnswer.setVisible(true);
					}
					catch(NumberFormatException e1)
					{
						//ask the user to enter a number/double
						lblAnswer.setText("Enter a number in the second cell");
						lblAnswer.setVisible(true);
					}
				}
				catch(NumberFormatException e1)
				{
					//ask the user to enter a number/double
					lblAnswer.setText("Enter a number in the first cell");
					lblAnswer.setVisible(true);
				}
				
			}
		});
		btnMult.setForeground(new Color(165, 42, 42));
		btnMult.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnMult.setBounds(33, 175, 89, 23);
		frame.getContentPane().add(btnMult);
		
		//DIVISON BUTTON
		JButton btnDivide = new JButton("/");
		btnDivide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//declare local variables
				double firstNum, secondNum;
				double sum;
				String firstNum_str;
				String secondNum_str;
				
				//get the first and second number from the text field
				firstNum_str = txtFirst.getText();
				secondNum_str = txtSecond.getText();
				
				//check if the first number is a double
				try 
				{
					//convert the string to a double
					firstNum = Double.parseDouble(firstNum_str);
					
					//check if the second number is a double
					try
					{
						//convert the string to a double
						secondNum = Double.parseDouble(secondNum_str);
						//calculate the sum of the numbers
						sum = firstNum / secondNum;
						//display the answer
						lblAnswer.setText(""+ sum);
						lblAnswer.setVisible(true);
					}
					catch(NumberFormatException e1)
					{
						//ask the user to enter a number/double
						lblAnswer.setText("Enter a number in the second cell");
						lblAnswer.setVisible(true);
					}
				}
				catch(NumberFormatException e1)
				{
					//ask the user to enter a number/double
					lblAnswer.setText("Enter a number in the first cell");
					lblAnswer.setVisible(true);
				}
				
			}
		});
		btnDivide.setForeground(new Color(0, 0, 128));
		btnDivide.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnDivide.setBounds(204, 175, 89, 23);
		frame.getContentPane().add(btnDivide);
		
		
	}
}
