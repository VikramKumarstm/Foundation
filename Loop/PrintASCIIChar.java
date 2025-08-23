// Write a C program to print all ASCII character with their values.

package Loop;

import java.util.Scanner;

public class PrintASCIIChar {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        for(int i=0; i<=255; i++) {
            System.out.println("ASCII value of "+ (char) i +" = "+ i);
        }

    }
}
