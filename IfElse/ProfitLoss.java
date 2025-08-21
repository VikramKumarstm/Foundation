// Write a C program to calculate profit or loss.

import java.util.Scanner;

public class ProfitLoss {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int costPrice, sellingPrice;

        System.out.println("Enter Cost Price :");
        costPrice = sc.nextInt();
        System.out.println("Enter Selling Price :");
        sellingPrice = sc.nextInt();

        if(sellingPrice > costPrice) {

            int profit = sellingPrice - costPrice;
            System.out.println("Profit is "+ profit);

        } 
        else if(sellingPrice < costPrice) {
            
            int loss = costPrice - sellingPrice;
            System.out.println("Loss is "+ -loss);

        }
        else {
            System.out.println("No profit No loss");
        }

        
        

        

    }
}
