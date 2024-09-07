package USTPraxis.fundamental;

import static java.util.Comparator.reverseOrder;

import java.util.Arrays;
import java.util.Comparator;

public class SortingArray {
    public static void main(String[] args) {
        int[] rawArr = new int[] { 2, 4, 54, 2, 364, 768, 798, 4, 5678, 776, 67 };

        rawArr = Arrays.stream(rawArr).boxed().sorted(Comparator.reverseOrder()).mapToInt(Integer::intValue).toArray();
        System.out.println(Arrays.toString(rawArr));

        // conversion
        Integer[] arr = Arrays.stream(rawArr).boxed().toArray(Integer[]::new);

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        Arrays.sort(arr, reverseOrder());
        System.out.println(Arrays.toString(arr));

        arr = Arrays.stream(arr).sorted().toArray(Integer[]::new);
        System.out.println(Arrays.toString(arr));

        Arrays.sort(arr, (a, b) -> b - a);
        System.out.println(Arrays.toString(arr));

        Arrays.sort(arr, 1, arr.length - 1);
        System.out.println(Arrays.toString(arr));

        Arrays.sort(arr, Comparator.reverseOrder());
        System.out.println(Arrays.toString(arr));

        Arrays.sort(arr, (a, b) -> a - b);
        System.out.println(Arrays.toString(arr));

        arr = Arrays.stream(arr)
                // .sorted(reverseOrder()) // or
                .sorted(Comparator.reverseOrder())
                .toArray(Integer[]::new);
        System.out.println(Arrays.toString(arr));
    }
}
