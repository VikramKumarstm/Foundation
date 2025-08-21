/*
 Write a C program to input basic salary of an employee and calculate its Gross salary according to following:
 Basic Salary <= 10000 : HRA = 20%, DA = 80%
 Basic Salary <= 20000 : HRA = 25%, DA = 90%
 Basic Salary > 20000 : HRA = 30%, DA = 95%
 */

import java.util.Scanner;

public class CalcGrossSalary {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Basic Salary of an Employee :");
        float bSalary = sc.nextFloat();

        float da, hra;

        if(bSalary <= 10000) {
            da = bSalary * 0.8f;
            hra = bSalary * 0.2f;
        }
        else if(bSalary <= 20000) {
            da = bSalary * 0.9f;
            hra = bSalary * 0.25f;
        }
        else {
            da = bSalary * 0.95f;
            hra = bSalary * 0.3f;
        }

        float gross = bSalary + hra + da;

        System.out.println("Gross salary of an employee is :"+ gross);
    }
}
