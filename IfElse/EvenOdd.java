// Write a C program to check whether a number is even or odd.

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int num;
        System.out.println("Enter a number :");
        num = sc.nextInt();

        if(num % 2 == 0) {
            System.out.println("Even number");
        }
        else {
            System.out.println("Odd number");
        }

    }
}
