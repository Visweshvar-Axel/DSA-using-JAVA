package USTPraxis.WeCP_Prep;

import java.util.Arrays;

public class SentencesCount {
    public static int sentencesCount(String str) {
        str = str.replaceAll("[,\\-...\\\\/_]","");
        String[] res = str.split("[!?.]");
        System.out.println(Arrays.toString(res));
        int c = 0;
        for (String w: res) {
            System.out.println(w);
            if(!w.strip().equals("")) c++;
        }
        return c;
    }

    public static void main(String[] args) {
        String[] tests = {
                "Hello! How are you? Last time I saw you… you were nervous.",
                "viswa!   .   ... ,"
        };
        for (String test : tests) {
            System.out.println(sentencesCount(test));
        }
    }
}
