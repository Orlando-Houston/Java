package SubjectHeadings.ScannerClass;

import java.util.Scanner;

public class Scan2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);//kullanicidan string deger alabilmek
        System.out.println("Please enter the message:");
        String message=input.next();//String degeri burada aliyoruz
        System.out.println("Your message;"+message);
    }
}


