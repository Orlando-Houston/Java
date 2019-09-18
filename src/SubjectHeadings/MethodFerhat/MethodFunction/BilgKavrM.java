package SubjectHeadings.MethodFerhat.MethodFunction;

import java.util.Scanner;

public class BilgKavrM {
    public static void main(String[] args) {

        for (int i=1;i<5;i++){
            Grade();
            System.out.println();
        }
    }


    static void Grade(){

        System.out.println("Lutfen notunuzu giriniz");
        Scanner s=new Scanner(System.in);
        int i=s.nextInt();
        if (i>=90){
            System.out.println("Grade:AA");
        }
        else if (i>=80){
            System.out.println("Grade:BB");
        }
        else if (i>=70){
            System.out.println("Grade:CC");
        }
        else{
            System.out.println("Grade:F");
        }
    }
}

