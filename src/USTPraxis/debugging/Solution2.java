package USTPraxis.debugging;

public class Solution2 {
    public static int findMax(int[] arr) {
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] nums = {9, 5, 3, 1, 2};
        System.out.println(findMax(nums)); // 9
    }
}
