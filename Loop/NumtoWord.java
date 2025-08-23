// Write a C program to enter a number and print it in words.

package Loop;

import java.util.Scanner;

public class NumtoWord {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number :");
        int n = sc.nextInt();

        int digit, num = 0;

        // Reverse origional Number and store in num variable
        while(n != 0) {

            digit = n % 10;
            num = digit + (num * 10);
            n /= 10;

        }

        int condition; // store last digit of num

        while (num != 0) {
            condition = num % 10;  // calc last digit

            switch (condition) {  
                case 0:
                    System.out.print("Zero ");
                    break;
                case 1:
                    System.out.print("One ");
                    break;
                case 2:
                    System.out.print("Two ");
                    break;
                case 3:
                    System.out.print("Three ");
                    break;
                case 4:
                    System.out.print("Four ");
                    break;
                case 5:
                    System.out.print("Five ");
                    break;
                case 6:
                    System.out.print("Six ");
                    break;
                case 7:
                    System.out.print("Seven ");
                    break;
                case 8:
                    System.out.print("Eight ");
                    break;
                case 9:
                    System.out.print("Nine ");
                    break;
            }

            num /= 10;
        }

    }

}
