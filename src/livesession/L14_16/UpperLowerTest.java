package livesession.L14_16;

import java.io.Reader;
import java.util.*;

public class UpperLowerTest {
//    static void upper(List<? extends Number> l) {
//           System.out.println(l);
//    }
//    static void lower(List<? super Integer> l) {
//           System.out.println(l);
//    }
    static void upper(List<? extends CharSequence> l) {
        for (CharSequence cs : l) {
            System.out.println(cs);
        }
    }
    static void lower(List<? super String> l) {
        System.out.println(l);
    }
    public static void main(String[] args) {
        List<String> s = new ArrayList<>();
        s.add("Viswa");
        s.add("Axel");
        List<Object> i = Arrays.asList("viswa",2,3);
        upper(s);
        lower(i);
    }
}
