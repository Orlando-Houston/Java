package OoPs.Aug3Day33OverLoading;

import java.util.Scanner;

public class ShippingCalculation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter Weight: \t");
        int weight = scanner.nextInt();
        if(weight>=1 && weight<=5){
            weight = 12;
            System.out.println("Point: " + weight);
        }
        else if(weight >=6 && weight<=12){
            weight = 29;
            System.out.println("Point: " + weight);
        }
        else {
            weight = 50;
            System.out.println("Point: " + weight);
        }

        System.out.println("Please Enter Volume: \t");
        int volume = scanner.nextInt();
        if(volume>=1 && volume<=10){
            volume = 20;
            System.out.println("Point: " + volume);
        }
        else if(volume>=11 && volume<=20){
            volume = 45;
            System.out.println("Point: " + volume);
        }
        else{
            System.out.println("Please Enter Valid Volume: ");
        }

        System.out.println("Please Enter Disctance: \t");
        int distance = scanner.nextInt();

        System.out.println("Shipping: G for Ground or U for Urgent");
        String shippingType = scanner.next();

        if(shippingType.equalsIgnoreCase("G")){

            int totalGround = ((weight*volume)/11)*distance/100;
            System.out.println("Total Price: $" + totalGround);
        }

        else if(shippingType.equalsIgnoreCase("U")){
            int totalUrgent = ((weight*volume)/5)*distance/100;
            System.out.println("Total Price: $" + totalUrgent);

        }
    }
}



