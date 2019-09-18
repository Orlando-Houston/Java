package SubjectHeadings.Reverse;

import Cours.Jul16MethoReturn.BackWard;
import Cours.Jul16MethoReturn.StringExcersises;

import java.util.Scanner;

public class ReversedScan {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Pleas enter the string");
        String inputString=scanner.next();
        StringExcersises.writeTopToBottom(inputString);
        BackWard.backWard("abc");//inputStringi yazma.ototmatik geliyor
        System.out.println("Enter String to reserve");
        /*
     String input="abcd";
             String start="";
     for (int i=input.length()-1;i>=0;i--){
         start=start+input.charAt(i);
         System.out.println(start);

         */

    }

}



