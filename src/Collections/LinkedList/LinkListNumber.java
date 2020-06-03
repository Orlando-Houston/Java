package Collections.LinkedList;

import java.util.Arrays;
import java.util.LinkedList;

public class LinkListNumber {
    public static void main(String[] args) {
        LinkedList<String> myList = new LinkedList<>(Arrays.asList("Banana 6","Apple 8","Plum 4"));
        findDigits(myList);
        findDigits(myList,true);
    }
    public static void findDigits(LinkedList<String> arr){
        int total=0;
        int value;
        String x="";
        for(String word : arr){
            for(int i=0 ; i<word.length() ; i++){
                if(Character.isDigit(word.charAt(i))){
                    x+=word.charAt(i);
                    value=Integer.parseInt(x);
                    total+=value;
                    x="";
                }
            }
        }
        System.out.println(total);

    }
    public static void findDigits(LinkedList<String> arr, boolean x){
        int total=0;
        int value;
        for(String word : arr){ //fetch the words
            for(int i=0 ; i<word.length() ; i++){ //to fetch chars
                if(Character.isDigit(word.charAt(i))){
                    value=word.charAt(i)-48;
                    total+=value;
                }
            }
        }
        System.out.println(total);

    }
}
