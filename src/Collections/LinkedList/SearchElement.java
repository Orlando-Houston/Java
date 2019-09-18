package Collections.LinkedList;
import java.util.LinkedList;

public class SearchElement {
    public static void main(String[] args) {

        // Step1: Create a Collections.LinkedList
        LinkedList<String> linkedlist = new LinkedList<String>();

        // Step2: Add elements to Collections.LinkedList
        linkedlist.add("Tim");
        linkedlist.add("Rock");
        linkedlist.add("Hulk");
        linkedlist.add("Rock");
        linkedlist.add("James");
        linkedlist.add("Rock");

        //Searching first occurrence of element
        int firstIndex = linkedlist.indexOf("Rock");
        System.out.println("First Occurrence: " + firstIndex);

        //Searching last occurrence of element
        int lastIndex = linkedlist.lastIndexOf("Rock");
        System.out.println("Last Occurrence: " + lastIndex);
    }
}
//In this tutorial we will learn how to search elements in Collections.LinkedList. We will be using following two methods
// for searching elements.
//
//public int indexOf(Object o): Returns the index of the first occurrence of the specified element
// in this list, or -1 if this list does not contain the element.
//
//public int lastIndexOf(Object o): Returns the index of the last occurrence of the specified element
// in this list, or -1 if this list does not contain the element.
