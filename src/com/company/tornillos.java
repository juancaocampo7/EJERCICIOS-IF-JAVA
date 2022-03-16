package com.company;
import java.util.Scanner;
public class tornillos {

    public static void main(String[] args) {
        Scanner InputData = new Scanner(System.in);
        int screwsprod, screwsdef;
        System.out.println("Enter amount of produced screws: ");
        screwsprod = InputData.nextInt();
        System.out.println("Enter amount of defective screws: ");
        screwsdef = InputData.nextInt();

        if (screwsprod <= 1000 && screwsdef >= 200)
        {
            System.out.println("Grade 5");
        }
        else
            if (screwsdef < 200 && screwsprod <= 1000 )
            {
            System.out.println("Grade 6");
            }
            else
                if (screwsprod > 1000 && screwsdef >= 200)
                {
                    System.out.println("Grade 7");
                }
                else
                    if (screwsdef <= 200 && screwsprod >= 1000)
                    {
                        System.out.println("Grade 8");
                    }
    }
}

