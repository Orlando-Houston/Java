package SubjectHeadings.Reverse;

import java.util.Scanner;

public class StringReverseScannReturn {
    public static String reversing (String word) {
        String result="";
        for (int i=word.length()-1;i>=0;i--){
            result+=word.charAt(i);
        }
        return result;


    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter the word");
        String word= input.nextLine();
        System.out.println(reversing("java"));

    }
}


