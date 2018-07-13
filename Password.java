/*
Kelvin Penn
Bellevue University
Intermediate Java Programming

This program accepts a password from a user but only if requirements are met.
If requirements are not met then the program keeps asking user until required
input is given
*/

import javax.swing.JOptionPane;
public class Password { //create password class
    
    public Password () {
        
    }
    
    public void getPassword() { //get user input from method
        String password  = JOptionPane.showInputDialog(null, "Please enter"
                + " your password here", "Password", 1);
        
        while (true) { // test the boolean values for length requirements
            boolean present = true;
            if (password.length() < 6 || password.length() > 10) {
                present = false;
                
                break;
            }
            
            else { //test to see if number is present 
                boolean numberPresent = false;
                for (int i = 0; i < password.length(); i++) {
                 if (password.charAt(i) >= 48 && password.charAt(i) <= 57 ) {
                     numberPresent = true;
                 }   
                }
                
                if (numberPresent) { //create if statements to check pw validity
                    present = true;
                }
                else {
                    present = false;
                }
            }
            if (present) {
                break;
            }
                //create outputs for incorreclty entered passwords
                password = JOptionPane.showInputDialog(  null, "Password can "
                + "not be less than 6 or more than 10 characters\n"
                + "Password must contain at least 1 digit"
                +  "Password", 1);
       }

       String redoPassword = JOptionPane.showInputDialog(null,
               "Please re-enter your password ", "Password", 1);
       while (true) { //create while clause to repeat until pw requirements
                     // are met
           if (password.equalsIgnoreCase(redoPassword)) {
               break;
           }

           redoPassword = JOptionPane.showInputDialog(null, "Password Mismatch"
                   + "Please re-enter your password ", "Re-Password", 1);

       }

       JOptionPane.showMessageDialog(null, "Password meets requirements! ",
"Password Check Result", 1);
      
   }

   public static void main(String[] args) { // create object instance 

       Password password = new Password();
       password.getPassword();
   }

}
