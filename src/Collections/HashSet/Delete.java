package Collections.HashSet;
import java.util.HashSet;

public class Delete {
    public static void main(String[] args) {
        // Create a Collections.HashSet
        HashSet<String> hset = new HashSet<String>();

        //add elements to Collections.HashSet
        hset.add("Element1");
        hset.add("Element2");
        hset.add("Element3");
        hset.add("Element4");
        hset.add("Element5");

        // Display Collections.HashSet elements
        System.out.println("Before: Collections.HashSet contains: "+ hset);

        /* public void clear(): It removes all the elements
         * from Collections.HashSet. The set becomes empty after this
         * method gets called.
         */
        hset.clear();

        // Display Collections.HashSet content again
        System.out.println("After: Collections.HashSet contains: "+ hset);
    }
}
