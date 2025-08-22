// Write a C program to find first and last digit of a number.

package Loop;

import java.util.Scanner;

public class FirstLastDigit {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number :");
        int n = sc.nextInt();

        int firstDigit = 0, lastDigit = 0;

        lastDigit = n%10;

       while(n > 10) {
        firstDigit = n/10;
        n = n/10;
       }

       System.out.println("First Digit = "+firstDigit);
       System.out.println("Last Digit = "+lastDigit);


    }
}
