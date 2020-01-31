package Udemy;

public class StringQuest10 {
    public static void main(String[] args) {


    StringBuilder numbers=new StringBuilder ("0123456789");
    numbers.delete (2,8);//index 3,4,5,6,7 silindi...
    numbers.append ("-").insert (2,"+");//append sona eklendi.index 2 ye + be added
        System.out.println (numbers);
}}
