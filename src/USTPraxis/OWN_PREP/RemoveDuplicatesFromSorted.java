package USTPraxis.OWN_PREP;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveDuplicatesFromSorted {
    public static void main(String[] args) {
        Integer[] a = {12,3,34,4,44,4,5,5,5,66,7};
        Set<Integer> set = new HashSet<>();
        set.addAll(Arrays.stream(a).collect(Collectors.toList()));
        List<Integer> lis = set.stream().toList();
        System.out.println(set);
        Integer[] arr = lis.toArray(new Integer[0]);
    }
}
