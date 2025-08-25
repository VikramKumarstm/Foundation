// Write a C program to print all Perfect numbers between 1 to n.

package Loop;

import java.util.Scanner;

public class PrintAllPerfectNo {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number :");
        int n = sc.nextInt();

        int sum;

        System.out.println("Perfect number between 1 to "+n+" = ");
        for(int i=2; i<=n; i++) {

            sum = 0;

            for(int j=1; j<=i/2; j++) {

                if( i % j == 0 ) {

                    sum += j;
                
                }

            }

            if(i == sum) {
                System.out.print(i+" ");
            }

        }


    }

}
