// Write a C program to check whether a character is uppercase or lowercase alphabet.

import java.util.Scanner;
public class CheckUperLowerCase {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        char ch;

        System.out.println("Enter a character :");
        ch = sc.next().charAt(0);

        if(ch >= 'a' && ch <= 'z') {
            System.out.println("Character is Lowercase alphabet");
        }
        else if(ch >= 'A' && ch <= 'Z') {
            System.out.println("Character is Uppercase alphabet");
        }
        else {
            System.out.println("Invalid input");
        }
        

    }
}
