// Write a C program to convert Binary to Octal number system.

package NumberSystem;

import java.util.Scanner;

public class BinaryToOctal {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter binary number :");
        long binary = sc.nextLong();

        int octalConstant[] = {0, 1, 10, 11, 100, 101, 110, 111};

        long tempBinary, octal = 0;
        int digit, place = 1;

        tempBinary = binary;

        while (tempBinary != 0) {
            digit = (int) tempBinary % 1000;

            for(int i=0; i<8; i++) {

                if(octalConstant[i] == digit) {

                    octal = (i * place) + octal;
                    break;

                }

            }

            // remove last three digit of binary
            tempBinary /= 1000;

            // Increase the place value
            place *= 10;

        }
        
        System.out.println("Octal number of "+binary+" = "+ octal);

    }
}
