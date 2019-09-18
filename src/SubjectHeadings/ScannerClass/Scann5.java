package SubjectHeadings.ScannerClass;

import java.util.Scanner;

public class Scann5 {
    public static void main(String[] args) {


       /*  double amountGold=2.45;
        double perOuncePrice=245.8769;
        double totalPrice=amountGold*perOuncePrice;
        System.out.printf("Total amount is $% 3f",totalPrice);


        float amountSilver1 = 499.99f;
        float perOuncePrice2 = 111.11f;
        float totalPrice1 = amountSilver1 * perOuncePrice2;
        System.out.println(totalPrice1);
 }

        */
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter amount of the silver:" );
        float amount=scanner.nextInt();
        System.out.println("Enter of price per ounce:");
        float price=scanner.nextInt();
        float total=amount*price;
        System.out.println(total);
    }
}

