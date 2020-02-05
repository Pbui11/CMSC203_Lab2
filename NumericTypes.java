/**
   This program demonstrates how numeric types and operators behave in Java
*/
import java.util.Scanner;
	public class NumericTypes {
		public static void main (String [] args) {
			
			//TASK #2 Create a Scanner object here 
			Scanner input = new Scanner(System.in);
			
			//identifier declarations
			final int NUMBER = 2; // number of scores
			
			//Task #2 prompt user to input score1
			System.out.print("Enter your first score: ");

			//Task #2 read score1 
			double score1 = input.nextDouble(); // first test score

			//Task #2 prompt user to input score2
			System.out.print("Enter your second score: ");
			
			//Task #2 read score2 
			double score2 = input.nextDouble(); // second test score
			
			double average; // arithmetic average
			
			// Find an arithmetic average
			average = (score1 + score2) / NUMBER;

			String output; //line of output to print out
			
			output = score1 + " and " + score2 + " have an average of " + average;	
			System.out.println(output);
			
			//Task #2 declare a variable to hold the user’s temperature
			int fToC; // temperature in Celsius

			String temperature;
			//Task #2 prompt user to input another temperature
			System.out.print("\n\nEnter a temperature in Fahrenheit: ");
			
			//Task #2 read the user’s temperature in Fahrenheit
			int BOILING_IN_F = input.nextInt(); // boiling temperature
			
			// Convert Fahrenheit temperatures to Celsius
			fToC = (BOILING_IN_F - 32)*5/9;
			
			//Task #2 convert the user’s temperature to Celsius
			temperature = BOILING_IN_F + " in Fahrenheit is " + fToC + " in Celsius.";

			//Task #2 print the user’s temperature in Celsius
			System.out.println(temperature);
			System.out.println("\n\n****   Goodbye   ****"); // to show that the program is ended	
		
		input.close();
		}
	}