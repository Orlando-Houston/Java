package Cours.Jun2526;

import java.util.Scanner;

public class ScanMob1 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);//Kullanicidan deger almak icin,

        System.out.print("Please enter to firs number");
        int number1=input.nextInt();//int deger aliyoruz
        System.out.println("Please enter to second number");
        int number2=input.nextInt();//int deger aliyoruz

        System.out.println("Toplam:"+(number1+number2));

    }
}
