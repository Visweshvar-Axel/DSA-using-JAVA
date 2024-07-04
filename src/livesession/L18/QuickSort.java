package livesession.L18;

import java.util.Arrays;

public class QuickSort {
    static int iter = 0;
    public void QuickSort(int[] num){QuickSort(num,0,num.length-1);}
    public void QuickSort(int[] num,int p, int q){
        if(p<q){
            iter++;
            int j = partition(num,p,q);

            QuickSort(num, p, j-1);
            System.out.println();
            QuickSort(num, j+1, q);
        }
    }
    public int partition(int[] num,int p,int q){
        int v = num[(p+q) / 2];
        System.out.println("pivot : "+v+" at :"+(p+q) / 2);
        System.out.println("iter "+iter+":"+Arrays.toString(num));
        System.out.print("left: ");
        for (int i = p; i < j-1; i++) {
            System.out.print(num[i]+", ");
        }
        System.out.print("right: ");
        for (int i = j+1; i < q; i++) {
            System.out.print(num[i]+", ");
        }
        System.out.println();
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
        return i;
    }

    private void swap(int[] num,int i,int j){
        int temp=num[i];
        num[i] = num[j];
        num[j] = temp;
    }
    public static void main(String[] args) {
        QuickSort quickSort = new QuickSort();
        int[] num = new int[]{/*2,5,7,2,4,*/2,8,1,0,9,3,6};
        System.out.println("Before: "+Arrays.toString(num));
        quickSort.QuickSort(num);
        System.out.println("After: "+Arrays.toString(num));
    }
}
