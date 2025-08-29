// Write a C program to find two’s complement of a binary number.

package NumberSystem;

import java.util.Scanner;

public class TwosComplementBinaryNum {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter binary number :");
        String binary = sc.nextLine();

        String onesComplement, twosComplement;
        onesComplement = twosComplement = "";

        int i, carry = 1;

        for(i=0; i<binary.length(); i++) {

            onesComplement += (binary.charAt(i) == '0') ? '1' : '0';

        }

        System.out.println("One's Complement : "+ onesComplement);

        for(i=binary.length()-1; i>=0; i--) {

            if(onesComplement.charAt(i) == '1' && carry == 1) {

                twosComplement += '0';

            } else if(onesComplement.charAt(i) == '0' && carry == 1) {

                twosComplement += '1';
                carry = 0;

            } else {

                twosComplement += onesComplement.charAt(i);
            }

        }

        for(i=twosComplement.length()-1; i>=0; i--) {
            System.out.print(twosComplement.charAt(i)+" ");
        }

        // System.out.println("Two's complement :"+ twosComplement);
    }
}
