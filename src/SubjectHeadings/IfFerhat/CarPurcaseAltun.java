package SubjectHeadings.IfFerhat;

import java.util.Scanner;

public class CarPurcaseAltun {
    public static void main(String[] args) {
        Scanner car=new Scanner(System.in);
        System.out.print("X or Y ");
        String answer=car.next();
        int totalPrice=0;
        if (answer.equals("X")|| answer.equals("x")) {

            totalPrice =30000;
            System.out.println("Do you want\" body\" package:(Y/N)");


            String body = car.next();
            if (body.equalsIgnoreCase("Y")) {
                totalPrice=totalPrice+5000;


            } else if (answer.equalsIgnoreCase("N")) {
                totalPrice=totalPrice+0;


            } else {
                System.out.println("Please Y or N");
            }
            System.out.println("Do you want sound?(Y/n)");
            String sound = car.next();
            if (sound.equalsIgnoreCase("Y")) {
                totalPrice=totalPrice+3000;

            } else if (sound.equalsIgnoreCase("N")) {
                totalPrice=totalPrice+0;

            } else {
                System.out.println("Please Y or N");

            }
            System.out.println("Total price $"+totalPrice);

        }

        else if (answer.equalsIgnoreCase("Y")){
            totalPrice=35000;
            System.out.print("Dou you want Ent.pack.?(Y/N)" );
            String ent=car.next();
            if (ent.equalsIgnoreCase("Y")){
                totalPrice=totalPrice+8000;

            }
            else if (ent.equalsIgnoreCase("N")){
                totalPrice=totalPrice+0;

            }
            else {
                System.out.println("Please Y or N");
            }
            System.out.print("Safety?(Y/N)");
            String safety=car.next();
            if (safety.equalsIgnoreCase("Y")){
                totalPrice=totalPrice+4000;

            }
            else if (safety.equalsIgnoreCase("N")){
                totalPrice=totalPrice+0;

            }
            else {
                System.out.println("please Y or N");
            }

        }
        else {

            System.out.println("X or Y");
        }
        System.out.println("Total price for"+answer+ "is $"+ totalPrice);
    }
}


