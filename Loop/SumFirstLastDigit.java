// Write a C program to find sum of first and last digit of a number.

package Loop;

import java.util.Scanner;

public class SumFirstLastDigit {
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

       int sum = firstDigit + lastDigit;

       System.out.println("Sum of First and Last digit = "+ sum);


    }
}
