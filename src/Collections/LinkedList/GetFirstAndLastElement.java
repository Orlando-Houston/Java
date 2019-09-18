package Collections.LinkedList;
import java.util.LinkedList;

public class GetFirstAndLastElement {
    public static void main(String[] args) {

        // Create a Collections.LinkedList
        LinkedList<String> linkedlist = new LinkedList<String>();

        // Add elements to Collections.LinkedList
        linkedlist.add("Item1");
        linkedlist.add("Item2");
        linkedlist.add("Item3");
        linkedlist.add("Item4");
        linkedlist.add("Item5");
        linkedlist.add("Item6");

        // Getting First element of the List
        Object firstElement = linkedlist.getFirst();
        System.out.println("First Element is: "+firstElement);

        // Getting Last element of the List
        Object lastElement = linkedlist.getLast();
        System.out.println("Last Element is: "+lastElement);
    }
}

