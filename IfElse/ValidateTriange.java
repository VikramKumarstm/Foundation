// Write a C program to input angles of a triangle and check whether triangle
//  is valid or not.

import java.util.Scanner;

public class ValidateTriange {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int firstAngle, secondAngle, thirdAngle;

        System.out.println("Enter first angle :");
        firstAngle = sc.nextInt();
        System.out.println("Enter second angle :");
        secondAngle = sc.nextInt();
        System.out.println("Enter third angle :");
        thirdAngle = sc.nextInt();

        if(firstAngle + secondAngle + thirdAngle == 180) {
            System.out.println("Triangle is Valid!!!");
        }else {
            System.out.println("Invalid Triangle!!!");
        }
        
    }
}
