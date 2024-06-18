package livesession.L14_16;

import java.io.Reader;
import java.util.*;

public class UpperLowerTest {
//    static void upper(List<? extends Objects> l) {
//       for(Objects i : l){
//           System.out.println(i);
//       }
//    }
//    static void lower(List<? super Integer> l) {
//       for(Object i : l){
//           System.out.println(i);
//       }
//    }
    static void upper(List<? extends Number> l) {
           System.out.println(l);
    }
    static void lower(List<? super Integer> l) {
           System.out.println(l);
    }
    public static void main(String[] args) {
        List<Integer> s = new ArrayList<>();
        s.add(5);
        s.add(5);
        s.add(5);
        List<Integer> i = Arrays.asList(1,2,3);
        upper(s);
        lower(i);
    }
}
