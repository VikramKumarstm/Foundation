//Write a C program to check whether a number is even or odd using conditional operator.

package ConditionalOperator;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number");
        int n = sc.nextInt();

        String result = (n % 2 == 0) ? "Even" : "Odd";

        System.out.println(result);
    }
}
