package SubjectHeadings.Arrays.CommonArray;

import java.util.ArrayList;
import java.util.Scanner;

public class Uygulama {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int number;
        boolean situation=true;

        System.out.println("nuber to search in list:");

        number= scan.nextInt();
        ArrayList<Integer>numberList=new ArrayList<>();
        numberList.add(121);
        numberList.add(32);
        numberList.add(2423);
        numberList.add(16);

        for (int i=0;i<numberList.size();i++){
            if (numberList.get(i)==number){

                System.out.println("number found.");
                System.out.println("index' i:"+i);
                situation=false;
            }
        }
        if (situation){
            System.out.println("number doesnt find");

        }
    }
}
