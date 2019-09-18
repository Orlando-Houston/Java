package ArraysList;
/*Create an int Array list

Add numbers from 1 1000

Write a method to list all items

 */

import java.util.ArrayList;

public class FirstArrayList {
    public static void main(String[] args) {
        //class    class   obje        constructor
        ArrayList<Integer> myFirstList=new ArrayList<Integer>();
        System.out.println(myFirstList);
        myFirstList.add(1);//method
        System.out.println(myFirstList);
        myFirstList.add(2);//method
        System.out.println(myFirstList);

        for (int i=3;i<=1000;i++) {   //iterate
            myFirstList.add(i);//method
        }
            System.out.println(myFirstList);
        myFirstList.get(0);
        System.out.println(myFirstList.get(0));



    }
}
