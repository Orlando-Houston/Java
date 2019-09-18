package Collections.ArrayList;

import java.util.ArrayList;

public class AddRemovedIterate {
    public static void main(String args[]) {
        /* Creating Collections.ArrayList of type "String" which means
         * we can only add "String" elements
         */
        ArrayList<String> obj = new ArrayList<String>();

        /*This is how we add elements to an Collections.ArrayList*/
        obj.add("Ajeet");
        obj.add("Harry");
        obj.add("Chaitanya");
        obj.add("Steve");
        obj.add("Anuj");

        // Displaying elements
        System.out.println("Original Collections.ArrayList:");
        for(String str:obj)
            System.out.println(str);

        /* Add element at the given index
         * obj.add(0, "Rahul") - Adding element "Rahul" at first position
         * obj.add(1, "Justin") - Adding element "Justin" at second position
         */
        obj.add(0, "Rahul");
        obj.add(1, "Justin");

        // Displaying elements
        System.out.println("Collections.ArrayList after add operation:");
        for(String str:obj)
            System.out.println(str);

        //SubjectHeadings.Remove elements from Collections.ArrayList like this
        obj.remove("Chaitanya"); //Removes "Chaitanya" from Collections.ArrayList
        obj.remove("Harry"); //Removes "Harry" from Collections.ArrayList

        // Displaying elements
        System.out.println("Collections.ArrayList after remove operation:");
        for(String str:obj)
            System.out.println(str);

        //SubjectHeadings.Remove element from the specified index
        obj.remove(1); //Removes Second element from the List

        // Displaying elements
        System.out.println("Final Collections.ArrayList:");
        for(String str:obj)
            System.out.println(str);
    }
}
