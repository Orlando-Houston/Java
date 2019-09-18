package Cours.June30;

import java.util.Scanner;

public class Perimeters {
    public static void main(String[] args) {
        Scanner scanParameter=new Scanner(System.in);
        System.out.println("C for circle,R for rectangle,T for Triangle");
        String shape=scanParameter.next();
        double perimeter=0;
        if (shape.equals("C")){
            System.out.print("Please enter radius");
            int radius=scanParameter.nextInt();
            perimeter=2*3.14;

        }
        else if (shape.equals("R")){
            System.out.print("Please width");
            int width=scanParameter.nextInt();
            System.out.print("Please height");
            int height=scanParameter.nextInt();
            perimeter=2*(width+height);


        }
        else if (shape.equals("T")){
            System.out.println("Side1:");
            int side1= scanParameter.nextInt();
            System.out.println("Side2:");
            int side2=scanParameter.nextInt();
            System.out.println("Side3:");
            int side3=scanParameter.nextInt();
            perimeter=side1+side2+side3;


        }
        else{
            System.out.println("Please enter C,R T:");
        }

        System.out.println("Perimeter is:"+ perimeter);




    }
}

