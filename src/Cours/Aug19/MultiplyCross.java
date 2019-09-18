package Cours.Aug19;
import java.util.ArrayList;
import java.util.Arrays;

public class MultiplyCross {
    public static void multiplyArrayLists(ArrayList<Integer> arr1, ArrayList<Integer> arr2){
        for(int i=0 ; i<arr1.size() ; i++){
            System.out.println(arr1.get(i)*arr2.get(i));
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr1 = new ArrayList<Integer>(Arrays.asList(1,2,3));
        ArrayList<Integer> arr2 = new ArrayList<Integer>(Arrays.asList(4,5,6));
        multiplyArrayLists(arr1,arr2);
    }
}
