package USTPraxis.WeCP_Prep;

public class RankStrike {
    public static void main(String[] args) {
        int[][] tests = {
                { 4, 3, 7, 2, 6, 1 },
                { 10, 8, 9, 7, 6 },
                { 9, 5, 6, 4, 3, 2, 1 },
                { 1, 2, 3, 4 }
        };
        for (int[] test : tests) {
            System.out.println(strikeCount(test));
        }
    }

    private static int strikeCount(int[] val) {
        int max = val[0];
        int count = 0;
        for (int i : val) {
            if (i < max) {
                max = i;
                count++;
            }
        }
        return count;
    }
}
