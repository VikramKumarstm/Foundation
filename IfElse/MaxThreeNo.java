// Write a C program to find maximum between three numbers.

import java.util.Scanner;

public class MaxThreeNo {
    public static void main(String args[])
    {
        Scanner sc  = new Scanner(System.in);

        int n1, n2, n3;

        System.out.println("Enter First Number :");
        n1 = sc.nextInt();
        System.out.println("Enter Second Number :");
        n2 = sc.nextInt();
        System.out.println("Enter third Number :");
        n3 = sc.nextInt();

        if(n1 > n2 && n1 > n3) {
            System.out.println("Maximum number is :"+n1);
        }
        else if(n2 > n1 && n2 > n3) {
            System.out.println("Maximum number is :"+n2);
        }
        else if(n3 > n1 && n3 > n2) {
            System.out.println("Maximum number is :"+n3);
        }
        else {
            System.out.println("All numbers are equal");
        }
    }
}
