package SubjectHeadings.StringClass;

import java.util.Scanner;

public class StringReversing {
    public static String reversing (String word) {
        String result="";
        for (int i=word.length()-1;i>=0;i--){
            result+=word.charAt(i);
        }
        return result;


    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the word");
        String word= sc.nextLine();
        System.out.println(reversing(word));

    }
}
