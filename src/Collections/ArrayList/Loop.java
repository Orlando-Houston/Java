package Collections.ArrayList;
/*In this post we are sharing how to iterate (loop) Collections.ArrayList in Java.
There are four ways to loop Collections.ArrayList:
SubjectHeadings.For Loop
Advanced for loop
While Loop
Iterator

 */

import java.util.ArrayList;
import java.util.Iterator;

public class Loop {
    public static void main(String[] args) {

        ArrayList<Integer> arrlist = new ArrayList<Integer>();
        arrlist.add(14);
        arrlist.add(7);
        arrlist.add(39);
        arrlist.add(40);

        /* SubjectHeadings.For Loop for iterating Collections.ArrayList */
        System.out.println("SubjectHeadings.For Loop");
        for (int counter = 0; counter < arrlist.size(); counter++) {
            System.out.println(arrlist.get(counter));
        }

        /* Advanced SubjectHeadings.For Loop*/
        System.out.println("Advanced SubjectHeadings.For Loop");
        for (Integer num : arrlist) {
            System.out.println(num);
        }

        /* While Loop for iterating Collections.ArrayList*/
        System.out.println("While Loop");
        int count = 0;
        while (arrlist.size() > count) {
            System.out.println(arrlist.get(count));
            count++;
        }

        /*Looping Array List using Iterator*/
        System.out.println("Iterator");
        Iterator iter = arrlist.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
    }

}
