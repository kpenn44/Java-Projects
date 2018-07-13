
import javax.swing.*;

/* Debug program that asks user to input his/her favorite quote. The program capitalizes the first *
* word of the sentence, and then displays the amount of spaces in the sentence. Raul Espejo The program has 5 errors */

public class CountMovieSpaces2 
{   
    public static void main(String[] args) 
    {
        //Variables that will hold string entered by user and string capitalized.
    String originalQuote, saveQuote;
    int stringLength;
    
    
    originalQuote = JOptionPane.showInputDialog(null, "Please enter your favorite quote: ");
    saveQuote = originalQuote;
    stringLength = originalQuote.length();
    
    int countOfSpaces = 0;
    
    //"for" loop that analyzes string input by user and changes the first letter of the first word on the 
    //sentence. 
    for(int i = 0; i < stringLength; i++)
    {
       char c = originalQuote.charAt(i);
        if(i == 0)
        {
            c = Character.toUpperCase(c);
            originalQuote = c + originalQuote.substring(1, stringLength);
        }
    }
        
    //"for" loop that counts the spaces between the string entered by user
    for(int x = 0; x < originalQuote.length(); x++)
    {
        if(originalQuote.charAt(x) == " ") {
            countOfSpaces++;
    }
            
    JOptionPane.showInputDialog(null, "Original Quote was: " + saveQuote + "\nYour Quote Capitalized is: \n" +
            originalQuote + "!!!" + "\nYour Quote has " + countOfSpaces + " spaces between words.");
        
    }
    
}
}