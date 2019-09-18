package SubjectHeadings.HomeWork;

import java.util.Scanner;

public class Receipt {
    public static void main(String[] args) {
        Scanner salesReceipt=new Scanner(System.in);
        System.out.println("Enter egg price:$");
        double egg= salesReceipt.nextDouble();
        System.out.println("Enter baggel price:$");
        double baggel= salesReceipt.nextDouble();
        System.out.println("Enter milk price:$");
        double milk= salesReceipt.nextDouble();
        System.out.println("Enter Juice price:$");
        double Juice= salesReceipt.nextDouble();
        System.out.println("Enter sugar price:$");
        double sugar= salesReceipt.nextDouble();
        System.out.println("Total price:$");
        double total=egg+baggel+milk+Juice+sugar;
        System.out.println("total :"+total);

        System.out.println("Thanks SubjectHeadings.For Shopping");



    }
}

