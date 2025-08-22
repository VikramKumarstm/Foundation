// Write a C program to create Simple Calculator using switch case.

package SwitchCase;

import java.util.Scanner;

public class SimpleCalculater {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first Number :");
        int num1 = sc.nextInt();
        System.out.println("Enter second Number :");
        int num2 = sc.nextInt();
        System.out.println("Enter Operators (+,-,*,/,%) :");
        char operator = sc.next().charAt(0);

        int result;
        switch (operator) {
            case '+':
                result = num1 + num2;
                System.out.println("Addition of "+num1+" + "+num2+" = "+result);
                break;
            case '-':
                result = num1 - num2;
                System.out.println("Substraction of "+num1+" - "+num2+" = "+result);
                break;
            case '*':
                result = num1 * num2;
                System.out.println("Multiplication of "+num1+" * "+num2+" = "+result);
                break;
            case '/':
                result = num1 / num2;
                System.out.println("Division of "+num1+" / "+num2+" = "+result);
                break;
            case '%':
                result = num1 % num2;
                System.out.println("Modulo of "+num1+" % "+num2+" = "+result);
                break;
        
            default:
                System.out.println("Invalid input");
                break;
        }
    }
}
