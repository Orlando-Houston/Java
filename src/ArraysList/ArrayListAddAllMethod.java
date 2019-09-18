package ArraysList;
/*In this tutorial we will see the usage of addAll() method of java.util.ArrayList class.
 This method is used for adding all the elements of a list to the another list.
 */
import java.util.ArrayList;
public class ArrayListAddAllMethod {
    public static void main(String[] args) {
        // ArrayList1 of String type
        ArrayList<String> al = new ArrayList<String>();
        al.add("Hi");
        al.add("hello");
        al.add("String");
        al.add("Test");
        System.out.println("ArrayList1 before addAll:"+al);

        //ArrayList2 of String Type
        ArrayList<String> al2 = new ArrayList<String>();
        al2.add("Text1");
        al2.add("Text2");
        al2.add("Text3");
        al2.add("Text4");

        //Adding ArrayList2 into ArrayList1
        al.addAll(al2);
        System.out.println("ArrayList1 after addAll:"+al);
    }
}

