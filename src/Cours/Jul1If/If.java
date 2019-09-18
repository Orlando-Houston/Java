package Cours.Jul1If;

import java.util.Scanner;

public class If {
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);

        int number=scan.nextInt();


        if(number==1){
            System.out.println("one");
        }
        else if(number==2){
            System.out.println("Tru");

        }
        else if(number==3){
            System.out.println("Three");

        }
        else if(number==4){
            System.out.println("Four");
        }
        else{
            System.out.println("Invalid number");



        }
    }
}


