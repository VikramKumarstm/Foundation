// Write a C program to print all even numbers between 1 to 100. – using while loop

package Loop;

import java.util.Scanner;

public class EvenNumber {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int i=1;
        while(i <= 100) {
            if(i % 2 == 0) {
                System.out.print(i + " ");
            }
            i++;
        }
    }
}
