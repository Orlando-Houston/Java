package KahootApril12;

import java.util.ArrayList;
import java.util.Arrays;

public class UpperCase {
    public static void main(String[] args) {
        ArrayList<String>x=new ArrayList<> (Arrays.asList ("Java","is","super","fun"));
        x.add (new String ("hmm".toUpperCase ().substring (2,"hmmm".length ()-1)));
        System.out.println (x);
    }
}
