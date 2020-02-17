package SwitchCase;

import java.util.Scanner;

public class Days {
    public static void main(String[] args) {

        int day=2;
        switch (day){
            case 1:
                System.out.println ("today:Monday");
                break;
            case 2:
                System.out.println ("today:Tuesday");
                break;
            case 3:
                System.out.println ("today:Wednesday");
                break;
            case 4:
                System.out.println ("today:Tursday");
                break;
            case 5:
                System.out.println ("today:Friday");
                break;
            case 6:
                System.out.println ("today:Saturday");
                break;
            case 7:
                System.out.println ("today:Sunday");
                break;
            default:
                System.out.println ("Error");
                break;

        }
    }
}
