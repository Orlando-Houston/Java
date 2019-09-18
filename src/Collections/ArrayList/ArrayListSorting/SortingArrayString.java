package Collections.ArrayList.ArrayListSorting;

import java.util.ArrayList;
import java.util.Collections;

public class SortingArrayString {
    public static void main(String args[]){
        ArrayList<String> listofcountries = new ArrayList<String>();
        listofcountries.add("Turkey");
        listofcountries.add("U.S.A");
        listofcountries.add("Azerbeycan");
        listofcountries.add("Denmark");

        /*Unsorted List*/
        System.out.println("Before Sorting:");
        for(String counter: listofcountries){
            System.out.println(counter);
        }

        /* Sort statement*/
        Collections.sort(listofcountries);

        /* Sorted List*/
        System.out.println("After Sorting:");
        for(String counter: listofcountries){
            System.out.println(counter);
        }
    }
}
