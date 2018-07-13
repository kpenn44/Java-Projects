/* 
Kelvin Penn
9/27/2017
Bellevue University
Add intergers in a string
*/

package javaapplication3;

import java.util.Scanner; 


class numbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a 3 digit number ");
         num = input.nextInt();
        
        System.out.println(sumDigits(num));
    }
    public static int sumDigits(long n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10
        }
        return sum; 
    }
}