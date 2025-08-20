// Write a C program to input any character and check whether it is alphabet, digit or
// special character.

import java.util.Scanner;

public class CheckAlphabetDigitSpecialChar {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        char ch;

        System.out.println("Enter a character :");
        ch = sc.next().charAt(0);

        if((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
            System.out.println("Alphabet");
        }
        else if(ch >= '0' && ch <= '9') {
            System.out.println("Digit");
        }
        else {
            System.out.println("Special Character");
        }
    }
}
