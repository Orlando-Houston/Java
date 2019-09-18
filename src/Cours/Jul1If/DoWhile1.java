package Cours.Jul1If;



import java.util.Scanner;

public class DoWhile1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        int number = scan.nextInt();
        int toplam=0;

        do {
            toplam+=number%10;

            number=number/10;

            System.out.println("Toplam="+toplam+"number="+ number);



        }
        while (number>0);

        System.out.println("Toplam="+toplam);

    }
}


