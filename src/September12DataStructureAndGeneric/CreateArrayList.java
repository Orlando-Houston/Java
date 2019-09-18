package September12DataStructureAndGeneric;

import java.util.ArrayList;

public class CreateArrayList {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<String>();
        list.add("Altun");
        list.add("Ahmet");
        list.add("Afet");
        list.add("Hamide");
        list.add("Rana");
        list.add(3,"Altun");
        list.add("Ahmet");
        list.remove("Ahmet");
        //iterating ArrayList
        for(String str:list)
            System.out.println(str);
        System.out.println(list);

    }
}
