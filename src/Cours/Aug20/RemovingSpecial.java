package Cours.Aug20;

import java.util.ArrayList;
import java.util.Arrays;

public class RemovingSpecial {
    public static boolean checkLetters(String str){
        boolean check=false;
        for (int i=0;i<str.length();i++){
            if (str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'){
                check=true;
            }
        }
        return check;
    }

    public static void printWithoutAEI(ArrayList<String>arr) {
        for (String str:arr){
            if (!checkLetters(str)){
                System.out.println(str);
            }
        }

    }

    public static void main(String[] args) {
        ArrayList<String>myArr=new ArrayList<String>(Arrays.asList("abc","def","dfg","gkhyonlm","cat"));//constructor
        printWithoutAEI(myArr);
    }


}
