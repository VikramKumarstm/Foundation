// Write a C program to check whether a number is divisible by 5 and 11 or not.

import java.util.Scanner;

public class Div5And11 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int num;

        System.out.println("Enter a number :");
        num = sc.nextInt();

        if((num%5 == 0) && (num%11 == 0)) {
            System.out.println("Number is divisible by 5 and 11");
        }
        else {
            System.out.println("Not divisible by 5 and 11");
        }
    }
}
