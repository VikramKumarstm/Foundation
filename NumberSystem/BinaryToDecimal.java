// Write a C program to convert Binary to Decimal number system.

package NumberSystem;

import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter binary number :");
        long binary = sc.nextLong();

        long tempBinary = binary;
        int digit;
        int decimal = 0;
        int power=0;

        while(tempBinary != 0) {

            digit = (int) tempBinary % 10;
            
            if(digit == 1) {

                decimal += digit * Math.pow(2, power);

            }

            power++;

            tempBinary /= 10;

        }

        System.out.println("Decimal number of "+binary+" = "+decimal);

    }
}
