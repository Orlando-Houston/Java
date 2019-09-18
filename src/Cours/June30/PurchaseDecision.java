package Cours.June30;

public class PurchaseDecision {
    public static void main(String[] args) {
        String color="red";
        float price=12.99f;
        int percentage=45;
        double score=0;
        if (color.equals("red")){
            score=price* percentage-20;

        }
         else if (color.equals("blue")){
             score=price*percentage-10;
        }
         if (score>=100){
             System.out.println("Don't buy");

         }
         else if (score>=50 &&score<100){
             System.out.println("Buy it later");

         }
         else {
             System.out.println("Buy it right now");

         }

    }
}

