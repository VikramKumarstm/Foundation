// Write a C program to print all Armstrong numbers between 1 to n.

package Loop;

import java.util.Scanner;

public class PrintArmstrong {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Uper limit :");
        int n = sc.nextInt();

        int digit, count, arm;

        System.out.println("All armstrong number b/w 1 to "+n+" = ");
        for(int i=1; i<=n; i++) {

            int num = i;
            int origionalNum = i;
            count = arm = 0;

            while(num != 0) {

                digit = num % 10;
                count++;
                num /= 10;

            }

            while(origionalNum > 0) {

                digit = origionalNum % 10;
                arm += Math.pow(digit, count);
                origionalNum /= 10;

            }

            if(i == arm) {
                System.out.print(i +" ");
            }


        }

    }
}
