package USTPraxis.WeCP_Prep;

public class OddEvenPair {
    public static void main(String[] args) {
        int[] tests = {30,10,5,12};
        for (int test: tests) {
            System.out.println(oddEvenCount(test));
        }
    }

    private static int oddEvenCount(int num) {
        int count = 0;
        for (int i = 1; i <= num ; i++) {
            if(isGoodPair(i) || i <= 10) count++;
        }
        return count;
    }
    private static boolean isGoodPair(int n) {
        String num = String.valueOf(n);
        boolean isPreEven = (num.charAt(0) - '0') % 2 == 0;
        for (int i = 1; i < num.length(); i++) {
            boolean isCurEven = (num.charAt(i) - 0) % 2 == 0;
            if(isPreEven == isCurEven) return false;
            isPreEven = isCurEven;
        }
        return true;
    }
}
