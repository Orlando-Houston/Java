package Collections.HashSet;

import java.util.HashSet;

public class Has {
    public static void main(String args[]) {
        // Collections.HashSet declaration
        HashSet<String> hset =
                new HashSet<String>();

        // Adding elements to the Collections.HashSet
        hset.add("Apple");
        hset.add("Mango");
        hset.add("Grapes");
        hset.add("Orange");
        hset.add("Fig");
        //Addition of duplicate elements
        hset.add("Apple");
        hset.add("Mango");
        //Addition of null values
        hset.add(null);
        hset.add(null);

        //Displaying Collections.HashSet elements
        System.out.println(hset);
    }
}
//This class implements the Set interface, backed by a hash table (actually a Collections.HashMap instance). It makes no guarantees
// as to the iteration order of the set; in particular, it does not guarantee that the order will remain constant
// over time. This class permits the null element. This class is not synchronized. However it can be synchronized
// explicitly like this: Set s = Collections.synchronizedSet(new Collections.HashSet(...));
//
//Points to Note about Collections.HashSet:
//
//Collections.HashSet doesn’t maintain any order, the elements would be returned in any random order.
//Collections.HashSet doesn’t allow duplicates. If you try to add a duplicate element in Collections.HashSet, the old value would be overwritten.
//Collections.HashSet allows null values however if you insert more than one nulls it would still return only one null value.
//Collections.HashSet is non-synchronized.
//The iterator returned by this class is fail-fast which means iterator would throw ConcurrentModificationException if Collections.HashSet has been modified after creation of iterator, by any means except iterator’s own remove method.
