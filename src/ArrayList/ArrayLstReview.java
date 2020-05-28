package ArrayList;

import java.util.ArrayList;

public class ArrayLstReview {
    public static void main(String[] args) {
        ArrayList<String> myArr = new ArrayList<> ();
        System.out.println(myArr);
        String[] arr = new String[0];
        String[] arr2={"q","w","e"};
        arr=arr2;
        System.out.println(arr[0]);
        myArr.add("Java");
        myArr.add("is");
        myArr.add("Fun");
        System.out.println(myArr);
        myArr.remove("Java");
        System.out.println(myArr);
        myArr.set(0,"Java");
        System.out.println(myArr);
}}
