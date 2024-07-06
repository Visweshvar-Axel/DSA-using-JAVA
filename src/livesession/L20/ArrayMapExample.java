package livesession.L20;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayMapExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int []arr = Arrays.stream(sc.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        Arrays.stream(arr).forEach(num -> System.out.print(num+", "));
    }
}
