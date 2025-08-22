// Write a C program to find sum of all natural numbers between 1 to n.

package Loop;

import java.util.Scanner;

public class SumOfNaturalNum {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number :");
        int n = sc.nextInt();

        int sum = 0;

        for(int i=1; i<=n; i++) {
            sum += i;
        }

        System.out.println("Sum of natural numbers between 1 to "+n+" = "+sum);
    }
}
