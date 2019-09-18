package Collections.ArrayList;
/*Method 2: Anonymous inner class method to initialize Collections.ArrayList
Syntax:

Collections.ArrayList<T> obj = new Collections.ArrayList<T>(){{
		   add(Object o1);
		   add(Object o2);
		   add(Object o3);
                   ...
                   ...
		   }};

 */

import java.util.ArrayList;

public class InitializeArrayList {
    public static void main(String[] args) {
        ArrayList<String>cities=new ArrayList<String>() {{
            add("New York");
            add("Houston");
            add("Orlando");
        }};
        System.out.println("Cities"+cities);







    }
}
