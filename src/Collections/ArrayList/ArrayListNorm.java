package Collections.ArrayList;
/*Method3: Normal way of Collections.ArrayList initialization
Syntax:

Collections.ArrayList<T> obj = new Collections.ArrayList<T>();
	   obj.add("Object o1");
	   obj.add("Object o2");
	   obj.add("Object o3");
                        ...
                        ...

 */

import java.util.ArrayList;

public class ArrayListNorm {
    public static void main(String[] args) {
        ArrayList<String>books=new ArrayList<String>();
        books.add("book1");
        books.add("book2");
        books.add("book3");
        System.out.println("books list"+books);
    }
}
