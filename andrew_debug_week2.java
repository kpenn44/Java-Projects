package edu.bellevue.agifford.weekone;

import javax.swing.JOptionPane;

/**
 * Takes an input date and gives you tomorrow's date.
 * @author Andrew Gifford
 * @version 2018-06-18
 */
public class Tomorrow {
	
	public static void main(String[] args) {
		
		int year = 0;
		int month = 0;
		int day = 0;
		String rawInput;
		
		rawInput = JOptionPane.showInputDialog(null, "Please enter a year.");
		year = Integer.parseInt(rawInput);

		rawInput = JOptionPane.showInputDialog(null, "Please enter a month.");
		month = Integer.parseInt(rawInput);

		rawInput = JOptionPane.showInputDialog(null, "Please enter a day.");
		day = Integer.parseInt(rawInput);
		
		GregorianCalendar date = new GregorianCalendar(year, month, day); //changed dayOfMonth to day to reflect what is the dialog box
		date.add(GregorianCalendar.date, 1);//uncapped date

		JOptionPane.showMessageDialog(null, "Tomorrow is ", date.toString());
	}
}