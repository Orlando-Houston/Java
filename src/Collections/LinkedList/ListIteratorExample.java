package Collections.LinkedList;
import java.util.LinkedList;
import java.util.ListIterator;

public class ListIteratorExample {

    public static void main(String[] args) {

            // Create a Collections.LinkedList
            LinkedList<String> linkedlist = new LinkedList<String>();

            // Add elements to Collections.LinkedList
            linkedlist.add("Delhi");
            linkedlist.add("Agra");
            linkedlist.add("Mysore");
            linkedlist.add("Chennai");
            linkedlist.add("Pune");

            // Obtaining ListIterator
            ListIterator listIt = linkedlist.listIterator();

            // Iterating the list in forward direction
            System.out.println("Forward iteration:");
            while(listIt.hasNext()){
                System.out.println(listIt.next());
            }

            // Iterating the list in backward direction
            System.out.println("\nBackward iteration:");
            while(listIt.hasPrevious()){
                System.out.println(listIt.previous());
            }
        }
}
