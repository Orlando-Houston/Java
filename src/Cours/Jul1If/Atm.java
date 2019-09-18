package Cours.Jul1If;

import java.util.Scanner;

public class Atm {
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);

        int bakiye=1000;
        int islem;

        System.out.println("1:Bakiye");
        System.out.println("2:Para yatırma");
        System.out.println("3:Para çekme");
        System.out.println("4:Log out");

        islem=scan.nextInt();
        switch(islem){
            case 1:
                System.out.print("Bakiyeniz: "+bakiye+"tl dir");

                break;
            case 2:
                System.out.println("Ne kadar yatıracaksınız");
                int miktar=scan.nextInt();

                bakiye +=miktar;
                System.out.println("Bakiyeniz:"+bakiye+"tl dir");
                break;
            case 3:
                System.out.println("Ne kadar çekeceksiniz");
                miktar=scan.nextInt();

                bakiye-=miktar;
                System.out.println("Bakiyeniz: "+bakiye+"tl dir");
                break;
            case 4:
                System.out.println("Log Out");
                break;

                default:
                    System.out.println("Geçersiz işlem");

        }

    }
}

