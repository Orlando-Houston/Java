package Udemy;

import java.util.Scanner;

public class MainMethod {

    public static void faktoriyel() {
        Scanner scan=new Scanner (System.in);
        System.out.println ("Enter a number");
        int number=scan.nextInt ();//kullanicidan sayiyi almak icin

        int faktoriyel=1;//fakt hesabi yapmak icin
        while (number>0){
            faktoriyel*=number;
            number--;
        }
        System.out.println ("Faktoriyel="+faktoriyel);


    }

    public static void selamlama() {
        System.out.println ("Merhaba nasilsiniz");
        System.out.println ("Selamlar");
        System.out.println ("My name is Altun");

    }
    public static void main(String[] args) {
        selamlama ();
        faktoriyel ();

    }
}
