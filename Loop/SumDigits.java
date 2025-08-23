// Write a C program to calculate sum of digits of a number.

package Loop;

import java.util.Scanner;

public class SumDigits {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number :");
        int n = sc.nextInt();

        int digit;
        int sum = 0;

        while(n != 0) {

            digit = n % 10;
            sum += digit;
            n /= 10;

        }

        System.out.println("Sum of given digit of number = "+ sum);

    }
}
