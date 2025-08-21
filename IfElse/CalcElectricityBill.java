/*
Write a C program to input electricity unit charges and calculate total electricity
bill according to the given condition:
For first 50 units Rs. 0.50/unit
For next 100 units Rs. 0.75/unit
For next 100 units Rs. 1.20/unit
For unit above 250 Rs. 1.50/unit
An additional surcharge of 20% is added to the bill
 */

 import java.util.Scanner;

public class CalcElectricityBill {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter electricity Unit : ");
        int electricityUnit = sc.nextInt();

        float electricityBill;

        if(electricityUnit <= 50) {
            electricityBill = electricityUnit * 0.50f;
        }
        else if(electricityUnit > 50 && electricityUnit <= 150) {
            electricityBill = (electricityUnit - 50) * 0.75f + (50 * 0.50f);
        }
        else if(electricityUnit > 150 && electricityUnit <= 250) {
            electricityBill = (electricityUnit - 150) * 1.20f + (100 * 0.75f) + (50 * 0.50f);
        }
        else {
            electricityBill = (electricityUnit - 250) * 1.50f + (100 * 1.20f) + (100 * 0.75f) + (50 * 0.50f);
        }

        float surCharge =  electricityBill * 0.20f;
        float totalAmt = electricityBill+surCharge;

        System.out.println("Total electricity bill is :"+ totalAmt);
        
    }
}
