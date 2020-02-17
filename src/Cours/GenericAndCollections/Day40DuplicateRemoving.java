package Cours.GenericAndCollections;

import java.util.ArrayList;
import java.util.Arrays;

public class Day40DuplicateRemoving {
    public static void removeDuplicates(ArrayList<Integer> arr) {

        ArrayList<Integer>newArr=new ArrayList<> ();
        for (int i=0;i<arr.size ();i++){
            if (!newArr.contains (arr.get (i))){
                newArr.add (arr.get (i));
            }
        }
        System.out.println (newArr);
        }



    public static void main(String[] args) {
        ArrayList<Integer>myList=new ArrayList<> (Arrays.asList (1,2,3,3,4,2,1,5,3,6));
        removeDuplicates (myList);

    }
}
