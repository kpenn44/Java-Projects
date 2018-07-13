/* 
 * Jake Crawford
 * Bellevue University
 * 09 June 2018
 * Assignment 1.1
 * This class converts a dollar amount into currency denominations.
 */


import javax.swing.*;

public class DollarsDebug{

	public static void main(String[] args){
		
		//Raw dollar amount received from user
		String rawInput;
		//Parsed dollar amount received from user
		int intInput = 0;
		//Currency denominations of user's dollar amount
		//-denoms[# of Bills][Value of Bills]
		int[][] denoms = new int[][] {{0,100}, {0,50}, {0,20}, {0,10}, {0,5}, {0,1}};
		//Currency denominations string
		String denomStr = "Currency Denominations:\n";
		
		//Retrieve and display user's dollar amount
		rawInput = JOptionPane.showInputDialog(null, "Please enter an integer dollar amount. Example: 231");
		intInput = Integer.parseInt(rawInput);
		denomStr += "-User Amount: $" + intInput + "\n"; //changed & to + to include string, intInput and non breaking space
		
		//Split and display user's dollar amount as currency denominations
		for(int i < denoms[][]) { //chaged : to < sign for loop to run proper
			denoms[i][0] = intInput / denoms[i][1];
			intInput %= denoms[i][1];
			denomStr += "-$" + denoms[i][1] + "s \t= " + denoms[i][0] + "\n;
		}
		JOptionPane.showMessageDialog(null, denoms);
		
		System.exit(0);
	}
}