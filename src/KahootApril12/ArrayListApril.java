package KahootApril12;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListApril {
    public static void main(String[] args) {
        ArrayList<String>x=new ArrayList<> (Arrays.asList ("Java","is","super","fun"));
        x.add (new String ("hmmmmm"));
        x.add (new String ("" +1+2+3));
       // x.add (1)compiler error
        System.out.println (x);
    }

}
