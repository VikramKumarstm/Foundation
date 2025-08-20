// Write a C program to input month number and print number of days in that month.
import java.util.Scanner;
public class PrintNoOfDaysInMonth {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int monthNum;

        System.out.println("Enter month number(1-12) :");
        monthNum = sc.nextInt();

        if(monthNum == 1 || monthNum == 3 || monthNum == 5 || monthNum == 7 || monthNum == 8 || monthNum == 10 || monthNum == 12) {
            System.out.println("31 Days");
        }
        else if(monthNum == 4 || monthNum == 6 || monthNum == 9 || monthNum == 11) {
            System.out.println("30 Days");
        }
        else if(monthNum == 2) {
            System.out.println("28 Days");
        }
        else {
            System.out.println("Invalid Input");
        }
    }
}
