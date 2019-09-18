package Collections.HashMap;
import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;

public class Iterate {
    public static void main(String [] args)
    {
        HashMap<Integer, String> hmap = new HashMap<Integer, String>();
        //Adding elements to Collections.HashMap
        hmap.put(11, "AB");
        hmap.put(2, "CD");
        hmap.put(33, "EF");
        hmap.put(9, "GH");
        hmap.put(3, "IJ");

        //FOR LOOP
        System.out.println("SubjectHeadings.For Loop:");
        for (Map.Entry me : hmap.entrySet()) {
            System.out.println("Key: "+me.getKey() + " & Value: " + me.getValue());
        }

        //WHILE LOOP & ITERATOR
        System.out.println("While Loop:");
        Iterator iterator = hmap.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry me2 = (Map.Entry) iterator.next();
            System.out.println("Key: "+me2.getKey() + " & Value: " + me2.getValue());
        }
    }
}
//In this tutorial we will learn how to loop Collections.HashMap using following methods:
//
//SubjectHeadings.For loop
//While loop + Iterator
//Example:
//In the below example we are iterating the Collections.HashMap using both the methods (for loop and while loop).
// In while loop we have used the iterator.
