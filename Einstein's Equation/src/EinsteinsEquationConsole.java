import java.util.Scanner;

/*
 * Created by: Valeria Veverita
 * Created on: February-12-2019
 * This program calculates the energy 
 */
public class EinsteinsEquationConsole {

	public static void main(String[]args)
	{
		//telling the computer to get data from the computer 
		Scanner reader = new Scanner(System.in);
		
		//ask the user to insert the mass
		System.out.println("What is the mass: ");
		
		//declare local variables and constants
		//assign the entered number to the constant
		try
		{
			final float MASS = reader.nextFloat();
			
			if (MASS > 0)
			{
				//calculate the speed of light
				final double SPEED_LIGHT = 2.998 * Math.pow(10, 8);

				//calculate the energy
				double energy = MASS * Math.pow(SPEED_LIGHT, 2);
				
				//display the energy to the console
				System.out.println("The object can release " + energy);
			}
			else
			{
				//ask the user to enter a number greater than 0
				System.out.println("Run the program again and enter a number greater than 0");
			}
			
		}
		catch(Exception e1)
		{
			//ask the user to enter a number
			System.out.println("Run the program again and enter a number");
		}
		
		
	}
}
