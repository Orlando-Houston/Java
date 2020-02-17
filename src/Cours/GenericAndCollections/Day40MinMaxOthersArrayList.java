package Cours.GenericAndCollections;

import java.util.ArrayList;
import java.util.Collections;
/*Create integer arraylist and add 100 random int numbers 0-1000
 Find min number
 Find max number
 Find middle number (median)
 Find largest 3 numbers
 Find smallest 3 numbers

 */

public class Day40MinMaxOthersArrayList {
    public static void main(String[] args) {

        ArrayList<Integer>arr=new ArrayList<Integer>();
        double rand;

        for (int i=0;i<20;i++){
            rand=Math.random ()*50;
            arr.add ((int) rand);
        }
        System.out.println (arr);
        Collections.sort (arr);

        System.out.println (arr);

        System.out.println (arr.get (0)); //min

        System.out.println (arr.get (arr.size ()-1));//max

        System.out.println (arr.get (arr.size ()/2));//medium

        for (int i=arr.size ()-3;i<arr.size ();i++)
        System.out.println (arr.get (i));




    }

}

