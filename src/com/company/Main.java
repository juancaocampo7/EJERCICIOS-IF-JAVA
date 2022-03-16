package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner InputData = new Scanner(System.in);
        int numwheels, total;
        System.out.println("Enter number wheels: ");
        numwheels = InputData.nextInt();
        if (numwheels < 5)
        {
            total = 30000 * numwheels;
            System.out.println("total to pay: "+ total + "unit price: "+ 30000);
        }
        else
            if (numwheels >= 5 && numwheels <= 10){
                total = 25000 * numwheels;
                System.out.println("total to pay: "+ total + "unit price: "+ 25000);
        }
            else {
                total = 20000 * numwheels;
                System.out.println("Enter to pay: "+ total + "unit price: "+ 20000);
            }

    }
}
