package Collections.LinkedList;

public class DifferensBetweenListArrayAndLinked {
    //Difference between Collections.ArrayList and Collections.LinkedList in Java
    //BY CHAITANYA SINGH | FILED UNDER: JAVA COLLECTIONS
    //
    //Collections.ArrayList and Collections.LinkedList both implements List interface and their methods and results are almost identical. However there are few differences between them which make one better over another depending on the requirement.
    //
    //Collections.ArrayList Vs Collections.LinkedList
    //1) Search: Collections.ArrayList search operation is pretty fast compared to the Collections.LinkedList search operation. get(int index) in Collections.ArrayList gives the performance of O(1) while Collections.LinkedList performance is O(n).
    //
    //Reason: Collections.ArrayList maintains index based system for its elements as it uses array data structure implicitly which makes it faster for searching an element in the list. On the other side Collections.LinkedList implements doubly linked list which requires the traversal through all the elements for searching an element.
    //
    //2) Deletion: Collections.LinkedList remove operation gives O(1) performance while Collections.ArrayList gives variable performance: O(n) in worst case (while removing first element) and O(1) in best case (While removing last element).
    //
    //
    //Conclusion: Collections.LinkedList element deletion is faster compared to Collections.ArrayList.
    //
    //Reason: Collections.LinkedList’s each element maintains two pointers (addresses) which points to the both neighbor elements
    // in the list. Hence removal only requires change in the pointer location in the two neighbor
    // nodes (elements) of the node which is going to be removed. While In Collections.ArrayList all the elements need to be
    // shifted to fill out the space created by removed element.
    //
    //3) Inserts Performance: Collections.LinkedList add method gives O(1) performance while Collections.ArrayList gives O(n) in worst case.
    // Reason is same as explained for remove.
    //
    //4) Memory Overhead: Collections.ArrayList maintains indexes and element data while Collections.LinkedList maintains element data and
    // two pointers for neighbor nodes hence the memory consumption is high in Collections.LinkedList comparatively.
    //
    //There are few similarities between these classes which are as follows:
    //
    //Both Collections.ArrayList and Collections.LinkedList are implementation of List interface.
    //They both maintain the elements insertion order which means while displaying Collections.ArrayList and Collections.LinkedList elements
    // the result set would be having the same order in which the elements got inserted into the List.
    //Both these classes are non-synchronized and can be made synchronized explicitly by using Collections.
    // synchronizedList method.
    //The iterator and listIterator returned by these classes are fail-fast (if list is structurally modified at
    // any time after the iterator is created, in any way except through the iterator’s own remove or add methods,
    // the iterator will throw a ConcurrentModificationException).
    //When to use Collections.LinkedList and when to use Collections.ArrayList?
    //1) As explained above the insert and remove operations give good performance (O(1)) in Collections.LinkedList compared to
    // Collections.ArrayList(O(n)). Hence if there is a requirement of frequent addition and deletion in application then
    // Collections.LinkedList is a best choice.
    //
    //2) Search (get method) operations are fast in Arraylist (O(1)) but not in Collections.LinkedList (O(n)) so If there are
    // less add and remove operations and more search operations requirement, Collections.ArrayList would be your best bet.
}
