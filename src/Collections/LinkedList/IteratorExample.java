package Collections.LinkedList;
import java.util.LinkedList;
import java.util.Iterator;

public class IteratorExample {


        public static void main(String[] args) {

            // Create a Collections.LinkedList
            LinkedList<String> linkedlist = new LinkedList<String>();

            // Add elements to Collections.LinkedList
            linkedlist.add("Delhi");
            linkedlist.add("Agra");
            linkedlist.add("Mysore");
            linkedlist.add("Chennai");
            linkedlist.add("Pune");

            // Obtaining Iterator
            Iterator it = linkedlist.iterator();

            // Iterating the list in forward direction
            System.out.println("Collections.LinkedList elements:");
            while(it.hasNext()){
                System.out.println(it.next());
            }
        }
    }
//The steps we followed in the below program are:
//
//1) Create a Collections.LinkedList
//2) Add element to it using add(Element E) method
//3) Obtain the iterator by calling iterator() method
//4) Traverse the list using hasNext() and next() method of Iterator class.
