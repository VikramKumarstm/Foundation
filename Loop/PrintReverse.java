// Write a C program to enter a number and print its reverse.

package Loop;

import java.util.Scanner;

public class PrintReverse {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number : ");
        int n = sc.nextInt();

        int digit, reverse = 0;

        while (n != 0) {

            digit = n % 10;
            reverse = digit + (reverse * 10);
            n /= 10;
            
        }

        System.out.println("Reverse of given number = "+ reverse);



    }
}
