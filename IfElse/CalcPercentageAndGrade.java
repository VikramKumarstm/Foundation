/*
Write a C program to input marks of five subjects Physics, Chemistry, Biology, 
Mathematics and Computer. Calculate percentage and grade according to following:
Percentage >= 90% : Grade A
Percentage >= 80% : Grade B
Percentage >= 70% : Grade C
Percentage >= 60% : Grade D
Percentage >= 40% : Grade E
Percentage < 40% : Grade F
 */

 import java.util.Scanner;
public class CalcPercentageAndGrade {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter marks of Physics :");
        int physics = sc.nextInt();
        System.out.println("Enter marks of Chemistry :");
        int chemistry= sc.nextInt();
        System.out.println("Enter marks of Biology :");
        int biology = sc.nextInt();
        System.out.println("Enter marks of Mathematics :");
        int mathematics = sc.nextInt();
        System.out.println("Enter marks of Computer :");
        int computer = sc.nextInt();


        float percentage = (physics + chemistry + biology + mathematics + computer) / 5f;

        if(percentage >= 90) {
            System.out.println("Grade A");
        }
        else if(percentage >= 80) {
            System.out.println("Grade B");
        }
        else if(percentage >= 70) {
            System.out.println("Grade C");
        }
        else if(percentage >= 60) {
            System.out.println("Grade D");
        }
        else if(percentage >= 40) {
            System.out.println("Grade E");
        }
        else {
            System.out.println("Grade F");
        }


        
    }
}
