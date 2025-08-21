//Write a C program to find maximum between three numbers using conditional operator.

package ConditionalOperator;

import java.util.Scanner;

public class CalcMax3Num {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number :");
        int num1 = sc.nextInt();
        System.out.println("Enter second number :");
        int num2 = sc.nextInt();
        System.out.println("Enter third number :");
        int num3 = sc.nextInt();

        int max = ((num1 > num2) && (num1 > num3)) ? num1 : ((num2 > num1) && (num2 > num3))
        ? num2 : num3;

        System.out.println("Maximum number is :"+ max);
    }
}
