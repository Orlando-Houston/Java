package Collections.Iteration;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

    public class ListIteratorExample {

        public static void main(String a[]){
            ListIterator<String> litr = null;
            List<String> names = new ArrayList<String>();
            names.add("Shyam");
            names.add("Rajat");
            names.add("Paul");
            names.add("Tom");
            names.add("Kate");
            //Obtaining list iterator
            litr=names.listIterator();

            System.out.println("Traversing the list in forward direction:");
            while(litr.hasNext()){
                System.out.println(litr.next());
            }
            System.out.println("\nTraversing the list in backward direction:");
            while(litr.hasPrevious()){
                System.out.println(litr.previous());
            }
        }
}
//Methods of ListIterator
//1) void add(E e): Inserts the specified element into the list (optional operation).
//2) boolean hasNext(): Returns true if this list iterator has more elements when traversing the list in the forward direction.
//3) boolean hasPrevious(): Returns true if this list iterator has more elements when traversing the list
// in the reverse direction.
//4) E next(): Returns the next element in the list and advances the cursor position.
//5) int nextIndex(): Returns the index of the element that would be returned by a subsequent call to next().
//6) E previous(): Returns the previous element in the list and moves the cursor position backwards.
//7) int previousIndex(): Returns the index of the element that would be returned by a subsequent call to previous().
//8) void remove(): Removes from the list the last element that was returned by next() or previous() (optional operation).
//9) void set(E e): Replaces the last element returned by next() or previous() with the specified element (optional operation).
