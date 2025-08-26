//Write a C program to print Fibonacci series up to n terms.

package Loop;

import java.util.Scanner;

public class FibonacciSeries {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter nth term :");
        int n = sc.nextInt();

        int firstNum = 0;
        int secondNum = 1;
        int fib = 0;

        System.out.println("Finbonacci series up to n terms = ");
        for(int i=1; i<=n; i++) {
            
            System.out.print(fib+" ");

            firstNum = secondNum;
            secondNum = fib;
            fib = firstNum + secondNum;
        }

    }

}
