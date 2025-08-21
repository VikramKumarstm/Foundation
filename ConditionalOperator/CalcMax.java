// Write a C program to find maximum between two numbers using conditional operator.

package ConditionalOperator;

import java.util.Scanner;

public class CalcMax {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first Number :");
        int num1 = sc.nextInt();
        System.out.println("Enter second Number :");
        int num2 = sc.nextInt();

        int max = (num1 > num2) ? num1 : num2;

        System.out.println("Maximum number is "+ max);
    }
}
