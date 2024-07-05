package com.ust.LP4.c3.a1;

import com.ust.LP4.c1.a2.BubbleSort;

import java.util.Arrays;

public class InsertionSort {
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
    public static void swap(int[] num,int i,int j){
        int temp=num[i];
        num[i] = num[j];
        num[j] = temp;
    }
    public static void sort(int[] num){
        for(int i=0;i<num.length;i++){
            for(int j=0;j<num.length-1;j++){
                if(num[j]>num[j+1]){
                    int temp=num[j];
                    num[j] = num[j+1];
                    num[j+1] = temp;
                }
            }
        }
    }
    public static void sBubbleSort(int[] num){
        for(int i=0;i<num.length;i++){
            for(int j=0;j<num.length-i-1;j++){ //I
                try{
                    if(num[j]>num[j+1]){
                        swap(num, j,j+1);
                    }} catch (ArrayIndexOutOfBoundsException e){
                    e.printStackTrace();
                    System.out.println("i"+i+"\nj"+j);
                }
            }
        }
    }
    public static void sortImproved(int[] num){
        int i=0;
        boolean swapOccured = true;
        while (swapOccured){
            swapOccured = false;
            i++;
            for (int j=0;j< num.length-i;j++){
                if (num[j] > num[j + 1]) {
                    swap(num, j, j + 1);
                    swapOccured = true;
                }
            }
        }
    }
    public static void selectionSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            int mid = i;
            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[mid]) {
                    mid = j;
                }
            }
            int temp = array[mid];
            array[mid] = array[i];
            array[i] = temp;
        }
    }
    public static void main(String[] args) {
        // Insertion sort
        int []arr = {2,34,21,54,1,234,5,6,0};
        System.out.println("Before: "+ Arrays.toString(arr));
        inSort(arr);
        System.out.println("After : "+Arrays.toString(arr));
        String []names = {"viswa","axel","saran","jeswin","janani"};
        System.out.println("Before: "+Arrays.toString(names));
        inSortStr(names);
        System.out.println("After : "+Arrays.toString(names));
        // Bubble sort
        int[] num = new int[]{2,5,7,2,4,2,8,1,0};
        int[] num1 = new int[]{2,5,7,2,4,2,8,1,0};
        int[] num2 = new int[]{2,5,7,2,4,2,8,1,0};
        System.out.println("Before Sorting: "+Arrays.toString(num));
        sort(num);
        System.out.println("After Sorting: "+Arrays.toString(num));
        System.out.println("Before Sorting: "+Arrays.toString(num1));
        sBubbleSort(num1);
        System.out.println("After Sorting: "+Arrays.toString(num1));
        System.out.println("Before Sorting: "+Arrays.toString(num2));
        sortImproved(num2);
        System.out.println("After Sorting: "+Arrays.toString(num2));
        // Selection sort
        arr = new int[]{2,34,21,54,1,234,5,6,0};
        System.out.println("Before: "+ Arrays.toString(arr));
        selectionSort(arr);
        System.out.println("After : "+Arrays.toString(arr));
    }
}
