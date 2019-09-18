package Cours.Jul6ForAndWhile;

import java.util.Scanner;

public class WhileFonc {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("Enter the number");
        int number=scan.nextInt();
        int faktoriyel=1;
        while (number>=1){
            faktoriyel=faktoriyel*number;


            number--;

        }
        System.out.println("faktoriyel"+faktoriyel);

    }
}




//5!