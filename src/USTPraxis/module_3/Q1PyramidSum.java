package USTPraxis.module_3;

import java.util.*;

/* *
 *
 * 500
 *
 * [1, 2, 3, 4, 5]
 * [3, 5, 7, 9]
 * [8, 12, 16]
 * [20, 28]
 * 48
 *
 * [-226, 43, 12]
 * [-183, 55]
 * -128
 *
 * */
public class Q1PyramidSum {
    public static int PyramidSum(int array_length, List<Integer> arr){
        if(array_length == 1) return arr.get(0);
        else{
            while (arr.size() > 1){
                System.out.println(arr);
                List<Integer> temp = new ArrayList<>();
                for (int i = 0; i < arr.size() - 1; i++) {
                    temp.add(arr.get(i)+arr.get(i+1));
                }
                arr = temp;
            }
        }
        return arr.get(0);
    }
    public static void main(String[] args) {
        List<List<Object>> tests = List.of(
                List.of(1, List.of(500)),
                List.of(5, List.of(1, 2, 3, 4, 5)),
                List.of(3, List.of(-226, 43, 12))
        );
        for (List test : tests){
            System.out.println(PyramidSum((Integer) test.get(0), (List<Integer>) test.get(1)));
        }
    }
}
