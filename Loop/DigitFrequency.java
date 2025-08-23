// Write a C program to find frequency of each digit in a given integer.

package Loop;

import java.util.Scanner;

public class DigitFrequency {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number :");
        int n = sc.nextInt();

        int freq[] = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int i;

        for(i=0; i<freq.length; i++) {
            freq[i] = 0;
        }

        int digit;

        while (n != 0) {

            digit = n % 10;
            freq[digit]++;
            n /= 10;

        }

        for(i=0; i<freq.length; i++) {
            System.out.println("Frequency of "+i+" = "+ freq[i]);
        }
        
    }
}
