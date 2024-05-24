package com.ust.LP1.lesson2.Sorting;

public class BinarySearch {
    public boolean binarySearch(int x, int[] num){
        return binarySearch(x, num,0,num.length);
    }
    public boolean binarySearch(int x, int[] num, int beg,int end){
        if(beg<=end){
            int mid=(end-beg) /2 + beg;
            if (num[mid]==x) return true;
            if (num[mid]>x) return binarySearch(x,num,beg,mid-1);
            return binarySearch(x,num,mid+1,end);
        }
        return false;
    }

    public static void main(String[] args) {
        BinarySearch binarySearch = new BinarySearch();
        System.out.println(binarySearch.binarySearch(7,new int[]{1,2,3,4,5,6,7,8,9,10}));
        System.out.println(binarySearch.binarySearch(0,new int[]{1,2,3,4,5,6,7,8,9,10}));
    }
}
