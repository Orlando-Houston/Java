package Cours.Aug19;

import java.util.ArrayList;
import java.util.Arrays;

public class ConvertStringArrayListToStringArray {
    public static String[]returnAsArray(ArrayList<String>arr){
        String[] myStrArr=new String[arr.size()];
        for (int i=0;i<arr.size();i++){
            myStrArr[i]=arr.get(i);
        }
        return myStrArr;
    }

    public static void main(String[] args) {

            ArrayList<String> myArr = new ArrayList<String>(Arrays.asList("ABC","DEF","GHI"));
            String[] returnedFromArrayList = returnAsArray(myArr);
            System.out.println(Arrays.toString(returnedFromArrayList));

            Object[] objects = myArr.toArray();

            for(Object str: objects){
                System.out.println(str);
            }


        }

    }


