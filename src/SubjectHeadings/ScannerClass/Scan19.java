package SubjectHeadings.ScannerClass;

import java.util.Scanner;

public class Scan19 {
    public  static void main (String[]args){
        Scanner internet=new Scanner(System.in);
        System.out.println("Subscribed?Y/N");
        String subscription=internet.next();
        if (subscription.equals('Y')){
            System.out.println("Usage?");
            int usage=internet.nextInt();
            if (usage<=100){
                System.out.println("$10");

            }
            else{
                System.out.println("Please visit subscription page");
            }
        }
    }
}

