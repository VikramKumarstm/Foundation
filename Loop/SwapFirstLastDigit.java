// Write a C program to swap first and last digits of a number.

import java.util.Scanner;

public class SwapFirstLastDigit {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number :");
        int n = sc.nextInt();

        int lastDigit = n % 10;

        int firstDigit=0;

        while(n > 10) {
            firstDigit = n / 10;
            n = n/10;
        }

        System.out.println("Before swapping First Digit = "+ firstDigit);
        System.out.println("Before swapping Last Digit = "+ lastDigit);
        System.out.println("-------------------------------------------");

        int temp = firstDigit;
        firstDigit = lastDigit;
        lastDigit = temp;

        System.out.println("After swapping First Digit = "+ firstDigit);
        System.out.println("After swapping Last Digit = "+ lastDigit);
    }
}
