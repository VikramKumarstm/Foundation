package Loop;

import java.util.Scanner;

public class LCM {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter two numbers :");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int max = (num1 > num2) ? num1 : num2;
        int lcm = 1;

        for(int i=1; i<=max; i++) {
            
            if(num1 % i == 0 && num2 % i == 0) {
                lcm *= i;
            }
        }

        System.out.println("LCM of "+num1+" and "+num2+" = "+ lcm);

    }
}
