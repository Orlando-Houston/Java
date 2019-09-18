package Collections.LinkedList;
import java.util.LinkedList;

public class GetToIndexOfLastOccurence {
    public static void main(String[] args) {

        // create a Collections.LinkedList
        LinkedList<String> list = new LinkedList<String>();

        // Add elements
        list.add("AA");
        list.add("BB");
        list.add("CC");
        list.add("AA");
        list.add("DD");
        list.add("AA");
        list.add("EE");

        // Display Collections.LinkedList elements
        System.out.println("Collections.LinkedList elements: "+list);

        // get the index of last occurrence of element "AA"
        /* public int lastIndexOf(Object o): Returns the index
         * of the last occurrence of the specified element in
         * this list, or -1 if this list does not contain the
         * element.
         */
        System.out.println("LastIndex of AA:"+list.lastIndexOf("AA"));

        // get the index of last occurrence of element "ZZ"
        /* Note: The element ZZ does not exist in the list so
         * the method lastIndexOf would return -1 for it.
         */
        System.out.println("LastIndex of ZZ:"+list.lastIndexOf("ZZ"));
    }
}
