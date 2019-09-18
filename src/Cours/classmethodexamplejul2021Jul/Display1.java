package Cours.classmethodexamplejul2021Jul;

public class Display1 {
    public static void displayMenu1(){
        System.out.printf("THE BEST RESTAURANT EVER \n");
        System.out.printf("-------------------------------------- \n");

        System.out.println("SOUPS");
        System.out.println("________________");
        System.out.printf("%3s %s  %5s","1-)","Lentil", " \t$2.99 \n");
        System.out.printf("%3s %s  %5s","2-)","Tomato","\t$3.99 \n");
        System.out.printf("%3s %s  %5s","3-)","Fish","\t\t$8.99 \n");

        System.out.println("MEALS");
        System.out.println("________________");
        System.out.printf("%4s %s","1-)","Rice \n");
        System.out.printf("%4s %s","2-)","Chicken \n");
        System.out.printf("%4s %s","3-)","Beef \n");

        System.out.println("SALADS");
        System.out.println("________________");
        System.out.printf("%3s %s  %5s","1-)","Ceasar", " \t$2.99 \n");
        System.out.printf("%3s %s  %5s","2-)","Waldorf"," \t$3.99 \n");
    }
    public static void displayReceipt(int soup,int meal,int salad){
        System.out.println();
        System.out.println("RECEIPT");
        System.out.println("---------------------");
        System.out.println("---------------------");
        double totalPrice =0;
        if(soup==1){
            System.out.println("Lentil Soup $2.99");
            totalPrice=totalPrice+2.99;
        }
        else if(soup==2){
            System.out.println("Tomato Soup $3.99");
            totalPrice = totalPrice+3.99;
        }
        else {
            System.out.println("Fish Soup $8.99");
            totalPrice = totalPrice+8.99;
        }
        if(meal==1){
            System.out.println("Rice $2.99");
            totalPrice = totalPrice+2.99;
        }
        else if (meal==2){
            System.out.println("Chicken $4.99");
            totalPrice = totalPrice+4.99;
        }
        else {
            System.out.println("Beef $8.99");
            totalPrice = totalPrice+8.99;
        }
        if(salad==1){
            System.out.println("Ceasar  $2.99");
            totalPrice = totalPrice +2.99;
        }
        else {
            System.out.println("Waldorf $3.99");
            totalPrice = totalPrice+3.99;
        }
        System.out.println("Total Price is :  $"+totalPrice);
    }
}

