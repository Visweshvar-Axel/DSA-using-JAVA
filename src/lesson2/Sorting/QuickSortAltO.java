package lesson2.Sorting;

import java.util.Arrays;

public class QuickSortAltO {
    public void QuickSort(int[] num){QuickSort(num,0,num.length-1);}
    public void QuickSort(int[] num,int p, int q){
        if(p<q){
            int j = partition(num,p,q);
            QuickSort(num, p, j-1);
            QuickSort(num, j+1, q);
        }
    }
    public int partition(int[] num,int p,int q){
        int v = num[(p+q) / 2];
        int i = p;
        int j = q;
        while(i <= j){
            while (num[i] < v)
                i++;
            while (num[j] > v)
                j--;
            if(i <= j) {
                swap(num, i, j);
                i++;
                j--;
            }
        }
        return j;
    }

    private void swap(int[] num,int i,int j){
        int temp=num[i];
        num[i] = num[j];
        num[j] = temp;
    }
    public static void main(String[] args) {
        QuickSortAltO quickSortAltO = new QuickSortAltO();
        int[] num = new int[]{7,2,7,2,4};
        quickSortAltO.QuickSort(num);
        System.out.println(Arrays.toString(num));
    }
}
