package USTPraxis.Re_Module_7;

import java.util.*;

public class ItemShop {
//    static class Item {
//        public int price;
//        public int stock;
//        public Item(int p, int s){
//            price = p;
//            stock = s;
//        }
//
//        @Override
//        public String toString() {
//            return "Item{" +
//                    "price=" + price +
//                    ", stock=" + stock +
//                    '}';
//        }
//    }
//    public static int maximizeItems(int n, int[] A, int k) {
//        List<Integer[]> items = new ArrayList<>();
//        int size = A.length;
//        for(int i =0 ;i < size;i++){
//            items.add(new Integer[]{A[i],size-i});
//        }
//        Collections.sort(items,Comparator.comparingInt((Integer[] a)-> a[0]));
//        items.stream().forEach((Integer[] a)-> System.out.println(a[0]+" "+a[1]));
//        int count = 0;
//        List<Integer> it = new ArrayList<>();
//        for(int i = 0; i < size; i++){
//            int z = items.get(i)[1];
//            while(z-->0 && k >= items.get(i)[0]){
//                count++;
//                it.add(items.get(i)[0]);
//                k -= items.get(i)[0];
//            }
//            if (k <= 0) break;
//        }
//        System.out.println(it);
//        return count;
//    }
    public static int maximizeItems(int n, int[] A, int k) {
        List<Integer[]> items = new ArrayList<>();
        int size = A.length;
        for(int i =0 ;i < size;i++){
            items.add(new Integer[]{A[i],size-i});
        }
        Collections.sort(items,Comparator.comparingInt((Integer[] a)-> a[0]));
        items.stream().forEach((Integer[] a)-> System.out.println(a[0]+" "+a[1]));
        int count = 0;
        List<Integer> it = new ArrayList<>();
        for(int i = 0; i < size; i++){
            int price = items.get(i)[0];
            int stock = items.get(i)[1];
            int maxbuy = Math.min(k / price, stock);
            count += maxbuy;
            k -= maxbuy * price;
            if (k <= 0) break;
        }
        System.out.println(it);
        return count;
    }
//    public static int maximizeItems(int n, int[] A, int k) {
//        Item[] items = new Item[A.length];
//        int size = A.length;
//        for(int i =0 ;i < size;i++){
//            items[i] = new Item(A[i],size-i);
//        }
//        Arrays.sort(items, Comparator.comparingInt((Item obj) -> obj.price));
//        System.out.println(Arrays.toString(items));
////        int max = 0;
//        int count = 0;
//        List<Integer> it = new ArrayList<>();
//        for(int i = 0; i < size; i++){
//            int z = items[i].stock;
//            while(z-->0 && k >= items[i].price){
//                count++;
//                it.add(items[i].price);
//                k -= items[i].price;
//            }
//        }
//        System.out.println(it);
//        return count;
//    }


    public static void main(String[] args) {
        int n = 3;
        int[] A = {5,2,1};
        int k = 4;
        int result = maximizeItems(n, A, k);
        System.out.println("Maximum number of items that can be bought: " + result);
    }
}