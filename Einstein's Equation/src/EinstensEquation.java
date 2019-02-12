/*
 * Created by: Valeria Veverita
 * This program calculates the energy by using the formula E=mc^2
 */

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class EinstensEquation {

	private JFrame frame;
	private JTextField txtMass;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EinstensEquation window = new EinstensEquation();
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
	public EinstensEquation() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(153, 0, 51));
		frame.setBounds(100, 100, 457, 317);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblAnswer = new JLabel("Answer");
		lblAnswer.setForeground(Color.WHITE);
		lblAnswer.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblAnswer.setBounds(93, 197, 299, 51);
		frame.getContentPane().add(lblAnswer);
		
		
		//hide the answer label
		lblAnswer.setVisible(false);
		
		JButton btnCalculate = new JButton("Calculate the energy");
		
		btnCalculate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					
				//declare local variables and constants
				double mass;
				//calculate the speed of light
				final double SPEED_LIGHT = 2.998 * Math.pow(10, 8);

				//get the mass from the user
				String mass_str = txtMass.getText();
				
				try
				{
					//convert it to a double
					mass = Double.parseDouble(mass_str);
					
					if (mass> 0)
					{
						//calculate the energy
						double energy = mass * Math.pow(SPEED_LIGHT, 2);

						//display the answer 
						lblAnswer.setText("       " + energy);
						lblAnswer.setVisible(true);
					}
					else
					{
						//ask the user to enter a number greater than 0
						lblAnswer.setText("Enter a number greater than 0");
						lblAnswer.setVisible(true);
					}
					
				}
				catch(NumberFormatException e1)
				{
					//ask the user to enter a number/double
					lblAnswer.setText("Enter a number");
					lblAnswer.setVisible(true);
				}
			}
		});
	
		btnCalculate.setBackground(Color.WHITE);
		btnCalculate.setForeground(new Color(153, 0, 0));
		btnCalculate.setFont(new Font("Cooper Std Black", Font.PLAIN, 18));
		btnCalculate.setBounds(93, 152, 241, 34);
		frame.getContentPane().add(btnCalculate);
		
		JLabel lblQuestion = new JLabel("Enter the mass of the object:");
		lblQuestion.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblQuestion.setForeground(new Color(255, 255, 255));
		lblQuestion.setBounds(75, 28, 299, 51);
		frame.getContentPane().add(lblQuestion);
		
		txtMass = new JTextField();
		txtMass.setFont(new Font("Tahoma", Font.BOLD, 14));
		txtMass.setForeground(new Color(0, 0, 0));
		txtMass.setBounds(170, 96, 86, 20);
		frame.getContentPane().add(txtMass);
		txtMass.setColumns(10);
		
		
		
	}
}
