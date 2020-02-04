package Cours.GenericAndCollections;

import java.util.ArrayList;

public class MultiplicationOfArrayList {
    public static void multiplyArrayLists(ArrayList<Integer>arr1,ArrayList<Integer>arr2) {
        for (int i=0;i<arr1.size ();i++){
            System.out.println (arr1.get (i)*arr2.get (i));
        }

    }
}
//