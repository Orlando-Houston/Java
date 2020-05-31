package LinkedList;

import java.util.LinkedList;

public class OfferFirst {
    public static void main(String[] args) {
        LinkedList<String>list=new LinkedList<> ();
        //add elements
        list.add ("AA");
        list.add ("BB");
        list.add ("CC");
        list.add ("DD");

        //Display element
        System.out.println ("linkedlist elements:"+list);

        //adding element to front of linkedlist
        /*punlic boolean offersfirst(E e) :inser the
        * specified element at thr front of this list*/
        list.offerFirst ("New element");
        //Displaying list after ADDING ELEMENT
        System.out.println (list);
    }
}
