package SubjectHeadings.IfFerhat;

import java.util.Scanner;

public class DriverLicence {
    public static void main (String[]args){
        Scanner readKey=new Scanner(System.in);
        System.out.print("Please Enter Your Age:");
        int age=readKey.nextInt();
        if (age>=16){
            System.out.println("F for first application,R for renewal");
            String choise=readKey.next();
            if (choise.equals("F")) System.out.println("ID,Form,Photo");
            else if (choise.equals("R"))System.out.println("Old Driver's Licence");
            else System.out.println("Plwase enter F or R ");
        }
        else if (age <16)System.out.println("You can not apply for Driver's Licence");

    }
}




