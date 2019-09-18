package Collections.ArrayList;
import java.util.ArrayList;

public class JoinArrayList {
    public static void main(String [] args)
    {
        //First Collections.ArrayList
        ArrayList<String> arraylist1=new ArrayList<String>();
        arraylist1.add("AL1: E1");
        arraylist1.add("AL1: E2");
        arraylist1.add("AL1: E3");

        //Second Collections.ArrayList
        ArrayList<String> arraylist2=new ArrayList<String>();
        arraylist2.add("AL2: E1");
        arraylist2.add("AL2: E2");
        arraylist2.add("AL2: E3");

        //New Collections.ArrayList
        ArrayList<String> al= new ArrayList<String>();
        al.addAll(arraylist1);
        al.addAll(arraylist2);

        //Displaying elements of the joined Collections.ArrayList
        for(String temp: al){
            System.out.println(temp);
        }
    }
}
