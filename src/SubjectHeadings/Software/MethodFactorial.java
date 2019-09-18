package SubjectHeadings.Software;

import java.util.Scanner;

public class MethodFactorial {
    public static void factorial(){
        Scanner scan=new Scanner(System.in);
        System.out.println("Sayi");
        int sayi=scan.nextInt();
        int factorial=1;
        while (sayi > 0) {
            factorial*=sayi;
            sayi--;
        }
        System.out.println("Factorial"+factorial);
    }

    public static void main(String[] args) {
        factorial();
        factorial();
        factorial();
        factorial();
        factorial();
    }

}
