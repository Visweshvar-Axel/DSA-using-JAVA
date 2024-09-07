package USTPraxis.fundamental;

public class SubArrays {
    public static void main(String[] args) {
        // leaned
        int[] arr = new int[]{1,2,3,4/*,5,6,7,8,9*/};
        int size = arr.length;
        for (int i = 0; i < size; i++) {
            for (int z = i; z < size; z++) {
                for (int k = i; k <= z; k++) {
                    System.out.print(arr[k] + " ");
                }
                System.out.println();
            }
        }

        // own
//        int[] arr = new int[]{1,2,3,4/*,5,6,7,8,9*/};
//        int size = arr.length;
//        int lim;
//        int beg = 0;
//        while(beg < size) {
//            lim = 1;
//            while (lim <= size) {
//                for (int i = beg; i < lim; i++) {
//                    System.out.print(arr[i] + " ");
//                }
//                System.out.println();
//                lim++;
//            }
//            System.out.println();
//            beg++;
//        }
    }
}
