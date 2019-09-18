package Cours.Jul1If;

import java.util.Scanner;

public class FunctionWhile {
    public static void main(String[]args){

        Scanner scan= new Scanner(System.in);

        System.out.println("Number input");
        int number=scan.nextInt();int factorial=1;
        while(number>1){
            factorial=factorial*number;

            System.out.println("Factorial"+factorial+"number"+number);


            number--;
        }
        System.out.println("Factorial"+factorial);

    }
}

