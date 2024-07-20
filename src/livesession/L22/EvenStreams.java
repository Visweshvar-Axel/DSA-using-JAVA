package livesession.L22;

import java.util.List;
import java.util.stream.Collectors;

import static java.util.function.Predicate.not;

public class EvenStreams {
    public static void main(String[] args) {
        var num = List.of(1,2,34,5,54,6,67);
        var even = num.stream()
                .filter( n -> n%2 == 0)
                .collect(Collectors.toList());
        var odd = num.stream()
                .filter(not(n -> n%2 == 0))
                .collect(Collectors.toList());

        System.out.println("Even:");
        even.forEach(System.out::println);

        System.out.println("odd:");
        odd.forEach(System.out::println);
    }
}
