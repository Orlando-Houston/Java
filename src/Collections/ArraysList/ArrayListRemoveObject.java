package Collections.ArraysList;
/*The method remove(Object obj) removes the specified object from the list.
 It belongs to the java.util.ArrayList class
 */
import java.util.ArrayList;

public class ArrayListRemoveObject {
    public static void main(String args[]) {
        //String ArrayList
        ArrayList<String> al = new ArrayList<String>();
        al.add("AA");
        al.add("BB");
        al.add("CC");
        al.add("DD");
        al.add("EE");
        al.add("FF");
        System.out.println("ArrayList before remove:");
        for(String var: al){
            System.out.println(var);
        }
        //Removing element AA from the arraylist
        al.remove("AA");
        //Removing element FF from the arraylist
        al.remove("FF");
        //Removing element CC from the arraylist
        al.remove("CC");
        /*This element is not present in the list so
         * it should return false
         */
        boolean b=al.remove("GG");
        System.out.println("Element GG removed: "+b);
        System.out.println("ArrayList After remove:");
        for(String var2: al){
            System.out.println(var2);
        }
    }
}



