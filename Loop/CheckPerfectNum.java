// Write a C program to check whether a number is Perfect number or not.

package Loop;

import java.util.Scanner;

public class CheckPerfectNum {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number :");
        int n = sc.nextInt();

        int sum = 0;

        for(int i=1; i<=n/2; i++) {

            if(n % i == 0) {
                sum += i;
            }

        }

        if(sum == n) {
            System.out.println("Perfect Number");
        } else {
            System.out.println("Not a perfect number");
        }


    }
}
