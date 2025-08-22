// Write a C program to find sum of all even numbers between 1 to n.

package Loop;

import java.util.Scanner;

public class SumEvenNum {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number :");
        int n = sc.nextInt();

        int sum = 0;

        for(int i=0; i<=n; i++) {
            if(i % 2 == 0) {
                sum += i;
            }
        }

        System.out.println("Sum of Even numbers b/w 1 to "+n+" = "+sum);
    }
}
