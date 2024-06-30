package com.ust.LP4.c1.a2;

import java.util.Arrays;

public class BubbleSort {
    public void swap(int[] num,int i,int j){
        int temp=num[i];
        num[i] = num[j];
        num[j] = temp;
    }
    public void sort(int[] num){
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
    public void sBubbleSort(int[] num){
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
    public void sortImproved(int[] num){
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
    public static void main(String[] args){
        BubbleSort bubbleSort = new BubbleSort();
        int[] num = new int[]{2,5,7,2,4,2,8,1,0};
        int[] num1 = new int[]{2,5,7,2,4,2,8,1,0};
        int[] num2 = new int[]{2,5,7,2,4,2,8,1,0};
        System.out.println("Before Sorting: "+Arrays.toString(num));
        bubbleSort.sort(num);
        System.out.println("After Sorting: "+Arrays.toString(num));
        System.out.println("Before Sorting: "+Arrays.toString(num1));
        bubbleSort.sBubbleSort(num1);
        System.out.println("After Sorting: "+Arrays.toString(num1));
        System.out.println("Before Sorting: "+Arrays.toString(num2));
        bubbleSort.sortImproved(num2);
        System.out.println("After Sorting: "+Arrays.toString(num2));
    }
    /* *
     * Before Sorting: [2, 5, 7, 2, 4, 2, 8, 1, 0]
     * After Sorting: [0, 1, 2, 2, 2, 4, 5, 7, 8]
     * Before Sorting: [2, 5, 7, 2, 4, 2, 8, 1, 0]
     * After Sorting: [0, 1, 2, 2, 2, 4, 5, 7, 8]
     * Before Sorting: [2, 5, 7, 2, 4, 2, 8, 1, 0]
     * After Sorting: [0, 1, 2, 2, 2, 4, 5, 7, 8]
     * */
}
