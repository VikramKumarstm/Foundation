// Write a C program to print all Prime numbers between 1 to n.

package Loop;

import java.util.Scanner;

public class PrintPrimeNo {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number :");
        int n = sc.nextInt();

        int isPrime;

        System.out.println("Prime No : ");
        for(int i=2; i<=n; i++) {
            isPrime = 1;
            for(int j=2; j<=i/2; j++) {
                if(i % j == 0) {
                    isPrime = 0;
                }
            }

            if(isPrime == 1) {
                System.out.print(i+" ");
            }

            
        }


    }
}
