package USTPraxis.module_3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Q2NegativeSquare {
    public static List<Integer> negativeSquare(List<Integer> nums) {
        List<Integer> res = new ArrayList<>();
        for (Integer i : nums) {
            if (i < 0)
                res.add((int) Math.pow(i, 2));
            else
                res.add(i);
        }
        return res;
    }

    public static List<Integer> negativeSquareStreams(List<Integer> nums) {
        return nums.stream()
                .map(n -> (n < 0) ? (int) Math.pow(n, 2) : n)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<List<Integer>> tests = List.of(
                List.of(1, -2, -3, -4, -1),
                List.of(-34, -2, 3, 4, -1),
                List.of(1, 2, 3, -4, -1),
                List.of(1, 2, -3, 4, -1));
        for (List<Integer> test : tests) {
            // System.out.println(negativeSquare(test));
            System.out.println(negativeSquareStreams(test));
        }
    }
}
