package Oracle;

import java.util.ArrayList;
import java.util.HashSet;

public class Syntax9Remove {
    public static void main(String[] args) {
        ArrayList aList=new ArrayList ();
      aList.add ("John");
      aList.add ("jane");
        aList.add ("James");
        aList.add ("jasmine");
        aList.add ("Jane");
        aList.add ("james");

        //1 way
        HashSet set=new HashSet (aList);

        //2 way
        HashSet hset=new HashSet ();
        for (Object name:aList){
            hset.add (name);
        }
        System.out.println (hset);
}}
