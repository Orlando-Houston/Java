package Enum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

public class WordFreq {
    public static void main(String[] args) {
        String str="java is java is my java and my love";
        ArrayList<String>list=new ArrayList<String> (Arrays.asList (str.split (" ")));
        HashMap<String,Integer>hm=new HashMap<> ();
        for (String word:list){
            hm.put (word, Collections.frequency (list,word));
        }
        System.out.println (hm);
    }
}
