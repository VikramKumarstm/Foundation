// Write a C program to print all Armstrong numbers between 1 to n.

package Loop;

import java.util.Scanner;

public class PrintArmstrong {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        // take input from user
        System.out.println("Enter Uper limit :");
        int n = sc.nextInt();

        int digit, count, arm;

        System.out.println("All armstrong number b/w 1 to "+n+" = ");
        for(int i=1; i<=n; i++) {

            int num = i;
            int origionalNum = i;
            count = arm = 0;

            // Calculate number of digit
            while(num != 0) {

                digit = num % 10;
                count++;
                num /= 10;

            }

            // calculate number is armstrong or not
            while(origionalNum > 0) {

                digit = origionalNum % 10;
                arm += Math.pow(digit, count);
                origionalNum /= 10;

            }

            // check if orgional number is equal to armstrong then print the number
            if(i == arm) {
                System.out.print(i +" ");
            }


        }

    }
}
