package Collections.LinkedList;
import java.util.LinkedList;

public class AddFront {
    public static void main(String[] args) {

        // create a Collections.LinkedList
        LinkedList<String> list = new LinkedList<String>();

        // Add elements
        list.add("AA");
        list.add("BB");
        list.add("CC");
        list.add("DD");

        // Display List element
        System.out.println("Collections.LinkedList Elements:"+list);

        // Adding element to front of Collections.LinkedList
        /* public boolean offerFirst(E e): Inserts the
         * specified element at the front of this list.
         */
        list.offerFirst("NEW Element");

        // Displaying List after adding element
        System.out.println("Collections.LinkedList After Addition:"+list);
    }
}
