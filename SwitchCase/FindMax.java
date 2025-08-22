// Write a C program to find maximum between two numbers using switch case.

package SwitchCase;

import java.util.Scanner;

public class FindMax {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        //Input two numbers from user
        System.out.println("Enter first number :");
        int num1 = sc.nextInt();
        System.out.println("Enter second number :");
        int num2 = sc.nextInt();

        int condition = (num1 > num2) ? 0 : (num1 < num2) ? 1 : 2;
        switch(condition) {

            //if (num1 > num2) condition is false
            case 0:
                System.out.println("Maximum number is "+ num1);
                break;
            case 1:
                System.out.println("Maximum number is "+ num2);
                break;
            case 2:
                System.out.println("first and second numbers are equal");
                break;
            default :
                System.out.println("Invalid input");
                break;
        }

    }
}
