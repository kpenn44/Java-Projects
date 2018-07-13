/*
Kelvin Penn
Intermediate Java Programming
Bellevue University
This program takes user input and returns a square and cube of it through a
dialog box
*/

package javaapplication4;

import javax.swing.JOptionPane;


public class Exponent {

    public static void main(String[] args) {
       String rawInput;
       double num
       Exponent b = new Exponent(); //create instance variable
       rawInput = JOptionPane.showInputDialog(null, "Please enter a double" //Ask fo user input
               + "value. E.g. 45.0");
       num = DoubleparseDouble(rawInput); //convert string to doube value
       JOptionPane.showInputDialog(null, "The square of " + num + " is " + b.square(num)); //output both square
       //and cube
       JOptionPane.showInputDialog(null, "The cube of " + num + " is " + b.cube(num));
    }
 public static double square(double num) { //non void method with square return value
     return num*num; 
 }   
 public double cube (double num) { //non void method with cube return value
     return num*num*num;
 }
}

