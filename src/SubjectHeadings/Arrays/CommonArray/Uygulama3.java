package SubjectHeadings.Arrays.CommonArray;

import java.util.ArrayList;
import java.util.Scanner;

public class Uygulama3 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String name;

        ArrayList<String> nameList=new ArrayList<>();

        nameList.add("safiye");
        nameList.add("coskun");
        nameList.add("turgay");
        nameList.add("hatice");
        nameList.add("Altun");
        nameList.add("fatma");

        System.out.println("name that is search in the list:");
        name=sc.next();

       boolean situation= nameList.contains(name);
       if (situation){
           nameList.indexOf(name);
           System.out.println("index:"+nameList.indexOf(name));
       }
       else{
           System.out.println("no name found");
       }


    }
}



