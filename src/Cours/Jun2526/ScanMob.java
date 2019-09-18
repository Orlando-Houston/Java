package Cours.Jun2526;

import java.util.Scanner;

public class ScanMob {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);//kullanicidan string deger alabilmek
        System.out.println("Please enter the message:");
        String message=input.next();//String degeri burada aliyoruz
        System.out.println("Your message;"+message);
    }
}
