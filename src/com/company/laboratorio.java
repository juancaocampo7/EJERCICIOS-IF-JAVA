package com.company;
import java.util.Scanner;
public class laboratorio {
    public static void main(String[] args) {
        Scanner InputData = new Scanner(System.in);
        double  agemonth,levelh;
        String sex;
        System.out.println("Enter you sex: ");
        sex = InputData.nextLine();
        System.out.println("Enter you age in months:  ");
        agemonth = InputData.nextDouble();
        System.out.println("Hemoglobin level: ");
        levelh = InputData.nextDouble();

        if (agemonth<=1)
        {
            if (levelh >= 13 && levelh <= 26) {
                System.out.println("Negative");
            } else {
                System.out.println("Positive");
            }
        }
        else
            if (agemonth >1 && agemonth <=6)
            {
                if (levelh >=10 && levelh <=18)
                {
                    System.out.println("Negative");
                }
                else {
                    System.out.println("Positive");
                }
            }
        else
            if (agemonth >=6 && agemonth <=12)
            {
                if (levelh >= 11 && levelh <= 15)
                {
                    System.out.println("Negative");
                }
                else
                {
                    System.out.println("Positive");
                }
            }
        else
            if (agemonth >=12 && agemonth <=60)
            {
                if (levelh >= 11.5 && levelh <= 15)
                {
                    System.out.println("Negative");
                }
                else {
                    System.out.println("Positive");
                }
            }
        else
            if (agemonth >=60 && agemonth <=120)
            {
                if (levelh >=12.6 && levelh <=15.5)
                {
                    System.out.println("Negative");
                }
                else {
                    System.out.println("Positive");
                }
            }
        else
            if (agemonth >=120 && agemonth <= 180)
            {
                if (levelh >=13 && levelh <= 15.5)
                {
                    System.out.println("Negative");
                }
                else {
                    System.out.println("Positive");
                }
            }


    }
}
