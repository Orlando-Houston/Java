package Cours.GenericAndCollections;

import java.util.ArrayList;
import java.util.Iterator;

public class DataStructureGenericDay40FirstArrayListIterator {
    public static void main(String[] args) {
        ArrayList<Integer> myFirstList=new ArrayList<Integer> ();
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
        printElementOfArrayList (myFirstList);
    }
    //generic class  //Integer exist as a class..actually data type
    public static void printElementOfArrayList(ArrayList<Integer>arr){// instead of int[]arr
        for (int i=0;i<arr.size ();i++);{
        System.out.println (arr.size ());


    }
}

    public static void printWithIterator(ArrayList<Integer>arr) {
        //instance from Iterator class
                        //arraylist object    method
        Iterator myIter=arr.iterator ();
        while (myIter.hasNext ()){
            System.out.println (myIter.next ());
        }

    }
}

