package lesson2.Sorting;

public class MergeSort {
    public void mergeSort(int[] num,int beg,int end){
        if(beg<end){
            int m = (end-beg)/2 + beg;
            mergeSort(num,beg,m);
            mergeSort(num,m+1, end);
            merge(num,beg,m,end);
        }
    }
    public void merge(int[] num,int beg,int mid,int end){
        int i=beg;
        int j=mid+1;
        int[] temp = new int[end-beg+1];
        for (int k = 0; k < temp.length; k++){
            if(i <= mid && (j > end || num[i] <= num[j])){
                temp[k] = arr
            }
        }
    }
    public static void main(String[] args) {

    }
}
