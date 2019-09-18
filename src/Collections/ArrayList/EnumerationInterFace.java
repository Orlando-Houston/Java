package Collections.ArrayList;
import java.util.Enumeration;
import java.util.ArrayList;
import java.util.Collections;
//How to iterate arraylist elements using Enumeration interface

public class EnumerationInterFace {
    public static void main(String[] args) {
        //create an Collections.ArrayList object
        ArrayList<String> arrayList = new ArrayList<String>();

        //Add elements to Collections.ArrayList
        arrayList.add("Safiye");
        arrayList.add("Coskun");
        arrayList.add("Turgay");
        arrayList.add("Hatice");
        arrayList.add("Altun");
        arrayList.add("Fatos");

        // Get the Enumeration object
        Enumeration<String> e = Collections.enumeration(arrayList);

        // Enumerate through the Collections.ArrayList elements
        System.out.println("Collections.ArrayList elements: ");
        while(e.hasMoreElements())
            System.out.println(e.nextElement());
    }


}
