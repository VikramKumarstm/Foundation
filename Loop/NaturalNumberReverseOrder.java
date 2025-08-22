// Write a C program to print all natural numbers in reverse (from n to 1). – 
// using while loop

package Loop;

import java.util.Scanner;

public class NaturalNumberReverseOrder {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number :");
        int n = sc.nextInt();

        int i=1;
        while (n >= i) {
            System.out.print(n + " ");
            n--;
        }
    }
}
