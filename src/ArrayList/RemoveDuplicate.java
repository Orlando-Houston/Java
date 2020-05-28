package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveDuplicate {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>(Arrays.asList("Java","Python","Java","C#","Python","Java"));
        ArrayList<String> newList = new ArrayList<>();
        for(String prg:arr){
            if(!newList.contains(prg)){
                newList.add(prg);
            }
        }
        System.out.println(newList);
    }
}
