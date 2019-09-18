package Cours.Jul3If;
import java.util.Scanner;

public class CarPurchaseNargiza {
    public static void main(String[] args) {
        Scanner object=new Scanner(System.in);
        System.out.println("Hello dear customer, which model you would like to buy X/Y? ");
        String xOry= object.next();
        double totalPrice=0;
        int bodyInt=0;
        int soundInt=0;
        int priceOfX=30000;

        if(xOry.equalsIgnoreCase("X")){


            //ask for body package
            System.out.println("Dear customer do you want to add body package, Y/N?");
            String bodyPackage=object.next();
            if(bodyPackage.equalsIgnoreCase("y")){
                 bodyInt = 5000;


            }
            else if(bodyPackage.equalsIgnoreCase("n")){
                bodyInt=0;
            }
            else{
                System.out.println("Please enter Y/N only for body package!");
            }
            System.out.println("Dear customer do you want to add sound package, Y/N?");
            String soundPackage=object.next();
            if(soundPackage.equalsIgnoreCase("y")){
                soundInt=3000;

            }
            else if(soundPackage.equalsIgnoreCase("n")){
                soundInt=0;
            }
            else {
                System.out.println("Please enter Y/N only for sound package");
            }
            totalPrice=soundInt+bodyInt+priceOfX;
            System.out.println("Your total price for model X is $" +totalPrice);






        }
        else if(xOry.equalsIgnoreCase("y")){
            System.out.println("Dear customer do you want to add entertainment package? Y/N");
            String entertainmentYes = object.next();
            int modelY=35000;
            int entertainmentPackage = 0;
            int safetyPackage = 0;
            if(entertainmentYes.equalsIgnoreCase("y") ){
                entertainmentPackage=8000;

            }
            else if(entertainmentYes.equalsIgnoreCase("n")){
                entertainmentPackage=0;
            }
            else{
                System.out.println("Please enter only Y/N for entertainment package");
            }

            System.out.println("Dear customer do you want to add safety package? Y/N");
            String safetyYes=object.next();

            if(safetyYes.equalsIgnoreCase("y")){
                safetyPackage=4000;
            }
            else if(safetyYes.equalsIgnoreCase("n")){
                safetyPackage=0;
            }
            else{
                System.out.println("Please enter only Y/N for sound package!");
            }
            totalPrice=safetyPackage+entertainmentPackage+modelY;
            System.out.println(" Your total price for model Y is $ "+totalPrice);



        }
        else {
            System.out.println("Please enter valid credentials Y/N only");
        }
    }
}
