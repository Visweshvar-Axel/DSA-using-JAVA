package USTPraxis.fundamental;

import java.util.*;
import java.util.stream.*;

public class testSort {
    public static void main(String[] args) {
        int[] arr = { 121, 123, 3, 3133, 4 };
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        List<Integer> list = Arrays.stream(arr).boxed().sorted(Collections.reverseOrder()).collect(Collectors.toList());
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);

        List<Integer[]> work = new ArrayList<>();
        work.add(new Integer[]{1,2}); 
        work.add(new Integer[]{5,0}); 
        work.add(new Integer[]{2,3}); 
        work.add(new Integer[]{7,1});
        
        Collections.sort(work,Comparator.comparingInt((Integer[] n)-> n[0]));
        work.stream().forEach((Integer[] n)-> System.out.println(Arrays.toString(n)));
        System.out.println();
        Collections.sort(work,Comparator.comparingInt((Integer[] n)-> n[1]));
        work.stream().forEach((Integer[] n)-> System.out.println(Arrays.toString(n)));
        System.out.println();
        System.out.println();
        
        Collections.sort(work,Comparator.comparingInt((Integer[] n)-> n[0]).reversed());
        work.stream().forEach((Integer[] n)-> System.out.println(Arrays.toString(n)));
        System.out.println();
        Collections.sort(work,Comparator.comparingInt((Integer[] n)-> n[1]).reversed());
        work.stream().forEach((Integer[] n)-> System.out.println(Arrays.toString(n)));



        Queue<Integer> queNor = new PriorityQueue<>();
        queNor.addAll(list);
        System.out.println(queNor.poll());
        System.out.println(queNor.poll());
        System.out.println(queNor.poll());
        Queue<Integer> queRev = new PriorityQueue<>(Collections.reverseOrder());
        queRev.addAll(list);
        System.out.println(queRev.poll());
        System.out.println(queRev.poll());
        System.out.println(queRev.poll());
    }
}
