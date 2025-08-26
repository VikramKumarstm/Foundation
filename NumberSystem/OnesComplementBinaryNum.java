// Write a C program to find one’s complement of a binary number.

package NumberSystem;

import java.util.Scanner;

public class OnesComplementBinaryNum {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter binary number :");
        String binary = sc.nextLine();

        String onesComplement = "";

        for(int i=0; i<binary.length(); i++) {

            onesComplement += binary.charAt(i) == '0' ? '1' : '0';

        }

        System.out.println(onesComplement);

    }
}
