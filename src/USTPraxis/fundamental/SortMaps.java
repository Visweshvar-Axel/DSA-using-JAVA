package USTPraxis.fundamental;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
// import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class SortMaps {
    public static void main(String[] args) {
        String name = "visweshvar";
        Map<Character, Integer> hasMap = new HashMap<>();
        for (char c : name.toCharArray()) {
            hasMap.put(c, hasMap.getOrDefault(c, 0) + 1);
        }
        System.out.println(hasMap);
        Map<Character, Integer> linkedMap = new LinkedHashMap<>();
        for (char c : name.toCharArray()) {
            linkedMap.put(c, linkedMap.getOrDefault(c, 0) + 1);
        }
        System.out.println(linkedMap);
        Map<Character, Integer> treeMap = new TreeMap<>();
        for (char c : name.toCharArray()) {
            treeMap.put(c, treeMap.getOrDefault(c, 0) + 1);
        }
        System.out.println(treeMap);

        String[] names = { "viswa", "viswa", "anu", "abc", "abc", "viswa" };
        Map<String, Integer> hasMapL = new HashMap<>();
        for (String s : names) {
            hasMapL.put(s, hasMapL.getOrDefault(s, 0) + 1);
        }
        System.out.println(hasMapL);
        Map<String, Integer> linkedMapL = new LinkedHashMap<>();
        for (String s : names) {
            linkedMapL.put(s, linkedMapL.getOrDefault(s, 0) + 1);
        }
        
        System.out.println(linkedMapL);
        Map<String, Integer> treeMapL = new TreeMap<>();
        for (String s : names) {
            treeMapL.put(s, treeMapL.getOrDefault(s, 0) + 1);
        }
        System.out.println(treeMapL);

        System.out.println(new ArrayList<Map.Entry<?, ?>>(treeMapL.entrySet()));

        System.out.println(treeMapL.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .map(Map.Entry::getKey)
                .collect(Collectors.toList()));

        System.out.println(treeMapL.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                // .map(Map.Entry::getKey)
                .collect(Collectors.toList()));
        for (Map.Entry<String, Integer> e : treeMapL.entrySet()) {
            System.out.println(e.getKey() + ":" + e.getValue());
        }

        for (Map.Entry<String, Integer> e : treeMapL.entrySet()) {
            System.err.println(e.getKey() + ":" + e.getValue());
        }
    }
}
