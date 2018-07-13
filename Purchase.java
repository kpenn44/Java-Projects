/*
Kelvin Penn
Bellevue University
Intermediate Java Programming
This program takes input from a user and creates an invoice with the transaction
number, price and tax out put in the end
*/
import java.util.Scanner;
public class Purchase { // create purchase class
    
    int invoiceNum; // initiate variables
    double price;
    double tax;
    

public void setInvoiceNum(int a) { //set variable methods 
    invoiceNum = a;
}

public void setPrice(int b) {
    price = b;
    tax = (7.5 * b)/ 100;
}

public void display() { //create display method for user to see
    System.out.println("Invoice number: " + invoiceNum);
    System.out.println ("Total sale amount: " + price);
    System.out.println("Amount of sales tax: " + tax);
}

}

class CreateSale { // main method for creating the sale. This asks the user
    //for the input
    public static void main (String [] args) {
        Scanner scanner = new Scanner(System.in);
        Purchase purchase = new Purchase();
        
        System.out.println ("Please enter an invoice number starting with "
                + "the chronologial order of sale and ending in the year. "
                + "E.g. The first sale of the year would be 12018: ");
        
        int invnum = scanner.nextInt();
        
        System.out.println("Please enter the amount of the sale: ");
        double sale = scanner.nextDouble();
    
    purchase.display(); // not entirely sure why I am having this error here
}
}