package ArraysList;
/*n the last tutorial we have shared the example of addAll(Collection c) method which is used
 for adding all the elements of Collection c at the end of list. Here we will see another variant add(int index,
  Collection c) which adds all
the elements of c at the specified index of a list.
 */
import java.util.ArrayList;

public class ArrayListAddAllCollection {
    public static void main(String[] args) {
        // ArrayList1
        ArrayList<String> al = new ArrayList<String>();
        al.add("Apple");
        al.add("Orange");
        al.add("Grapes");
        al.add("Mango");
        System.out.println("ArrayList1 before addAll:"+al);

        //ArrayList2
        ArrayList<String> al2 = new ArrayList<String>();
        al2.add("Fig");
        al2.add("Pear");
        al2.add("Banana");
        al2.add("Guava");
        System.out.println("ArrayList2 content:"+al2);

        //Adding ArrayList2 in ArrayList1 at 3rd position(index =2)
        al.addAll(2, al2);
        System.out.println("ArrayList1 after adding ArrayList2 at 3rd Pos:\n"+al);
    }
}

