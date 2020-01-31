package Udemy;

import java.util.ArrayList;
import java.util.List;

public class UsingArrayListMethods1 {
    public static void main(String[] args) {
      //  List list=new ArrayList (); the same belove
        List<Object>list=new ArrayList<> ();
        list.add ("dog");
        list.add (5);
        System.out.println (list);//automaticlly call String
       // System.out.println (list.toString ());

        List<String>pets=new ArrayList<> ();
        pets.add ("dog");
        System.out.println (pets);

        pets.add (0,"cat");
        System.out.println (pets);

        pets.add (1,"parrot");
        System.out.println (pets);

        pets.add (0,"husky");
        System.out.println (pets);

        pets.add (1,"bird");
        System.out.println (pets);

        //remove
        pets.remove ("parrot");
        System.out.println (pets);


        pets.remove (2);
        System.out.println (pets);

       // pets[0]="newBird"; array
        pets.set (0,"newBird");  //what is different between add.and set method
        System.out.println (pets);

      //  pets.set (6,"crow"); index out of bounds

      //  System.out.println (pets);

    }


}
