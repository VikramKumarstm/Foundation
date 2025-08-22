// Write a C program to print all alphabets from a to z. – using while loop

package Loop;

import java.util.Scanner;

public class PrintAlphabet {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        char ch = 'a';

        while(ch <= 'z') {
            System.out.print(ch+" ");
            ch++;
        }
    }

    
}
