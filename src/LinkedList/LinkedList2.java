package LinkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedList2 {
    public static void main(String[] args) {
        /*LinkedList declaration*/
        LinkedList<String> linkList=new LinkedList<> ();
        linkList.add ("Apple");
        linkList.add ("Pear");
        linkList.add ("Watermelon");

        /*for loop*/
        System.out.println ("** For Loop**");
        for (int num=0;num<linkList.size ();num++){
            System.out.println (linkList.get (num));
        }
        System.out.println ("--------------------------------------------------");
        /*Advancrd for loop*/
        for (String fruit:linkList){
            System.out.println (fruit);
        }
        /* Using Iterator*/
        System.out.println ("**Iterator**");

        Iterator i=linkList.iterator ();
        while (i.hasNext ()){
            System.out.println (i.next ());
        }
        System.out.println ("**With While Loop**");
        int num=0;
        while (linkList.size ()>num){
            System.out.println (linkList.get (num));
            num++;
        }

    }
}
