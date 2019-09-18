package Collections.ArrayList;
//By using  size() method of Collections.ArrayList class we can easily determine the size of the Collections.ArrayList. This method returns
// the number of elements of Collections.ArrayList.
//
//public int size()

import java.util.ArrayList;

public class FindLegth {
    public static void main(String [] args) {
        ArrayList<Integer> al=new ArrayList<Integer>();
        System.out.println("Initial size: "+al.size());
        al.add(1);
        al.add(13);
        al.add(45);
        al.add(44);
        al.add(99);
        System.out.println("Size after few additions: "+al.size());
        al.remove(1);
        al.remove(2);
        System.out.println("Size after remove operations: "+al.size());
        System.out.println("Final Collections.ArrayList: ");
        for(int num: al){
            System.out.println(num);
        }

}}
