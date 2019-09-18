package SubjectHeadings.ScannerClass;

import java.util.Scanner;

public class Scan10 {
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Your grade Enter:");
        int grade =scan.nextInt();




        if(grade>70){
            System.out.println("Dersten gectiniz....");

        }
        else{
            System.out.println("Dersten kaldiniz");

        }

    }
}
