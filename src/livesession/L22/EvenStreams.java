package livesession.L22;

import java.util.List;
import java.util.stream.Collectors;

public class EvenStreams {
    public static void main(String[] args) {
        var num = List.of(1,2,34,5,54,6,67);
        var even = num.stream()
                .filter( n -> n%2 == 0)
                .collect(Collectors.toList());
        even.forEach(System.out::println);
    }
}
