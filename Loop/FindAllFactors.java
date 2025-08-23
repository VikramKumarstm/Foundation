// Write a C program to find all factors of a number.
package Loop;

import java.util.Scanner;

public class FindAllFactors {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number :");
        int n = sc.nextInt();

        System.out.println("All factors of given number is : ");
        for(int i=1; i<=n; i++) {
            if(n % i == 0) {
                System.out.print(i+" ");
            }
        }

    }
}
