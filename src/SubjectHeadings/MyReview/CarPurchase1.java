package SubjectHeadings.MyReview;

import java.util.Scanner;

public class CarPurchase1 {
    public static void main(String[] args) {
        Scanner car = new Scanner(System.in);
        System.out.println("Do you want  'X' ,'Y' models or 'others'");
        String answer = car.next();

        int basePrice = 25000;
        int sound = 3000;
        int body = 4000;
        int soundBody = 4000 + 3000;
        int total1 = basePrice + sound;
        int total2 = basePrice + body;
        int total3 = basePrice + body + sound;
        int basePrice1 = 30000;
        int safety = 5000;
        int ent = 2000;
        int safetyEnt = 5000 + 2000;
        int totaly = basePrice1 + safety;
        int totaly1 = basePrice1 + ent;
        int totaly2 = basePrice1 + safety + ent;
        if (answer.equalsIgnoreCase("X")) {
            System.out.println("Your base price:" + basePrice);

            System.out.println("Do you want 'sound','body'or'both");
            String answer1 = car.next();
            if (answer1.equalsIgnoreCase("sound")) {
                System.out.println("Your price:" + total1);
            }
            else if (answer1.equalsIgnoreCase("body")) {
                System.out.println("Your price:" + total2);
            }
            else if (answer1.equalsIgnoreCase("both")) {
                System.out.println("Your price:" + total3);
            }
            else {
                System.out.println("Your price:" + basePrice);
            }

        }


           else if (answer.equalsIgnoreCase("Y")) {
                System.out.println("Your base price:" + basePrice1);
            System.out.println("Do you want 'ent','safety'or'both");
            String answer2 = car.next();
            if (answer2.equalsIgnoreCase("safety")) {
                System.out.println("Your price:" + totaly);
            } else if (answer2.equalsIgnoreCase("ent")) {
                System.out.println("Your price:" + totaly1);
            } else if (answer2.equalsIgnoreCase("both")) {
                System.out.println("Your price:" + totaly2);
            } else {
                System.out.println("Your price:" + basePrice1);
            }
    }
           else{
            System.out.println("Good Luck");
        }




        }

    }

