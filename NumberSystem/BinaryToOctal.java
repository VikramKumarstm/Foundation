// Write a C program to convert Binary to Octal number system.

package NumberSystem;

import java.util.Scanner;

public class BinaryToOctal {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter binary number :");
        String binary = sc.nextLine();
        String revBinary = "";

        for(int i=binary.length()-1; i>=0; i--) {
            revBinary += binary.charAt(i);
        }
        System.out.println("rev binary :"+revBinary);

        int i;
        int octal = 1;
        
        System.out.println("length :"+ revBinary.length());
        for(i=0; i<=revBinary.length()-1; i++) {

            System.out.println(i);

            if(revBinary.charAt(i) == '1') {

                octal += i*2;

            } else {

                octal *= i;
            }

        }

        System.out.println("Octal number of "+binary+" = "+ octal);

    }
}
