package Collections.ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListToArray1 {
    public static void main(String[] args) {

        /* Array Declaration and initialization*/
        String array[]={"Hi", "Hello", "Howdy", "Bye"};

        /*Collections.ArrayList declaration*/
        ArrayList<String> arraylist= new ArrayList<String>();

        /*Conversion*/
        Collections.addAll(arraylist, array);

        /*Adding new elements to the converted List*/
        arraylist.add("String1");
        arraylist.add("String2");

        /*Display array list*/
        for (String str: arraylist)
        {
            System.out.println(str);
        }
    }
}
/*
Method 2: Collections.addAll method
Collections.addAll method all the array elements to the specified collection. This is how Collections.addAll method
 is being called. It does the same as SubjectHeadings.Arrays.asList method however it is much faster than it so performance wise
 this is a best way to get the array converted to Collections.ArrayList.

String array[]={new Item(1), new Item(2), new Item(3), new Item(4)};
Collections.ArrayList<T> arraylist = new Collections.ArrayList<T>();
Collections.addAll(arraylist, array);

OR

Collections.addAll(arraylist, new Item(1), new Item(2), new Item(3), new Item(4));


 */
