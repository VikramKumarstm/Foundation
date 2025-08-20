// Write a C program to input any alphabet and check whether it is vowel or consonant.

import java.util.Scanner;

public class CheckVowelConsonant {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        char ch;
        System.out.println("Enter any alphabet :");
        ch = sc.next().charAt(0);

        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' 
        || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
            System.out.println("Vowel");
        }
        else if((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
            System.out.println("Consonant");
        }
        else {
            System.out.println("Invalid input!!!!!!!");
        }
    }
}
