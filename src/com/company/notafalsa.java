package com.company;

import java.util.Scanner;

public class notafalsa {
        public static void main(String[] args) {
        Scanner InputData = new Scanner(System.in);
        double nota1,nota2,nota3,nota4,elimi,prom;
        System.out.println("Enter you calification 1: ");
        nota1 = InputData.nextInt();
        System.out.println("Enter you calification 2: ");
        nota2 = InputData.nextInt();
        System.out.println("Enter you calification 3: ");
        nota3 = InputData.nextInt();
        System.out.println("Enter you calification 4: ");
        nota4 = InputData.nextInt();

        if (nota1<nota2 && nota1<nota3 && nota1<nota4)
        {
            elimi = nota1;
            prom = (nota1 + nota2 + nota3 + nota4 - elimi)/3;
            System.out.println("Su promedio fue: "+ prom + "La nota eliminada fue: "+ elimi);
        }
        else
            if (nota2<nota1 && nota2<nota3 && nota2<nota4)
            {
                elimi = nota2;
                prom = (nota1 + nota2 + nota3 + nota4 - elimi)/3;
                System.out.println("Su promedio fue: "+ prom + "La nota eliminada fue: "+ elimi);
            }
            else
                if (nota3<nota1 && nota3<nota2 && nota3<nota4)
                {
                    elimi = nota3;
                    prom = (nota1 + nota2 + nota3 + nota4 - elimi)/3;
                    System.out.println("Su promedio fue: "+ prom + "La nota eliminada fue: "+ elimi);
                }
                else
                    if (nota4<nota1 && nota4<nota2 && nota4<nota3)
                    {
                            elimi = nota4;
                            prom = (nota1 + nota2 + nota3 + nota4 - elimi)/3;
                            System.out.println("Su promedio fue: "+ prom + "La nota eliminada fue: "+ elimi);
                    }


    }
}
