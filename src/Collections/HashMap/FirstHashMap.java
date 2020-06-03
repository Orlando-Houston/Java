package Collections.HashMap;

import java.util.HashMap;

public class FirstHashMap {
    public static void main(String[] args) {
        HashMap<String,Integer> first = new HashMap<>();
        System.out.println(first);
        first.put("Java",100);
        System.out.println(first);
        first.put("Selenium",99);
        System.out.println(first);
        System.out.println(first.get("Selenium"));
        System.out.println(first.size());
        //printing the keys
        for (String key:first.keySet()){
            System.out.println(key);
        }
        //printing values
        for(int values : first.values()){
            System.out.println(values);
        }
        //printing keys and values
        for(String key : first.keySet()){
            System.out.println("Key : "+key+"\t\t\tValue : "+first.get(key));
        }
    }
}
