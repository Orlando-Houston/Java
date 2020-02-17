package Cours.GenericAndCollections;

import java.util.ArrayList;
import java.util.Arrays;

public class Day40ReversingHalfMethod {
    public static void reverseHalfMethod(ArrayList<Integer>arr) {
        int temporary;
        for (int i=0;i<arr.size ()/2;i++){
            temporary=arr.get (i);//start begininig  hours 3:20
            arr.set (i,arr.get (arr.size ()-1-i));
            arr.set (arr.size ()-1-i,temporary);

        }
        System.out.println (arr);
    }

    public static void main(String[] args) {
        ArrayList<Integer>test=new ArrayList<> (Arrays.asList (1,2,3,4,5));
        reverseHalfMethod (test);

    }
}
