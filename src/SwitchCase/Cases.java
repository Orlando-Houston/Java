package SwitchCase;

import java.util.Scanner;

public class Cases {
    public static void main(String[] args) {
        Scanner enter=new Scanner (System.in);
        int select;
        System.out.println ("you can select(1,2,3)");
        select=enter.nextInt ();

        switch (select){
            case 1:
                System.out.println ("A sinifi dergileri listesi");
                break;
            case 2:
                System.out.println ("B sinifi dergi listesi");
                break;
            case 3:
                System.out.println ("C sinifi dergi listesi");
                break;
            default:
                System.out.println ("Wrong select!1,2 or 3'e press");
                break;
        }
    }

}
/*It's also important to note that switch statement in Java only works with:

Primitive data types: byte, short, char and int
Enumerated types (Java enums)
String class
a few classes that wrap primitive types: Character, Byte, Short, and Integer.

 */
