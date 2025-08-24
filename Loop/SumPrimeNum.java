// Write a C program to find sum of all prime numbers between 1 to n.

package Loop;

import java.util.Scanner;

public class SumPrimeNum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter uper limit number :");
        int n = sc.nextInt();

        int isPrime;
        int sum = 0;

        System.out.print("Prime number between 1 to "+n+" = ");
        for(int i=2; i<=n; i++) {

            isPrime = 1;
            for(int j=2; j<=i/2; j++) {

                if(i % j == 0) {
                    isPrime = 0;
                }

            }

            if(isPrime == 1) {
                System.out.print(i+" ");
                sum += i;
            }
        }

        System.out.println("\n Sum of prime number ="+ sum);


        
    }
}
