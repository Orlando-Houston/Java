package SubjectHeadings.ScannerClass;

import java.util.Scanner;

public class Scan37 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int[]arr1={10,20,30,40,50};
        int[]arr2=new int[5];



        System.out.println("arr2'nin degerlerini girin");
        for (int i=0;i<5;i++){
            arr2[i]=scanner.nextInt();        //herbir elemanimizi kullanicidan aldik


        }
        System.out.println("Arr2'nin degerleri yaziliyor...");


        for (int i=0;i<arr2.length;i++){
            System.out.println("Eleman:"+arr2[i]);;
        }

    }

}


