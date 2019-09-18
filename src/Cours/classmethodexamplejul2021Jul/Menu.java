package Cours.classmethodexamplejul2021Jul;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Display1.displayMenu1();
        Scanner ask=new Scanner(System.in);

        System.out.print("Soup?(1-2-3)");
        int soup=ask.nextInt();



        System.out.print("Meal?(1-2-3)");
        int meal=ask.nextInt();


        System.out.print("Salad?(1-2)");
        int salad=ask.nextInt();





    }
}
