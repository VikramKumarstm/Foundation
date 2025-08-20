// Write a C program to input all sides of a triangle and check whether triangle is 
// valid or not.

import java.util.Scanner;

public class ValidateTriangleSideGiven {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a, b, c;

        System.out.println("Enter fist side");
        a = sc.nextInt();
        System.out.println("Enter second side");
        b = sc.nextInt();
        System.out.println("Enter third side :");
        c = sc.nextInt();

        if((a+b) > c && (a+c) > b && (b+c) > a) {
            System.out.println("Triangle is valid!!!");
        }
        else {
            System.out.println("Triangle is Invalid");
        }

    }
}
