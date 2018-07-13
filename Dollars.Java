import javax.swing.*;

public class Dollars{
	
	public static void main (String [] args) {
    
    double dblInput = 0.0;
    int intInput = 0;
    String rawInput;

    rawInput = JOptionPane.showInputDialog(null, "Please enter a dollar amount. Example: 45.00");

    intInput = Integer.parseInt(rawInput);

    int hundreds = intInput/100;
    int fifties = (intInput - 100 * hundreds) / 50;
    int twenties = (intInput - (50*fifties + 100*hundreds)) / 20;
    int tens = (intInput - (50*fifties + 100*hundreds + 20*twenties)) / 10;
    int fives = (intInput - (50*fifties + 100*hundreds + 20*twenties + 10*tens)) / 5;

    System.out.println("The value entered is: " + intInput);
    System.out.println("That is " + hundreds + "hundreds" + fifties + "fifties"
    	+ twenties + "twenties" + tens + "tens and " + fives + "fives");
     

	}
}