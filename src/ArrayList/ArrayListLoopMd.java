package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListLoopMd {
    public static void main(String[] args) {
        ArrayList<Integer> myList = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,78,997,99));
        myList.add(4);
        myList.add(10);
        myList.add(50);
        myList.remove(0);
        //Regular For Loop
        for(int i=0 ; i < myList.size() ;i++){
            System.out.println(myList.get(i));
        }
        //For each Loop
        for(int element:myList){
            System.out.println(element);
        }
        //While Loop
        int index=0;
        while(index<myList.size()){
            System.out.println(myList.get(index));
            index++;
        }


    }
}
