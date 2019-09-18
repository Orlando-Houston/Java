package Cours.Aug19;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CopmareArrayList {
    public static void main(String[] args)
    {
        ArrayList<String> listOne = new ArrayList<String>(Arrays.asList("a", "b", "c", "d", "f"));

        ArrayList<String> listTwo = new ArrayList<String>(Arrays.asList("a", "b", "c", "d", "e"));

        Collections.sort(listOne);
        Collections.sort(listTwo);

        //Compare unequal lists example

        boolean isEqual = listOne.equals(listTwo);      //false
        System.out.println(isEqual);

        //Compare equals lists example

        ArrayList<String> listThree = new ArrayList<>(Arrays.asList("a", "b", "c", "d", "f"));

        isEqual = listOne.equals(listThree);      //true
        System.out.println(isEqual);
    }
}

/*ava program to test if two given lists are equal. To test equality –

Sort both lists.
Compare both lists using equals() method.
List.equals() method return true if both elements are of same size and both contains same set of elements in exactly same order.

 */
