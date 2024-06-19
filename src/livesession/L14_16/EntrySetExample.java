package livesession.L14_16;

import java.util.HashMap;
import java.util.Map;

public class EntrySetExample {
    public static void main(String[] args) {
        Map<Integer,String> ids = new HashMap<>();
        int autoIds = 1000;
        ids.put(autoIds,"Viswa");
        ids.put(autoIds,"Axel");
        ids.put(autoIds,"Anu");
        ids.put(autoIds,"Jeswin");
        ids.put(autoIds,"Janani");
        ids.put(autoIds,"Saran");
        ids.put(autoIds,"Dinesh");
        System.out.println("keys: "+ids.keySet());
        System.out.println("keys: "+ids.values());
        for(Map.Entry i: ids.entrySet()){
            System.out.println(i.getKey()+" : "+i.getValue());
        }
    }
}
