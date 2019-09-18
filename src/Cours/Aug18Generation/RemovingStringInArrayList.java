package Cours.Aug18Generation;
//import creatingclasses.SubjectHeadings.Arrays;

import java.util.ArrayList;
import java.util.Arrays;


public class RemovingStringInArrayList {
    public static void removeString(ArrayList<String> arr, String str){
        int index = arr.indexOf(str);
        arr.remove(index);

        System.out.println(arr);
    }
    public static void removeString(ArrayList<String> arr, String str1,String str2){
        int index = arr.indexOf(str1);
        arr.remove(index);
        index = arr.indexOf(str2);
        arr.remove(index);
    }

    public static void main(String[] args) {
        ArrayList<String> myList = new ArrayList<String>(Arrays.asList("abc","def"));
        removeString(myList,"abc");
    }
}
