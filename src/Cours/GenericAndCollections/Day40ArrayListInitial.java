package Cours.GenericAndCollections;

import java.util.ArrayList;
import java.util.Arrays;

public class Day40ArrayListInitial {
    public static void main(String[] args) {
        ArrayList<Integer>myIntArr=new ArrayList<> (Arrays.asList (1,2,3,4));
        myIntArr.add (10);
        myIntArr.remove (0);//index
        System.out.println (myIntArr);
    }
}
