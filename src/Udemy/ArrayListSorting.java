package Udemy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListSorting {
    public static void main(String[] args) {
        List<String>numList=new ArrayList<> ();
        numList.add ("500");
        numList.add ("10");
        numList.add ("9");
        numList.add ("50");
        numList.add ("40");
        System.out.println (numList);

        Collections.sort (numList);
        System.out.println (numList);
        ///order by letter   at string



        List<Integer>numbers= Arrays.asList (5,4,8,10,11,7,3); //aslist size fix
        System.out.println (numbers);

        Collections.sort (numbers);
        System.out.println (numbers);



    }
}
