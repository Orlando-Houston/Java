package Cours.Aug20;
import java.util.ArrayList;
import java.util.Arrays;

public class SameDifference {
    public static void findSameDifferences(ArrayList<Integer> arr){
        ArrayList<Integer> differences = new ArrayList<Integer>();
        for(int i=0 ; i<arr.size() ; i++){
            for(int j=i ; j<arr.size() ; j++){
                if(i!=j) {
                    differences.add(Math.abs(arr.get(i) - arr.get(j)));
                }
            }
        }
        System.out.println(differences);
    }

    public static void main(String[] args) {
        ArrayList<Integer> myArr = new ArrayList<Integer>(Arrays.asList(2,4,6));
        findSameDifferences(myArr);
    }
}
