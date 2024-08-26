package livesession.array;

public class frequent {
    public static void main(String[] args) {
//        int [] marks = {1,2,3,44,5,5,6,7,7,8,88,8,8};
        int [] marks = {2,4,5,7,8,5,1};
        int n = marks.length-1;
        int max = marks[0];
        int maxc = 0;
        for (int i = 0; i<=n;i++){
            int c = 0;
            for (int j = 0;j<=n;j++){
                if(i != j && marks[i] == marks[j]) c++;
            }
            if(c > maxc) {
                max = marks[i];
                maxc = c;
            }
        }
        if(maxc != 0) System.out.println(max+": frequency:"+(maxc+1));
        /**
          *
         *
         *
         * */
        int givenarry[]={3,4,5,6,4,4,6};
        /*int*/ max = 0;
        int mostFreq = givenarry[0];
        int[] count = new int[givenarry.length + 1];

        for (int num : givenarry) {
            count[num]++;
            if (count[num] > max)
            {
                max = count[num];
                mostFreq = num;
            }
        }

        System.out.println(mostFreq);
    }
}
