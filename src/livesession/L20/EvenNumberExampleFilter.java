package livesession.L20;

import java.util.List;
import java.util.stream.Collectors;

public class EvenNumberExampleFilter {
    public static void main(String[] args) {
        List<Integer> n = List.of(1,2,3,4,5,6);
        n = n.stream().filter(num -> (num % 2) == 0).collect(Collectors.toList());
        n.stream().forEach(num -> System.out.print(num+", "));
        System.out.println();
        List<Integer> n1 = List.of(10,20,33,42,50,65);
        n1 = n1.stream().filter(num -> (num % 5) == 0).collect(Collectors.toList());
        n1.stream().forEach(num -> System.out.print(num+", "));
    }
}
