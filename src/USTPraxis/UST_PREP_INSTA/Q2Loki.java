package USTPraxis.UST_PREP_INSTA;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.Comparator.reverseOrder;

public class Q2Loki {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = 6;
        Integer arr[] = new Integer[] { 9, 3, 1, 2, 4, 2 };
        int tot = 0;
        for (int i : arr)
            tot += i;
        Arrays.sort(arr, (a, b) -> b - a);
        // Arrays.sort(arr, Comparator.reverseOrder());
        // arr = Arrays.stream(arr)
        // .boxed()
        // .sorted(Comparator.reverseOrder())
        // .mapToInt(Integer::intValue)
        // .toArray();
        int count = 0, sum = 0;
        System.out.println(Arrays.toString(arr));
        for (int i : arr) {
            sum += i;
            tot -= i;
            count++;
            if (sum >= tot)
                break;
        }
        System.out.println(count);

    }
}