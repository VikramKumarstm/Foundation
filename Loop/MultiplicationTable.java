// Write a C program to print multiplication table of any number.

package Loop;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number :");
        int n = sc.nextInt();

        for(int i=1; i<=10; i++) {
            System.out.println(n+" * "+i+" = "+ n*i);
        }
    }
}
