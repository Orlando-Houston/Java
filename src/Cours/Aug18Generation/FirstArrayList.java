package Cours.Aug18Generation;

import java.util.ArrayList;
import java.util.Iterator;

public class FirstArrayList {
    public static void main(String[] args) {
        ArrayList<Integer>myFirstList=new ArrayList<Integer>();
        System.out.println(myFirstList);
        myFirstList.add(1);
        System.out.println(myFirstList);
        myFirstList.add(2);
        System.out.println(myFirstList);
        for ( int i=3;i<=1000;i++){
            myFirstList.add(i);//buraya kadar  sayilari veriyor
        }
        System.out.println(myFirstList);
        System.out.println(myFirstList.get(0));//get index  can call

        printElementsOfArrayList(myFirstList);//bu kisim alltaki metodu cagirmadir

        printWithIterator(myFirstList);
        }

    public static void printElementsOfArrayList(ArrayList<Integer>arr) {
        for (int i=0;i<arr.size();i++){
            System.out.println(arr.get(i));
        }
    }

    public static void printWithIterator(ArrayList<Integer>arr) {
        Iterator myIter=arr.iterator();
        while (myIter.hasNext()){
            System.out.println(myIter.next());
        }
    }
    }

