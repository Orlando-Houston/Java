package Collections.HashMap;

import java.util.HashMap;

public class KayCheck {
    public static void main(String[] args) {
        HashMap<String,String> hm = new HashMap<> ();
        hm .put("a","A");
        hm.put("b","B");
        hm.put("c","C");
        System.out.println(isHasKey(hm,"A"));
    }
    public static boolean isHasKey(HashMap<String,String> hMap, String keyToCheck){
        boolean result=false;
        for(String key : hMap.keySet()){
            if(key.equals(keyToCheck)){
                result=true;
                break;
            }
        }
        return result;
    }
}
