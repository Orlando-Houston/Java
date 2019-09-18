package SubjectHeadings.BasicAritmeticOperators;

import java.util.Scanner;

public class Print {

    public static void main(String args[]){

            Scanner input = new Scanner(System.in); //Kullanıcıdan int değer alabilmek için Scanner sınıfını kullandık
            System.out.print("Lütfen ilk sayiyi giriniz: ");
            int sayi1 = input.nextInt(); //int değer alıyoruz
            System.out.print("Lütfen ikinci sayiyi giriniz: ");
            int sayi2 = input.nextInt(); //int değer alıyoruz
            System.out.println("Toplam: "+(sayi1+sayi2));

        }
    }

