// Write a C program to check whether the triangle is equilateral, isosceles or
//  scalene triangle.

/**
 *  A triangle is said Equilateral Triangle, if all its sides are equal. If a, b, c are
    three sides of triangle. Then, the triangle is equilateral only if a == b == c.

 *  A triangle is said Isosceles Triangle, if its two sides are equal. If a, b, c are 
    three sides of triangle. Then, the triangle is isosceles if either a == b or a == c or b == c.

 *  A triangle is said Scalene Triangle, if none of its sides are equal.
 */

import java.util.Scanner;

public class CheckEquilateralIsoscelesScalene {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int a, b, c;

        System.out.println("Enter first Angle :");
        a = sc.nextInt();
        System.out.println("Enter second Angle :");
        b = sc.nextInt();
        System.out.println("Enter third Angle :");
        c = sc.nextInt();

        if(a == b && b == c) {
            System.out.println("Equilateral Triangle");
        }
        else if(a == b || b == c || c == a) {
            System.out.println("Isosceles Triangle");
        }
        else {
            System.out.println("Scalene Triangle");
        }
    }
}