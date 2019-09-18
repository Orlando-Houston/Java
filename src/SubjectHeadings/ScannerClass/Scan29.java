package SubjectHeadings.ScannerClass;

import java.util.Scanner;

public class Scan29 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("Enter the number");
        int number=scan.nextInt();
        int faktoriyel=1;
        while (number>=1){
            faktoriyel=faktoriyel*number;


            number--;

        }
        System.out.println("faktoriyel"+faktoriyel);

    }
}


