package Collections.LinkedList;
import java.util.LinkedList;

public class PushAndPop {
    public static void main(String[] args) {

        // Create a Collections.LinkedList of Strings
        LinkedList<String> list = new LinkedList<String>();

        // Add few Elements
        list.add("Jack");
        list.add("Robert");
        list.add("Chaitanya");
        list.add("kate");

        // Display LinkList elements
        System.out.println("Collections.LinkedList contains: "+list);

        // push Element the list
        list.push("NEW ELEMENT");

        // Display after push operation
        System.out.println("Collections.LinkedList contains: "+list);
    }
}


