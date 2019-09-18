package Cours.Aug18Generation;

import java.util.ArrayList;
import java.util.Collections;

public class MinMaxOthers {
    public static void main(String[] args) {
        ArrayList<Integer>arr=new ArrayList<Integer>();
        double rand;
        for (int i=0;i<100;i++){
            rand=Math.random()*1001;
            arr.add((int)rand);

        }
        System.out.println(arr); //random//siralama
        Collections.sort(arr);
        Collections.min(arr);
        Collections.max(arr);
        System.out.println(arr);
        System.out.println(arr.get(0)); //first index
        System.out.println( arr.get(arr.size()-1));  //last index
        System.out.println(arr.get(arr.size()/2));  //middle number

        for (int i=arr.size()-3;i<arr.size();i++){
            System.out.println(arr.get(i));
        }


        System.out.println(arr.get(0)); //index

    }

}
