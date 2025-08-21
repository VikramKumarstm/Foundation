//Write a C program to check whether year is leap year or not using conditional operator.

package ConditionalOperator;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter year :");
        int year = sc.nextInt();

        String result = (((year % 4 == 0) && (year % 100 != 0 )) || (year % 400 == 0)) 
        ? "Leap Year" : "Common Year";

        System.out.println(result);

    }
}
