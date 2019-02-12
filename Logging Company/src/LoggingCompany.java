
/*
 * Created by: valeria veverita
 * Created on: February-04-2018
 * This program gets the number of logs from the user and calculates how many logs can be placed on the truck
 */

//import the libraries
import java.util.Scanner;


public class LoggingCompany 
{
	

	public static void main (String[]args) {
		//telling the computer to get the data from the system/console
		Scanner reader = new Scanner(System.in);
		
		//ask the user to insert the number of logs
		System.out.println("Enter the number of logs (0.25m, 0.5m or 1m): ");
		
		//declare local variables and constants
		//assign the entered number to the constant
		final float LOG_LENGTH = reader.nextFloat();
		final float WEIGHT_ONE_LOG = 20;
		final float WEIGHT_PERMITTED = 1100;
		
		//calculate the number of logs permitted
		float logs = WEIGHT_PERMITTED/(LOG_LENGTH * WEIGHT_ONE_LOG);
		
		//display the number of logs to the console
		//ask the user to insert the number of logs
		System.out.println(logs + " logs, that are " + LOG_LENGTH + "m long can be placed on the truck");

	}
}
