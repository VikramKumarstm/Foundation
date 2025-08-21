// Write a C program to find all roots of a quadratic equation.

import java.util.Scanner;

public class FindAllRootsQuadraticEquation {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        double a, b, c, root1, root2, imaginary, discriminant;

        System.out.println("Enter values of a, b, c of quadratic equation (aX^2 + bX + c) :");
        a = sc.nextFloat();
        b = sc.nextFloat();
        c = sc.nextFloat();

        // Find discriminant of the equation
        discriminant = (b * b) - (4 * a * c);

        //7781955555
        //Find the nature of the discriminant
        if(discriminant > 0) {
            root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            root2 = (-b - Math.sqrt(discriminant)) / (2 * a);

            System.out.println("Two distinct and real roots exists : "+ root1+" and "+root2);
        }
        else if(discriminant == 0) {
            root1 = root2 = -b / (2 * a);

            System.out.println("Two equal and real roots exists : "+ root1+" and "+root2);
        }
        else if(discriminant < 0) {
            root1 = root2 = -b / (2 * a);
            imaginary = Math.sqrt(-discriminant)/ (2 * a);

            System.out.println("Two distinct complex roots exists "
            + root1 +" "+ imaginary+" and "+ root2+" "+imaginary);
        }


    }
}
