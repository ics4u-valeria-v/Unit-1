/*
 * Created by: Valeria Veverita
 * Created on: February-15-2018
 * This program calculates the time each type of food should be kept in the microwave
 */

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class MicrowaveVV {
	
	//declare global variables and constants 
	static double PIZZA_TIME = 45;
	static double SUB_TIME = 60;
	static double SOUP_TIME = 105;
	
	double time_one = 0;
	double time_added = 0;
	double total_time = 0;
	////////////////////////////////////////////////////

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MicrowaveVV window = new MicrowaveVV();
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
	public MicrowaveVV() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		
		JLabel lblAnswer = new JLabel("Answer");
		lblAnswer.setHorizontalAlignment(SwingConstants.CENTER);
		lblAnswer.setForeground(new Color(0, 102, 102));
		lblAnswer.setFont(new Font("Segoe UI Black", Font.BOLD, 20));
		lblAnswer.setBounds(287, 229, 137, 21);
		//set the label to be invisible when frame is initialized
		lblAnswer.setVisible(false);
		frame.getContentPane().add(lblAnswer);
		
		JButton btnOne = new JButton("One");
		btnOne.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//calculate how much time would be needed in total and display the answer
				time_added = 0;
				total_time = time_one + time_added;
				lblAnswer.setText(""+ total_time+ "sec");
				lblAnswer.setVisible(true);
				
			}
		});
		btnOne.setEnabled(false);
		btnOne.setForeground(Color.WHITE);
		btnOne.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnOne.setBackground(new Color(204, 153, 51));
		btnOne.setBounds(22, 165, 89, 23);
		frame.getContentPane().add(btnOne);
		
		JButton btnTwo = new JButton("Two");
		btnTwo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//calculate how much time would be needed in total and display the answer
				time_added = time_one * 0.5;
				total_time = time_one + time_added;
				lblAnswer.setText(""+ total_time + "sec");
				lblAnswer.setVisible(true);

			}
		});
		btnTwo.setForeground(Color.WHITE);
		btnTwo.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnTwo.setEnabled(false);
		btnTwo.setBackground(new Color(204, 153, 51));
		btnTwo.setBounds(163, 167, 89, 23);
		frame.getContentPane().add(btnTwo);
		
		JButton btnThree = new JButton("Three");
		btnThree.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//calculate how much time would be needed in total and display the answer
				time_added = time_one;
				total_time = time_one + time_added;
				lblAnswer.setText(""+ total_time+ "sec");
				lblAnswer.setVisible(true);

			}
		});
		btnThree.setForeground(Color.WHITE);
		btnThree.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnThree.setEnabled(false);
		btnThree.setBackground(new Color(204, 153, 51));
		btnThree.setBounds(306, 167, 89, 23);
		frame.getContentPane().add(btnThree);
		
		
		JLabel lblFood = new JLabel("Select Type of food below");
		lblFood.setForeground(new Color(204, 153, 51));
		lblFood.setFont(new Font("Segoe UI Black", Font.BOLD, 15));
		lblFood.setBounds(22, 23, 289, 21);
		frame.getContentPane().add(lblFood);
		
		JButton btnPizza = new JButton("Pizza");
		btnPizza.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				//set the time one to be equal to PIZZA_TIME
				time_one = PIZZA_TIME;
				System.out.println(time_one);
				
				//enable the servings buttons
				btnOne.setEnabled(true);
				btnTwo.setEnabled(true);
				btnThree.setEnabled(true);
				
			}
		});
		btnPizza.setBackground(new Color(204, 153, 51));
		btnPizza.setForeground(new Color(255, 255, 255));
		btnPizza.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnPizza.setBounds(22, 67, 89, 23);
		frame.getContentPane().add(btnPizza);
		
		JButton btnSub = new JButton("Sub");
		btnSub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//set the time one to be equal to SUB_TIME
				time_one = SUB_TIME;
				System.out.println(time_one);
				
				//enable the servings buttons
				btnOne.setEnabled(true);
				btnTwo.setEnabled(true);
				btnThree.setEnabled(true);
			}
		});
		btnSub.setForeground(Color.WHITE);
		btnSub.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnSub.setBackground(new Color(204, 153, 51));
		btnSub.setBounds(163, 67, 89, 23);
		frame.getContentPane().add(btnSub);
		
		JButton btnSoup = new JButton("Soup");
		btnSoup.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//set the time one to be equal to SOUP_TIME
				time_one = SOUP_TIME;
				System.out.println(time_one);
				
				//enable the servings buttons
				btnOne.setEnabled(true);
				btnTwo.setEnabled(true);
				btnThree.setEnabled(true);
				
			}
		});
		btnSoup.setForeground(Color.WHITE);
		btnSoup.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnSoup.setBackground(new Color(204, 153, 51));
		btnSoup.setBounds(306, 67, 89, 23);
		frame.getContentPane().add(btnSoup);
		
		JLabel lblServings = new JLabel("Select the number of servings");
		lblServings.setForeground(new Color(204, 153, 51));
		lblServings.setFont(new Font("Segoe UI Black", Font.BOLD, 15));
		lblServings.setBounds(10, 119, 289, 21);
		frame.getContentPane().add(lblServings);
		
		JLabel lblExplanation = new JLabel("The total time spent in the microwave:");
		lblExplanation.setForeground(new Color(0, 51, 0));
		lblExplanation.setFont(new Font("Segoe UI Black", Font.BOLD, 13));
		lblExplanation.setBounds(10, 229, 289, 21);
		frame.getContentPane().add(lblExplanation);
		

	}
}

