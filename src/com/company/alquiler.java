package com.company;

import java.util.Scanner;

public class alquiler {
    public static void main(String[] args) {
        Scanner InputData = new Scanner(System.in);
        double km_traveled,fixed_mount,tax,pay_amount;
        System.out.println("Enter the km traveled for us: ");
        km_traveled = InputData.nextDouble();
        fixed_mount = 30000;
        pay_amount = 0;
        if (km_traveled <= 300)
        {
            pay_amount=fixed_mount;
            tax = pay_amount * 0.16;
            System.out.println("value of amount to pay"+ pay_amount);
            System.out.println("tax amount value"+ tax);
            System.out.println("fixed amount value"+ fixed_mount);
        }
        else
            if (km_traveled >=300 && km_traveled <=1000)
            {
                pay_amount=fixed_mount+(km_traveled - 300)*15000;
                tax = pay_amount * 0.16;
                System.out.println("value of amount to pay"+ pay_amount);
                System.out.println("tax amount value"+ tax);
                System.out.println("fixed amount value"+ fixed_mount);
            }
            else
                if (km_traveled > 1000)
                {
                    pay_amount=fixed_mount+(km_traveled - 1000)*10000;
                    tax = pay_amount * 0.16;
                    System.out.println("value of amount to pay"+ pay_amount);
                    System.out.println("tax amount value"+ tax);
                    System.out.println("fixed amount value"+ fixed_mount);
                }


    }
}
