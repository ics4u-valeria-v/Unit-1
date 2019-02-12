/*
 * Created by: Valeria Veverita
 * Created on: February-12-2019
 * This program calculates the number of logs that are permitted 
 */
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LoggingCompanyGUI {

	private JFrame frame;
	private JTextField txtLogs;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoggingCompanyGUI window = new LoggingCompanyGUI();
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
	public LoggingCompanyGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(SystemColor.activeCaption);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblAnswer = new JLabel("Answer");
		lblAnswer.setHorizontalAlignment(SwingConstants.CENTER);
		lblAnswer.setForeground(Color.WHITE);
		lblAnswer.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblAnswer.setBounds(10, 183, 414, 51);
		frame.getContentPane().add(lblAnswer);
		//hide the answer label when the program is initialized
		lblAnswer.setVisible(false);
		JLabel lblQuestion = new JLabel("Enter the number of logs (0.25m, 0.5m or 1m):");
		lblQuestion.setForeground(Color.WHITE);
		lblQuestion.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblQuestion.setBounds(10, 11, 414, 51);
		frame.getContentPane().add(lblQuestion);
		
		
		
		txtLogs = new JTextField();
		txtLogs.setForeground(Color.BLACK);
		txtLogs.setFont(new Font("Tahoma", Font.BOLD, 16));
		txtLogs.setColumns(10);
		txtLogs.setBounds(164, 73, 95, 38);
		frame.getContentPane().add(txtLogs);
		
		JButton btnCalculate = new JButton("Calculate");
		btnCalculate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				//declare local variables and constants
				double log_length;
				final double WEIGHT_ONE_LOG = 20;
				final double WEIGHT_PERMITTED = 1100;

				//get the mass from the user
				String length_str = txtLogs.getText();
				
				try
				{
					//convert it to a double
					log_length = Double.parseDouble(length_str);
					
					if (log_length == 0.25 || log_length == 0.5 || log_length == 1)
					{
						//calculate the number of logs permitted
						double logs = WEIGHT_PERMITTED/(log_length * WEIGHT_ONE_LOG);

						//display the answer 
						lblAnswer.setText(""+ logs);
						lblAnswer.setVisible(true);
					}
					else
					{
						//ask the user to enter one of the three numbers
						lblAnswer.setText("Enter one of the three lengths");
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
		btnCalculate.setForeground(new Color(255, 153, 51));
		btnCalculate.setFont(new Font("Cooper Std Black", Font.PLAIN, 18));
		btnCalculate.setBackground(Color.WHITE);
		btnCalculate.setBounds(92, 127, 241, 34);
		frame.getContentPane().add(btnCalculate);
		
		
	}
}
