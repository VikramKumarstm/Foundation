// Write a C program to find maximum between two numbers.

import java.util.Scanner;

public class MaxNo {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        int n1, n2;

        System.out.println("Enter First Number :");
        n1 = sc.nextInt();
        System.out.println("Enter Second Number :");
        n2 = sc.nextInt();

        if(n1 > n2) {
            System.out.println("Maximum number is :"+n1);
        } 
        else if(n2 > n1) {
            System.out.println("Maximum number is :"+n2);
        }
        else {
            System.out.println("Both numbers are equal");
        }

        
    }
}