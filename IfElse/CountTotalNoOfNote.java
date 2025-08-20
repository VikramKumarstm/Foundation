// Write a C program to count total number of notes in given amount.

import java.util.Scanner;

public class CountTotalNoOfNote {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int amount;
        int note500, note200, note100, note50, note20, note10, note5, note2, note1;
        note500 = note200 = note100 = note50 = note20 = note10 = note5 = note2 = note1 = 0;

        System.out.println("Enter Total Amount :");
        amount = sc.nextInt();

        if(amount >= 500) {
            note500 = amount/500;
            amount -= 500 * note500;
        }
        if(amount >= 200) {
            note200 = amount/200;
            amount -= 200 * note200;
        }
        if(amount >= 100) {
            note100 = amount/100;
            amount -= 100 * note100;
        }
        if(amount >= 50) {
            note50 = amount/50;
            amount -= 50 * note50;
        }
        if(amount >= 20) {
            note20 = amount/20;
            amount -= 20 * note20;
        }
        if(amount >= 10) {
            note10 = amount/10;
            amount -= 10 * note10;
        }
        if(amount >= 5) {
            note5 = amount/5;
            amount -= 5 * note5;
        }
        if(amount >= 2) {
            note2 = amount/2;
            amount -= 2 * note2;
        }
        if(amount >= 1) {
            note1 = amount/1;
            amount -= 1 * note1;
        }

        System.out.println("Total Number of Notes :");
        System.out.println("500 : "+ note500);
        System.out.println("200 : "+ note200);
        System.out.println("100 : "+ note100);
        System.out.println("050 : "+ note50);
        System.out.println("020 : "+ note20);
        System.out.println("010 : "+ note10);
        System.out.println("005 : "+ note5);
        System.out.println("002 : "+ note2);
        System.out.println("001 : "+ note1);

    }
}
