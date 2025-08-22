// Write a C program print total number of days in a month using switch case.

package SwitchCase;

import java.util.Scanner;

public class DaysInMonth {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Month Number(1 - 12) :");
        int num = sc.nextInt();

        switch (num) {
            case 1, 3, 5, 7, 8, 10, 12:
                System.out.println("31 days");
                break;
            case 4, 6, 9, 11:
                System.out.println("30 days");
                break;
            case 2:
                System.out.println("28/29 days");
                break;
        
            default:
                System.out.println("Invalid input");
                break;
        }
    }
}
