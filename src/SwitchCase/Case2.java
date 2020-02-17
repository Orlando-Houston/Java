package SwitchCase;

import java.util.Scanner;

public class Case2 {
    public static void main(String[] args) {
        Scanner enter=new Scanner(System.in);
        int i;
        System.out.println ("Zeynep Turizm A.S Sunar");
        System.out.println ("(1) Orta avrupa turu");
        System.out.println ("(2) Amerika turu");
        System.out.println ("(3) Uzak dogu turu");

        i=enter.nextInt ();

        switch (i){
            case 1:
                System.out.println ("Ucak ile Viyana,Budapeste,Prag");
                System.out.println ("4 yildizli otellerde sok!1700$\n");
                break;
            case 2:
                System.out.println ("Ozel ucak ile New york,Boston,Chicago ");
                System.out.println ("5 yildizli otellerde sok!3700$\n");
                break;
            case 3:
                System.out.println ("with private plane bang kong,hong kong");
                System.out.println ("Tokyo,pekin");
                System.out.println ("5 yildizli otellerde sok!4000$\n");
                break;

            default:
                System.out.println ("Failure choose");


        }
    }
}
