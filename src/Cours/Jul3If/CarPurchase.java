package Cours.Jul3If;
import java.util.Scanner;

public class CarPurchase {
    public static void main(String[] args) {
        Scanner object = new Scanner(System.in);
        System.out.println("What you would like to buy, Model X MSRP or Model Y MSRP,X/Y?");
        String customer = object.next();

        if (customer.equalsIgnoreCase("x")) {
            System.out.println("You chose X model, now please enter options");
            System.out.println("Do you want body package Y/N?");
            String carOptions = object.next();
            if (carOptions.equalsIgnoreCase("y")) {
                System.out.println("Your body package is $5000");
                System.out.println("Do you want sound package as well?");
                String soundX1 = object.next();
                if (soundX1.equalsIgnoreCase("y")) {
                    System.out.println("Sound system is $3000");

                } else if (carOptions.equalsIgnoreCase("n")) {
                    System.out.println("Do you want sound package?");
                    String soundX = object.next();
                    if (soundX.equalsIgnoreCase("Y")) {
                        System.out.println("The sound system package will be $3000");
                    }
                }
            } else if (customer.equalsIgnoreCase("n")) {
                System.out.println("You want to buy Y model for $35000");
                System.out.println("Do you want to add SAFETY package? Y/N");
                String safety = object.next();
                if (safety.equalsIgnoreCase("y")) {
                    System.out.println("safety package is $8000");
                    System.out.println("do you want to add entertainment package? ");
                    String entertain = object.next();
                    if (entertain.equalsIgnoreCase("y"))
                        System.out.println("your entertainment package is $4000");
                } else {
                    System.out.println("The safety package and Y model is 8000+35000");
                }


            }
        }
    }}