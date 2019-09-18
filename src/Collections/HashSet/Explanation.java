package Collections.HashSet;

public class Explanation {
    /*
    Collections.HashSet vs Collections.HashMap

    Differences:

    HASHSET	HASHMAP
    Collections.HashSet class implements the Set interface	Collections.HashMap class implements the Map interface
    In Collections.HashSet we store objects(elements or values) e.g. If we have a Collections.HashSet of string elements then it could depict
    a set of Collections.HashSet elements: {“Hello”, “Hi”, “Bye”, “Run”}	Collections.HashMap is used for storing key & value pairs. In short
    it maintains the mapping of key & value (The Collections.HashMap class is roughly equivalent to Hashtable, except that it is
            unsynchronized and permits nulls.) This is how you could represent Collections.HashMap elements if it has integer
    key and value of String type: e.g. {1->”Hello”, 2->”Hi”, 3->”Bye”, 4->”Run”}
    Collections.HashSet does not allow duplicate elements that means you can not store duplicate values in Collections.HashSet.	Collections.HashMap
    does not allow duplicate keys however it allows to have duplicate values.
    Collections.HashSet permits to have a single null value.	Collections.HashMap permits single null key and any number of null values.
            Similarities:
            1) Both Collections.HashMap and Collections.HashSet are not synchronized which means they are not suitable for thread-safe
    operations unitl unless synchronized explicitly. This is how you can synchronize them explicitly:
    Collections.HashSet:

    Set s = Collections.synchronizedSet(new Collections.HashSet(...));

     */
}
