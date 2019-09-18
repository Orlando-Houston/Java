package Cours.Aug19;
import java.util.ArrayList;
import java.util.Arrays;

public class FirstDeviration {
    public static void  printFirstDerivation(ArrayList<Integer> arr){
        ArrayList<Integer> firstDeriv = new ArrayList<Integer>();
        for(int i=1 ; i<arr.size() ; i++){
            firstDeriv.add(Math.abs(arr.get(i-1)-arr.get(i)));
        }
        System.out.println(firstDeriv);
    }

    public static void main(String[] args) {
        ArrayList<Integer> myArr = new ArrayList<Integer>(Arrays.asList(10,50,40,53,34546,4645,654,7665));
        printFirstDerivation(myArr);

    }
}
