// Write a C program to check whether a number is Armstrong number or not.

package Loop;

import java.util.Scanner;

public class CheckArmstrong {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number :");
        int n = sc.nextInt();

        int digit, count= 0, arm=0;
        int origionalNum = n;
        int num = n;

        while(n != 0) {
            digit = n % 10;
            count++;
            n /= 10;
        }

        while(origionalNum > 0) {

            digit = origionalNum % 10;
            arm += Math.pow(digit, count);
            origionalNum /= 10;

        }

        if(num == arm) {
            System.out.println("An armstrong number.");
        } else {
            System.out.println("Not an armstrong number");
        }

    

    }
}
