package Cours.Aug18Generation;
import  java.util.ArrayList;
import java.util.Arrays;

public class ReversingHalfMethod {
    public static void reverseHalfMethod(ArrayList<Integer> arr) {//ayni liste icinde degistirdi.bos container olusmadi.
        int temp;
        for (int i=0;i<arr.size()/2;i++){
            temp=arr.get(i);
            arr.set(i,arr.get(arr.size()-1-i));
            arr.set(arr.size()-1-i,temp);
        }
        System.out.println(arr);

    }

    public static void main(String[] args) {
        ArrayList<Integer>test=new ArrayList<Integer>(Arrays.asList(1,2,3,4,5));
        reverseHalfMethod(test);

    }
}
