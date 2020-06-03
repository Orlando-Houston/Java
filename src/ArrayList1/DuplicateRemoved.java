package ArrayList1;

import java.util.ArrayList;
import java.util.Arrays;

public class DuplicateRemoved {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1,2,3,4,1,2,3,2,3,5));
        ArrayList<Integer> newList = new ArrayList<>();
        for(int number:arr){
            if(!newList.contains(number)){
                newList.add(number);
            }
        }
        System.out.println(newList);
    }
}
