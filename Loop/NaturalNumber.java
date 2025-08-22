// Write a C program to print all natural numbers from 1 to n. – using while loop

package Loop;

import java.util.Scanner;

public class NaturalNumber {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number :");
        int n = sc.nextInt();


        int i = 1;
        while(i <= n) {
            System.out.print(i + " ");
            i++;
        }
    }
}
