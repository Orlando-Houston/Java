package Collections.HashMap;

import java.util.HashMap;

public class SecondHashMap {
    public static void main(String[] args) {
        HashMap<String,String> skills = new HashMap<String,String>(4);
        skills.put("java","junior");
        skills.put("SQL","medium");
        skills.put("selenium","expert");
        skills.put("cucumber","master");
        System.out.println(skills);
        for(String key : skills.keySet()){
            System.out.println(key+"\t\t\t\t"+skills.get(key));
        }
    }
}
