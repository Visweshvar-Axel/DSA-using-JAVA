package USTPraxis.fundamental;

public class SubsequenceArrays {
    private static void printSequence(int[] ss,int cssi) {
        for(int i = 0; i < cssi; i++){
            System.out.print(ss[i]+" ");
        }
        System.out.println();
    }
    public static void printAllSequence(int[] arr, int ci,int[] ss,int cssi){
        if(ci == arr.length) {
            printSequence(ss,cssi);
            return;
        }
        ss[cssi] = arr[ci];
        printAllSequence(arr,ci+1,ss,cssi+1);
        printAllSequence(arr,ci+1,ss,cssi);
    }
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3};
        int[] ss = new int[arr.length];
        printAllSequence(arr,0,ss,0);
    }
}
