package Collections.ArrayList;
//In the above examples, we have displayed the Collections.ArrayList elements just by referring the Collections.ArrayList instance,
// which is definitely not the right way to displays the elements. The correct way of displaying the elements is
// by using an advanced for loop like this.


import java.util.ArrayList;

public class Iterating {
    public static void main(String args[]){
        ArrayList<String> alist=new ArrayList<String>();
        alist.add("Gregor Clegane");
        alist.add("Khal Drogo");
        alist.add("Cersei Lannister");
        alist.add("Sandor Clegane");
        alist.add("Tyrion Lannister");

        //iterating Collections.ArrayList
        for(String str:alist)
            System.out.println(str);
    }
}
