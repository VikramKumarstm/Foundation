// Write a C program to check whether a year is leap year or not.

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int year;

        System.out.println("Enter a Year :");
        year = sc.nextInt();

        if((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
            System.out.println("Year is leap year");
        }
        else {
            System.out.println("Year is Common Year");
        }


    }
}
