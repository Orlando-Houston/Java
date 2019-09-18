package Collections.ComparableAndComparator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortingArray {
    public static void main(String[] args) {
        /*
         * Integer class implements Comparable
         * OoPs.Interface so we can use the sort method
         */
        int[]arr={11,55,22,0,89};
        Arrays.sort(arr);
        System.out.println("sorted Int Array: ");
        System.out.println(Arrays.toString(arr));

        /*
         * String class implements Comparable
         * OoPs.Interface so we can use the sort method
         *
         */
        System.out.print("Sorted String Array: ");
        String[] names = {"Ayla", "Necati", "Verda"};
        Arrays.sort(names);
        System.out.println(Arrays.toString(names));

        /*
         * String class implements Comparable
         * OoPs.Interface so we can use the sort method
         */


        System.out.println("Sorted List: ");
        List fruits=new ArrayList();
        fruits.add("Orange");
        fruits.add("Apple");
        fruits.add("Pear");
        fruits.add("Watermelon");
        fruits.add("Grapes");
        Collections.sort(fruits);

        System.out.println(fruits);
    }

}/*In the above example, you have seen that how easy it is to sort the SubjectHeadings.Arrays and list of objects
that implements Comparable interface, you just need to call the Collections.sort (and SubjectHeadings.Arrays.sort).
However if you want to sort the objects of custom class then you need to implement
 the Comparable interface in our custom class.
 */

