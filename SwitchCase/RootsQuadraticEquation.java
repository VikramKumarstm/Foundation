// Write a C program to find roots of a quadratic equation using switch case.

package SwitchCase;

import java.util.Scanner;

public class RootsQuadraticEquation {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("inter a :");
        int a = sc.nextInt();
        System.out.println("Enter b :");
        int b = sc.nextInt();
        System.out.println("Enter c :");
        int c = sc.nextInt();

        int discriminant = (b * b) - 4 * a * c;

        int condition = (discriminant > 0) ? 0 : (discriminant == 0) ? 1 : 2;

        double root1, root2, imaginary;

        switch (condition) {
            case 0:

                root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
                root2 = (-b - Math.sqrt(discriminant))/ (2 * a);

                System.out.println("Two distinct and real roots exists "+ root1+ " and "+ root2);

                break;

            case 1:

                root1 = root2 = (-b)/ (2 * a);

                System.out.println("Two equal and real roots exists "+ root1+ " and "+ root2);

                break;

            case 2:

                root1 = root2 = -b / (2 * a);
                imaginary = Math.sqrt(-discriminant) / (2 * a);

                System.out.println("Two distinct complex roots exists "+ root1+ " "+ imaginary+" and "+
                root2+" "+imaginary);

                break;
        
            default:
                System.out.println("Invalid input");
                break;
        }
    }
}
