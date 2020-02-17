package Cours.GenericAndCollections;

import java.util.ArrayList;

public class DataStructureDay40FirstArrayList {
    public static void main(String[] args) {
        ArrayList<Integer>myFirstList=new ArrayList<Integer> ();
        System.out.println (myFirstList);
        myFirstList.add (1);
        System.out.println (myFirstList);
        myFirstList.add (2);
        System.out.println (myFirstList);

        for (int i=3;i<=1000;i++){
            myFirstList.add (i);
        }
        System.out.println (myFirstList);
        System.out.println (myFirstList.get (0)); //index

        printElementOfArrayList (myFirstList);
    }
                                               //generic class  //Integer exist as a class..actually data type
    public static void printElementOfArrayList(ArrayList<Integer>arr){// instead of int[]arr
        for (int i=0;i<arr.size ();i++);
        System.out.println (arr.size ());


    }
}
