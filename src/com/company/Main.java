package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// Scrie un program care afiseaza primele 5 cifre mai mari sau egale cu 3 ale numarului introdus de la tastatura,
        // Conditie: nu se foloseste String

        Scanner scan=new Scanner(System.in);
        System.out.println("Introduceti numarul dorit: ");
        int number=scan.nextInt();
        int newNumber=0; //calculam inversul nr introdus
        int counter=0; //numaram cate cifre sunt mai mari sau egale cu 3
        int primeleCifre=0; //pentru afisarea cifrelor care indeplinesc conditia
        System.out.println("Primele 5 cifre mai mari sau egale cu 3 din numarul 64251382 sunt: ");
        while(number!=0)
        {
            newNumber=newNumber*10+number%10;
            number=number/10;
        }
        while(newNumber!=0) {

            if (newNumber % 10 >= 3 && counter < 5) {
                primeleCifre=primeleCifre*10+newNumber%10;
                counter++;

            }
            newNumber/=10;
        }
        System.out.println(primeleCifre);
    }
}
