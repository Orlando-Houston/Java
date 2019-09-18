package Collections.ArrayList.ArrayListSorting;
/*Example: Sorting in Descending order
        We are using Collections.reverseOrder() method along with Collections.sort() in order to sort
        the list in decreasing order. In the below example we have used the following statement for sorting in reverse order.
        Collections.sort(arraylist, Collections.reverseOrder());

        However the reverse order sorting can also be done as following – This way the list will be sorted
         in ascending order first and then it will be reversed.
  Collections.sort(list);
        Collections.reverse(list);

 */

import java.util.ArrayList;
import java.util.Collections;


public class DescendingOrder {

    public static void main(String args[]){
        ArrayList<String> arraylist = new ArrayList<String>();
        arraylist.add("AA");
        arraylist.add("ZZ");
        arraylist.add("CC");
        arraylist.add("FF");

        /*Unsorted List: Collections.ArrayList content before sorting*/
        System.out.println("Before Sorting:");
        for(String str: arraylist){
            System.out.println(str);
        }

        /* Sorting in decreasing order*/
        Collections.sort(arraylist, Collections.reverseOrder());

        /* Sorted List in reverse order*/
        System.out.println("Collections.ArrayList in descending order:");
        for(String str: arraylist){
            System.out.println(str);
        }
    }

}
