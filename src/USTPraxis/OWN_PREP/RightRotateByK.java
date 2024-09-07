package USTPraxis.OWN_PREP;

import java.util.Arrays;

public class RightRotateByK {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        int right = arr[arr.length - 1];
        for (int i = arr.length - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = right;
        System.out.println(Arrays.toString(arr));

        int k = 5;
        k = k % arr.length;
        while (k-- > 0) {
            right = arr[arr.length - 1];
            for (int i = arr.length - 1; i > 0; i--) {
                arr[i] = arr[i - 1];
            }
            arr[0] = right;
        }
        System.out.println(Arrays.toString(arr));

        // batter
        // k = 7;
        // int rotate = k% arr.length;
        // int[] res = new int[arr.length];
        // int x = 0;
        // for(int i = arr.length-rotate; i< arr.length;i++) res[x++] = arr[i];
        // for(int i = 0; i< arr.length-rotate;i++) res[x++] = arr[i];
        // System.out.println(Arrays.toString(res));

        k = 4;
        int rotate = k % arr.length;
        int[] res = new int[rotate];
        int x = 0;
        for (int i = arr.length - rotate; i < arr.length; i++)
            res[x++] = arr[i];
        for (int i = arr.length - rotate - 1; i >= 0; i--)
            arr[i + rotate] = arr[i];
        for (int i = 0; i < res.length; i++)
            arr[i] = res[i];
        System.out.println(Arrays.toString(arr));


        // revers method
        revers(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
        // static void revers(int[] arr,int start, int end){
        // while(start<end){
        // int temp = arr[start];
        // arr[start++] = arr[end];
        // arr[end--] = temp;
        // }
        // }
        // public void rotate(int[] nums, int k) {
        // int size = nums.length;
        // k=k%size;
        // int calc = size-k;
        // revers(nums,0,calc-1);
        // revers(nums,calc,size-1);
        // revers(nums,0,size-1);

    }

    static void revers(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start++] = arr[end];
            arr[end--] = temp;
        }
        // for(int i=start;i<(end-start)/2+start;i++){
        // int temp = arr[i];
        // arr[i] = arr[i+end-start];
        // arr[i+end-start] = temp;
        // }
    }
}
