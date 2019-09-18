package ExceptionHandling;/*
try{
//Hata oluşması beklenen kod bloğu
}
catch(hata tipi){
// Bu hatanın yönetilmesi için gerekli kod bloğu
}
finally{
//Hata oluşsada oluşmasada son olarak çalıştırılacak kod bloğu
}*/

import java.util.InputMismatchException;
import java.util.Scanner;
public class Exception5 {
    public static void main(String[] args) {
        try{
            Scanner sc=new Scanner(System.in);
            System.out.println("enter 1.number:");
            double dividend=sc.nextDouble();
            System.out.println("enter 2.numbers:");
            double divisor=sc.nextDouble();
            double result=dividend/divisor;
            System.out.println("Result="+result);
        }
        catch (InputMismatchException e) {
            System.out.println("Lütfen sadece sayı giriniz.");
        }
        finally{
            System.out.println("Process the end.");
        }

    }
    }

