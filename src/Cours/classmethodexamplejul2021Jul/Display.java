package Cours.classmethodexamplejul2021Jul;

public class Display {
    public static void DisplayMenu() {
        System.out.printf("The best restaurant ever");
        System.out.printf("-----------------------------------\n");

        System.out.println("Soups");
        System.out.println("             ");
        System.out.printf("%3s  %s  %5s,  ","1-)","lentil","\t$2.99\n");
        System.out.printf("%3s  %s  %5s,  ","2-)","Tomato","\t$3.99\n");
        System.out.printf("%3s  %s, %5s,  ","3-)","Fish"  ,"\t%8.99\n");



        System.out.println("Meals");
        System.out.println("            ");
        System.out.printf("%4s","1-)","Rice\n");
        System.out.printf("%4s","2-)","Chicken\n");
        System.out.printf("%4s","3-)","Beef\n");


        System.out.println("Meals");
        System.out.println("            ");
        System.out.printf("%4s","1-)","Cesar\n");
        System.out.printf("%4s","1-)","Waldorf\n");

    }

    public static void diplayReceipt(int soup,int meal,int salad) {
        if(soup==1){
            System.out.println("Lentil Soup $2.99");
        }
        else if(soup==2){
            System.out.println("Tomato Soup $3.99");
        }
        else {
            System.out.println("Fish Soup $8.99");
        }
        if(meal==1){
            System.out.println("Rice $2.99");
        }
        else if (meal==2){
            System.out.println("Chicken $4.99");
        }
        else {
            System.out.println("Beef $8.99");
        }
        if(salad==1){
            System.out.println("Ceasar  $2.99");
        }
        else {
            System.out.println("Waldorf $3.99");
        }
    }
}