package USTPraxis.UST_PREP_INSTA;

public class Q2Rocks {
    public static void main(String[] args) {
        // int r=20,w=3;
        int[] rock = new int[] { 921, 107, 270, 631, 926, 543, 589, 520, 595, 93, 873, 424, 759, 537, 458, 614, 725,
                842, 575, 195 };
        int[][] lab = new int[][]{
                { 1, 100 },
                { 50, 600 },
                { 1, 1000 }
        };
        for (int[] arr : lab) {
            int c = 0;
            for (int i : rock) {
                if (i >= arr[0] && i <= arr[1])
                    c++;
            }
            System.err.print(c + " ");
        }
    }
}
