package livesession.L14_16;

import java.util.HashMap;
import java.util.Map;

public class EntrySetExample {
    public static void main(String[] args) {
        Map<Integer,String> ids = new HashMap<>();
        ids.put(1001,"Viswa");
        ids.put(1002,"Axel");
        ids.put(1003,"anu");
        System.out.println("keys: "+ids.keySet());
        System.out.println("keys: "+ids.values());
        for(Map.Entry i: ids.entrySet()){
            System.out.println(i.getKey()+" : "+e.);
        }
    }
}
