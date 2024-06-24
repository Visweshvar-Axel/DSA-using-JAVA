package livesession.L17;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    public static int search(int[] arr,int key){
        int beg = 0;
        int end = arr.length-1;
        while (beg<=end) {
            int mid = beg + (end - beg) /2;
            if (arr[mid] == key) return mid;
            else if (arr[mid] > key) end = mid-1;
            else beg = mid+1;
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        int[] arr = new int[]{5, 6, 2, 7, 3, 9};
        System.out.print("Enter the array values: ");
        int[] arr = Arrays.stream(sc.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        System.out.print("Enter the target values: ");
        int key = sc.nextInt();
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int index = search(arr,key);
        if(index!=-1){
            System.out.println("the element "+arr[index]+" is found as: "+index);
        } else {
            System.out.println("element not found");
        }
    }
}
