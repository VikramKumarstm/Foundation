// Write a C program to find all prime factors of a number.

package Loop;

import java.util.Scanner;

public class PrimeFactors {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a number : ");
        int n = sc.nextInt();

        int isPrime;

        System.out.println("All prime factor of a number is :");
        for(int i=2; i<=n; i++) {

            isPrime = 1;

            for(int j=2; j<=i/2; j++) {

                if(i % j == 0) {
                    isPrime = 0;
                    break;
                }
            }

            if(isPrime == 1) {
                if(n % i == 0) {
                    System.out.print(i +" ");
                }
            }
        }

    }
}
