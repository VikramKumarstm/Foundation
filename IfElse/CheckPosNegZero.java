// Write a C program to check whether a number is negative, positive or zero.

import java.util.Scanner;

public class CheckPosNegZero {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int num;
        System.out.println("Enter a number :");
        num = sc.nextInt();

        if(num < 0) {
            System.out.println("Negative Number");
        }
        else if(num > 0) {
            System.out.println("Positive Number");
        }
        else if(num == 0) {
            System.out.println("Zero");
        }
    }
}
