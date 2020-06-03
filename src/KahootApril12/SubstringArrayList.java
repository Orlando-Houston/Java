package KahootApril12;

import java.util.ArrayList;
import java.util.Arrays;

public class SubstringArrayList {
    public static void main(String[] args) {
        ArrayList<String>x=new ArrayList<> (Arrays.asList ("Java","is","super","fun"));
        int i=0;
        for (String s:x){
            x.set (i,s.substring (1));
            i++;

            }
        System.out.println (x);
        }
    }

