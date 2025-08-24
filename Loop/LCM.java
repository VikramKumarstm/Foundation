// Write a C program to find LCM of two numbers.

package Loop;

import java.util.Scanner;

public class LCM {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter two numbers :");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int max = (num1 > num2) ? num1 : num2;
        int i;
        i = max;
        int lcm = 1;

        while(true) {
            if(i % num1 == 0 && i % num2 == 0) {
                lcm = i;
                break;
            }

            i += max;
        }

        System.out.println("LCM of "+num1+" and "+num2+" = "+ lcm);

    }
}
