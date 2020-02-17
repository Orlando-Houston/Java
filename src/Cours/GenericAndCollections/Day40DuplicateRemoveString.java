package Cours.GenericAndCollections;

import java.util.ArrayList;
import java.util.Arrays;

public class Day40DuplicateRemoveString {
    public static void main(String[] args) {
        ArrayList<String>city=new ArrayList<String> (Arrays.asList ("houston","Orlando","Orlando","New york"));
   removeDuplicate (city);
    }


                                       //parameter
    public static void removeDuplicate(ArrayList<String>arr) {
        ArrayList<String>emptyList=new ArrayList<> ();
       // for (int i=0;i<arr.size ();i++){
          //  if (!emptyList.contains (arr.get (i))){
             //   emptyList.add (arr.get (i));
        for (String element:arr){
            if (!emptyList.contains (element)){
                emptyList.add (element);
            }
        }
           // System.out.println (emptyList);


    }

}
