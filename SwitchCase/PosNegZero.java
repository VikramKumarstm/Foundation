// Write a C program to check whether a number is positive, negative or zero using switch
// case.

package SwitchCase;

import java.util.Scanner;

public class PosNegZero {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number :");
        int num = sc.nextInt();

        int condition = (num > 0) ? 1 : (num < 0) ? -1 : 0;

        switch (condition) {
            case -1:
                System.out.println("Number is Negative");
                break;
            case 0:
                System.out.println("Number is Zero");
                break;
            case 1:
                System.out.println("Number is Positive");
                break;
        
            default:
                System.out.println("Invalid input");
                break;
        }
    }
}
