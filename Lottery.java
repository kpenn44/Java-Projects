/*
Kelvin Penn
Bellevue University
Intermediate Java Programming
This program compares numbers entered by the user to randomly generated numbers
by the program and gives a score accordingly to the correct matches
*/
package javaapplication6;

import java.util.Scanner;
import java.util.Random;
public class Lottery {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random num = new Random(); //create instance variables for random numbers
        int [] guess = new int[4]; //create arrays for both sets of numbers
        int [] lotteryNumber = new int [4];
        int numRight = 0; //keep track of number right. initiate at 0
        
        for (int i = 0; i < 4; i++){ //loop and prompt for user input
            System.out.println("Please guess a number between 1 and 9"); 
            guess[i] = scanner.nextInt();
        }
        
        for (int i = 0; i < 4; i++) { //generate random numbers to compare
            lotteryNumber[i] = num.nextInt(9);
        }
        
        for (int i = 0; i < 4; i++) { //nested loop with if statement to compare numbers
            for (int j = 0; j < 4; j++) {
                if (guess[i] == lotteryNumber[i]){
                    numRight++;
                    break;
                }
            }
        }
        
        System.out.println ("You entered: "); //let user know what they entered
        for (int i = 0; i < guess.length; i++) {
            System.out.println (guess[i]);
    }
       
        System.out.println ("The lottery numbers were: ");//see what program generated
        for (int i = 0; i < lotteryNumber.length; i++) {
            System.out.println (lotteryNumber[i]);
        }
        
        System.out.println("Your score is as follows: "); 
        
        switch(numRight){ //determine and output score using switch statements
            case 0: System.out.print("0");
            break;
            case 1: System.out.print("5");
            break;
            case 2: System.out.print("100");
            break;
            case 3: System.out.print("2000");
            break;
            case 4: System.out.print ("100,000,000");
            break;
        }
    }
    
    
}
