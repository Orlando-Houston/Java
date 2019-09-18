package Cours.Aug18Generation;

import java.util.ArrayList;
import java.util.Arrays;

public class DuplicateString {
    public static void removeDuplicates(ArrayList<String> arr) {
        ArrayList<String> emptyArray=new ArrayList<>();//empty
        for (String element:arr) {
            if (!emptyArray.contains(element)){  //filter
                emptyArray.add(element);
            }

        }
        System.out.println(emptyArray);
    }

    public static void main(String[] args) {
        ArrayList<String>myList=new ArrayList<String>(Arrays.asList("a","b","c","a","d"));
        removeDuplicates(myList);

    }
}




