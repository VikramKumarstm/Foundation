// Write a C program to check whether a character is alphabet or not.

import java.util.Scanner;

public class CheckAlphbet {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        char ch;

        System.out.println("Enter a character :");
        ch = sc.next().charAt(0);
        
        if((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
            System.out.println("Character is alphabet");
        }
        else {
            System.out.println("Character is not alphabet");
        }

    }
}
