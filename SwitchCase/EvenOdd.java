// Write a C program to check whether a number is even or odd using switch case.

package SwitchCase;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number");
        int num = sc.nextInt();

        int condition = (num % 2 == 0) ? 0 : 1;

        switch (condition) {
            case 0:
                System.out.println("Even");
                break;
            case 1:
                System.out.println("Odd");
                break;
            default :
                System.out.println("Invalid input");
                break;
        }

    }
}
