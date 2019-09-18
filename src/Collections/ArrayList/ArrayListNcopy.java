package Collections.ArrayList;
/*Method 4: Use Collections.ncopies
Collections.ncopies method can be used when we need to initialize the Collections.ArrayList with the same value for all of its elements.
 Syntax: count is number of elements and element is the item value

Collections.ArrayList<T> obj = new Collections.ArrayList<T>(Collections.nCopies(count, element));

 */

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListNcopy {

    public static void main(String args[]) {
        ArrayList<Integer> intlist = new ArrayList<Integer>(Collections.nCopies(10, 5));
        System.out.println("Collections.ArrayList items: "+intlist);
    }

}
