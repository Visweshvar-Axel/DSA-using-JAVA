package livesession.L18;

import java.util.Arrays;

public class InsertionSortExample {
    public static void inSort(int []arr){
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int temp = arr[i];
            int j = i-1;
            while(j>=0 && arr[j] > temp) {
                arr[j+1] = arr[j--];
            }
            arr[j+1] = temp;
        }
    }
    public static void inSortStr(String []arr){
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            String temp = arr[i];
            int j = i-1;
            while(j>=0 && 0 < arr[j].compareTo(temp)) {
                arr[j+1] = arr[j--];
            }
            arr[j+1] = temp;
        }
    }
    public static void main(String[] args) {
        int []arr = {2,34,21,54,1,234,5,6,0};
        System.out.println("Before: "+Arrays.toString(arr));
        inSort(arr);
        System.out.println("After : "+Arrays.toString(arr));
        String []names = {"viswa","axel","saran","jeswin","janani"};
        System.out.println("Before: "+Arrays.toString(names));
        inSortStr(names);
        System.out.println("After : "+Arrays.toString(names));
    }
}
