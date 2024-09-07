package USTPraxis.fundamental;

import java.util.Arrays;
import java.util.stream.*;
import java.util.*;

public class testSort {
    public static void main(String[] args) {
        int[] arr = {12,3,4,45,6};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        List<Integer> list = Arrays.stream(arr).boxed().sorted(Collections.reverseOrder()).collect(Collectors.toList());
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
    }
}
