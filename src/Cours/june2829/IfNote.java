package Cours.june2829;

import java.util.Scanner;

public class IfNote {
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Your grade Enter:");
        int grade =scan.nextInt();




        if(grade>70){
            System.out.println("Dersten gectiniz....");

        }
        else{
            System.out.println("Dersten kaldiniz");

        }

    }
}
