// Write a C program to check whether an alphabet is vowel or consonant using switch case.

package SwitchCase;

import java.util.Scanner;

public class VowelConsonant {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter an alphabet :");
        char ch = sc.next().charAt(0);

        switch (ch) {
            case 'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U':
                System.out.println("Vowel");
                break;
        
            default:
                System.out.println("Consonant");
                break;
        }
        
    }
}
