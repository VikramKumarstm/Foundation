package Loop;

// Write a C program to check whether a number is palindrome or not.

import java.util.Scanner;

public class CheckPalindrome {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number :");
        int n = sc.nextInt();

        int origionalNum = n;

        int digit, reverse = 0;

        while (n != 0) {
            digit = n % 10;
            reverse = digit + (reverse * 10);
            n /= 10;
        }

        if(origionalNum == reverse) {
            System.out.println(origionalNum+ " is a Palindrome number.");
        } else {
            System.out.println(origionalNum+ " is Not a Palindrome number");
        }

        
    }
}
