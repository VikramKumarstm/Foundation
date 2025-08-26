// Write a C program to print all Strong numbers between 1 to n.

package Loop;

import java.util.Scanner;

public class PrintStrongNum {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number :");
        int n = sc.nextInt();

        int digit, fact, sum;

        System.out.println("All Strong number b/w 1 to "+n+" = ");
        for(int i=1; i<=n; i++) {

            int num = i;
            sum = 0;

            while(num != 0) {
                
                digit = num % 10;
                fact = 1;

                for(int j=1; j<=digit; j++) {

                    fact *= j;

                }

                sum += fact;

                num /= 10;

            }

            if(i == sum) {
                System.out.print(i+" ");
            }
        }

    }

}
