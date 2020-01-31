package Udemy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListArrayConversion {
    public static void main(String[] args) {
        List<String> names=new ArrayList<>();//arrayList
        names.add ("Tomy");
        names.add ("Jimy");
        names.add ("Antony");

        Object[]namesArray=names.toArray ();
        System.out.println (namesArray.length);



        String[] stringArray=names.toArray (new String[0]);//size

        String[]anotherStringArray=names.toArray (new String[names.size ()]);


        //convert array to array list
        String[]petsArray={"dog","cat","parrot"};
      //  List<String>petList= Arrays.asList (petsArray);//same thig
        List<String>petList= Arrays.asList ("dog","cat","parrot");//same thingthis return fixed size list
        System.out.println (petList.size ());


    }
}
