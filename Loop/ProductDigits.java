// Write a C program to calculate product of digits of a number.

package Loop;

import java.util.Scanner;

public class ProductDigits {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number :");
        int n = sc.nextInt();

        int digit;
        int product = 1;

        while (n != 0) {
            
            digit = n % 10;
            product *= digit;
            n /= 10;

        }

        System.out.println("Product of given digits of a number = "+ product);

    }
}
