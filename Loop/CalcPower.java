// Write a C program to find power of a number using for loop.

package Loop;

import java.util.Scanner;

public class CalcPower {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Base :");
        int base = sc.nextInt();
        System.out.println("Enter Exponent :");
        int exponent = sc.nextInt();

        int power = 1;

        for(int i=1; i<=exponent; i++) {
            power *= base;
        }

        System.out.println(base+" to the power "+exponent+" is :"+ power);

    }
}
