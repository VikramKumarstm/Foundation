// Write a C program to print all odd number between 1 to 100.

package Loop;

import java.util.Scanner;

public class OddNumber {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int i = 1;
        while (i <= 100) {
            if(i % 2 != 0) {
                System.out.print(i+" ");
            }
            i++;
        }
    }
}
