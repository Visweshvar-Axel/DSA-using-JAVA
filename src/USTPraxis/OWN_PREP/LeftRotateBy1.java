package USTPraxis.OWN_PREP;

import java.util.Arrays;

public class LeftRotateBy1 {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        int left = arr[0];
        for (int i = 1; i < arr.length; i++) {
            arr[i - 1] = arr[i];
        }
        arr[arr.length - 1] = left;
        System.out.println(Arrays.toString(arr));

        int k = 5;
        k = k % arr.length;
        while (k-- > 0) {
            left = arr[0];
            for (int i = 1; i < arr.length; i++) {
                arr[i - 1] = arr[i];
            }
            arr[arr.length - 1] = left;
        }
        System.out.println(Arrays.toString(arr));
    }
}
