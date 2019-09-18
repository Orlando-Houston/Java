package Collections.ArrayList;


import java.util.ArrayList;
import java.util.Arrays;

public class ArrayToArrayList {
    public static void main(String[] args) {

        /* Array Declaration and initialization*/
        String citynames[]={"Agra", "Mysore", "Chandigarh", "Bhopal"};

        /*Array to Collections.ArrayList conversion*/
        ArrayList<String> citylist= new ArrayList<String>(Arrays.asList(citynames));

        /*Adding new elements to the converted List*/
        citylist.add("New City2");
        citylist.add("New City3");

        /*Final Collections.ArrayList content display using for*/
        for (String str: citylist)
        {
            System.out.println(str);
        }
    }
}
/*In the last tutorial we have shared two methods of converting an Collections.ArrayList to Array with example.
 Here we are sharing three different ways to convert an Array to Collections.ArrayList.
  Basically we are converting an String Array to Collections.ArrayList of String type.
String array[] to Collections.ArrayList<String>

Method 1: Conversion using SubjectHeadings.Arrays.asList()
Syntax:

Collections.ArrayList<T> arraylist= new Collections.ArrayList<T>(SubjectHeadings.Arrays.asList(arrayname));

 */
