package com.company;
import java.util.Scanner;
public class fruteria {

    public static void main(String[] args) {
        Scanner InputData = new Scanner(System.in);
        double numkg,price,total;
        System.out.println("Enter the number of kilos purchased: ");
        numkg = InputData.nextDouble();
        System.out.println("Enter price of fruit: ");
        price = InputData.nextDouble();

        if (numkg < 2)
        {
            total = (numkg * price)-(numkg * price * 0);
            System.out.println("Your discount is 0%"+ total);
        }
        else
            if (numkg > 2 && numkg <= 5)
            {
                total = (numkg * price)-(numkg * price * 0.10);
                System.out.println("Your discount is 10%"+ total);
            }
            else
                if (numkg > 5 && numkg < 10)
            {
                total = (numkg * price)-(numkg * price * 0.15);
                System.out.println("Your discount is 15%"+ total);
            }
                else
                    if (numkg > 10)
                    {
                        total = (numkg * price)-(numkg * price * 0.20);
                        System.out.println("Your discount is 20%"+ total);
                    }
    }
}
