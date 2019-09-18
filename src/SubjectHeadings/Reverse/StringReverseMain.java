package SubjectHeadings.Reverse;

import java.util.Scanner;

public class StringReverseMain {
    public static void main(String[] args) {
        String word;
        String reverse="";
        System.out.println("please enter word");
        Scanner input=new Scanner(System.in);
        word=input.nextLine();
        for (int i=word.length()-1;i>=0;i--){
            reverse+= word.charAt(i);

        }
        System.out.println(reverse);


    }
}
