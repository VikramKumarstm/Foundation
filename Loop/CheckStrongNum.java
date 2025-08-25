// Write a C program to check whether a number is Strong number or not.

package Loop;

import java.util.Scanner;

public class CheckStrongNum {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number :");
        int n = sc.nextInt();

        int digit, fact, sum = 0;
        int origionalNum = n;

        while(n != 0) {

            digit = n % 10;
            fact = 1;

            for(int i=1; i<=digit; i++) {
                fact *= i;
            }

            sum += fact;
            
            n /= 10;

        }

        if(sum == origionalNum) {
            System.out.println("Strong Number");
        } else {
            System.out.println("Not a Strong Number");
        }
    }
}
