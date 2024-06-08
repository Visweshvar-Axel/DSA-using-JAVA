package livesession.MAPExample;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class EntrySetExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, Integer> age = new TreeMap<>();
        System.out.println("Enter number of items");
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            String s = sc.nextLine();
            int num = sc.nextInt();
            age.put(s,num);
        }
        age.put("Viswa",21);
        age.put("Axel",22);
        System.out.println("Keyset: "+age.keySet());
        System.out.println("values: "+age.values());
        for(Map.Entry e: age.entrySet()){
            System.out.println(e.getKey()+" : "+e.getValue());
        }

    }
}
