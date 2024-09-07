package USTPraxis.OWN_PREP;

import java.util.*;

public class MergeSortedArray {
    public static List< Integer > sortedArray(int []a, int []b) {
        List<Integer> res = new ArrayList<>();
        int s1 = a.length;
        int s2 = b.length;
        int i = 0, z = 0;
        while(i<s1 && z<s2){
            if(a[i] <= b[z]){
                if(res.size() == 0 || res.get(res.size()-1) != a[i]){
                    res.add(a[i]);
                }
                i++;
            } else {
                if(res.size() == 0 || res.get(res.size()-1) != b[z]){
                    res.add(b[z]);
                }
                z++;
            }
        }
        while(i < s1){
            if(res.size() == 0 || res.get(res.size()-1) != a[i]){
                res.add(a[i]);
            }
            i++;
        }
        while(z<s2){
            if(res.size() == 0 || res.get(res.size()-1) != b[z]){
                res.add(b[z]);
            }
            z++;
        }
        return res;


//        Set<Integer> s = new TreeSet<>();
//        for(int i: b) s.add(i);
//        for(int i: a) s.add(i);
//        List<Integer> res = new ArrayList<>(s);
//        // System.out.println(s);
//        // System.out.println(res);
//        return res;


        // List<Integer> res = new ArrayList<>();
        // int as = a.length;
        // int bs = b.length;
        // int i = 0, j = 0;
        // while(i < as && j < bs){
        //     if(a[i] == b[j]){
        //         res.add(a[i]);
        //         i++;
        //         j++;
        //     }
        //     else if(a[i] < b[j]){
        //         res.add(a[i]);
        //         i++;
        //     } else {
        //         res.add(b[j]);
        //         j++;
        //     }
        // }
        // while(i < as){
        //     if(a[i-1] != a[i]) 
        //         res.add(a[i]);
        //     i++;
        // }
        // while(j < bs-1){
        //     if(b[j] != b[j+1])
        //         res.add(b[j]);
        //     j++;
        // }
        // return res;
    }
}