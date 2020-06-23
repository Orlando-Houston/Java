package Enum;

import java.util.Iterator;
import java.util.TreeMap;

public class PhoneBook {
    public static void main(String[] args) {
        TreeMap<String,String>phoneBook=new TreeMap<> ();
        phoneBook.put ("B","01-23-456");
        phoneBook.put ("A","02-33-256");
        phoneBook.put ("C","03-34-267");
        System.out.println (phoneBook);
        Iterator<String>iter=phoneBook.keySet ().iterator ();
        String key;
        while (iter.hasNext ()){
            key=iter.next ();
            System.out.println (key+"\t=\t\t"+phoneBook.get (key));
        }
    }
}
