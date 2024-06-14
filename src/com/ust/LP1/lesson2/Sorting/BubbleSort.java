package com.ust.LP1.lesson2.Sorting;

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
        bubbleSort.sort(num);
        bubbleSort.sBubbleSort(num1);
        bubbleSort.sortImproved(num2);
        System.out.println(Arrays.toString(num));
        System.out.println(Arrays.toString(num1));
        System.out.println(Arrays.toString(num2));
    }
}
