package livesession.L17;

public class LinearSearch {
    public static int search(int[] arr, int key){
        int l = arr.length;
        for (int i = 0; i < l; i++) {
            if(arr[i] == key) {
                return i;
            }
        }
        return -1;
    }
    public static void searchRes(int[] arr, int key){
        int index = search(arr,key);
        if(index!=-1){
            System.out.println("the element "+arr[index]+" is found as: "+index);
            System.out.println("the square of the element is: "+arr[index]*arr[index]);
        } else {
            System.out.println("the element "+key+" is not found");
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[]{5, 6, 2, 7, 3, 9};
        searchRes(arr,5);
        searchRes(arr,7);
        searchRes(arr,12);
/*
        int index = search(arr,6);
        if(index!=-1){
            System.out.println("the element "+arr[index]+" is found as: "+index);
            System.out.println("the square of the element is: "+arr[index]*arr[index]);
        } else {
            System.out.println("element not found");
        }
*/
    }
}
