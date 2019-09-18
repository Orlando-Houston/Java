package SubjectHeadings.IfFerhat;

import java.util.Scanner;

public class IfBilgKavr5 {
    public static void main(String[] args) {
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



