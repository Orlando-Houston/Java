package ArraysList;
/*Method remove(int index) is used for removing an element of the specified index from a list.
It removes an element and returns the same. It throws IndexOutOfBoundsException if the specified index
 is less than zero or greater than the size of the list
 (index size of ArrayList).
 */
import java.util.ArrayList;

public class RemoveArrayList {
    public static void main(String args[]) {
        //String ArrayList
        ArrayList<String> al = new ArrayList<String>();
        al.add("AB");
        al.add("CD");
        al.add("EF");
        al.add("GH");
        al.add("AB");
        al.add("YZ");
        System.out.println("ArrayList before remove:");
        for(String var: al){
            System.out.println(var);
        }
        //Removing 1st element
        al.remove(0);
        //Removing 3rd element from the remaining list
        al.remove(2);
        //Removing 4th element from the remaining list
        al.remove(2);
        System.out.println("ArrayList After remove:");
        for(String var2: al){
            System.out.println(var2);
        }
    }
}

