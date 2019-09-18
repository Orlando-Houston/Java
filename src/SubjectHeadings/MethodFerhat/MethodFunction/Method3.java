package SubjectHeadings.MethodFerhat.MethodFunction;

import java.util.Scanner;

public class Method3 {
    public static void faktoriyel() {
        Scanner scan=new Scanner(System.in);
        System.out.println("Sayi:");

        int sayi=scan.nextInt();
        int faktoriyel=1;
        while (sayi>0){
            faktoriyel*=sayi;
            sayi--;
        }
        System.out.println("Faktoriyel:"+faktoriyel);

    }

    public static void main(String[] args) {

        faktoriyel();
        faktoriyel();
        faktoriyel();
        faktoriyel();
        faktoriyel();
        faktoriyel();
    }

}
