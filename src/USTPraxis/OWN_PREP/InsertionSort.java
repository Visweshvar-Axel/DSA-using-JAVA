package USTPraxis.OWN_PREP;

import java.util.Arrays;



public class InsertionSort {
// test
//    public static int[] sort(int[] arr){
//        for (int i = 1; i < arr.length; i++) {
//            int j = i;
//            while (j > 0 && arr[j] < arr[j-1]){
//                int temp = arr[j-1];
//                arr[j-1] = arr[j];
//                arr[j] = temp;
//                j--;
//            }
//        }
//        return arr;
//    }
    static int[] sort(int[] num){
        for (int i = 1; i < num.length; i++) {
            int j = i;
            while (j>0 && num[j-1] > num[j] ){
                int t = num[j-1];
                num[j-1] = num[j];
                num[j--] = t;
            }
        }
        return num;
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(sort(new int[]{5,3,2,7,83,1,23,4,56,6})));
    }
}
