package SubjectHeadings.Reverse;

import java.util.Scanner;

public class ReverseNumberScanWhile {
    public static void main(String[] args) {
        System.out.println("please enter number");
        int gecici=0 ,sayi=0,  yeniSayi=0;
        Scanner input=new Scanner(System.in);
       sayi=input.nextInt();
      while (sayi>0){
          gecici=sayi%10;
          yeniSayi=yeniSayi*10+gecici;
          sayi=sayi/10;
      }
        System.out.println("tersi"+yeniSayi);

    }
}
