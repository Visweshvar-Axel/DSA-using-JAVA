package livesession.L14_16;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class EntrySetExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<Integer,String> ids = new HashMap<>();
        int autoIds = 1000;
        ids.put(autoIds++,"Viswa");
        ids.put(autoIds++,"Axel");
        ids.put(autoIds++,"Anu");
        ids.put(autoIds++,"Saran");
        ids.put(autoIds++,"Jeswin");
        ids.put(autoIds++,"Janani");
        ids.put(autoIds++,"Dinesh");
        System.out.println("how many new employees:");
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            String name = sc.nextLine();
            ids.put(autoIds++, name);
        }
        System.out.println("keys: "+ids.keySet());
        System.out.println("keys: "+ids.values());
        for(Map.Entry i: ids.entrySet()){
            System.out.println(i.getKey()+" : "+i.getValue());
        }
        sc.close();
    }
}
