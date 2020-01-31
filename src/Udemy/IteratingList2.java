package Udemy;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IteratingList2 {
    public static void main(String[] args) {

        List<String>list= Arrays.asList (createArray ());

        //for loop
        long startTime=System.currentTimeMillis ();

        for (int i=0;i<list.size ();i++){
            String temp=list.get (i);
        }
        long totalTime=System.currentTimeMillis ()-startTime;
        System.out.println ("for loop totalTime="+"ms");

        //for each
        startTime=System.currentTimeMillis ();

        for (String temp:list){ }

        totalTime=System.currentTimeMillis ()-startTime;
        System.out.println ("for each loop totalTime="+totalTime+"ms");


        //iterator
        startTime=System.currentTimeMillis ();

        for (Iterator<String>iterator=list.iterator ();iterator.hasNext ();){
            String temp=iterator.next ();
        }
        totalTime=System.currentTimeMillis ()-startTime;
        System.out.println ("iterator totalTime="+totalTime+"ms");






    }
    private  static String[]createArray(){
        String[]stringArray=new String[10_000_000];

        for (int i=0;i<stringArray.length;i++){
            stringArray[i]="Array"+i;
        }
        return stringArray;
    }
}
