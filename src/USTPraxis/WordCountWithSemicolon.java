package USTPraxis;

import java.util.Arrays;

public class WordCountWithSemicolon {
    private static int WordCount(String sen, String tar) {
        tar = tar.trim();
        sen = sen.trim();
        if(sen.length() == 0 || tar.length() == 0) return -1;
        int c = 0;
        sen = sen.replaceAll(";","");
        String[] words = sen.split("\s+");
//        System.out.println(Arrays.toString(words));
        for (String word : words) {
            if(word.equals(tar)) c++;
        }
        return c;
    }
    public static void main(String[] args) {
        String[][] tests = {
                {"visw;a ax;el       hafueb ksaj;;dhf a;x;e;l a;skdfeh askd;fj easd","axel"},
                {"In today's fast-paced business world, it is crucial to keep up with the ever-changing trends and techniques." +
                        " As a professional, it is important to constantly challenge yourself and strive for growth and improvement in your field." +
                        " This c;an be achieved through continuous learning and staying updated on industry developments." +
                        " Networking wi;th othe;r professionals in your field ca;n also provide valuable insights and opportunities for collaboration. " +
                        " By staying proactive and ada;ptable, you ca;n demonstrate your dedication to excellence and cont;ribute to the success of your organization." +
                        " Additionally, maintai;ning a posi;tive attitude and strong work ethic; will not only benefit your own career but also create a positive impact on those around you." +
                        " As the saying goes, \"the only cons;tant is change,\" so embrace it with enthusiasm and determination to excel in your profession.","can"},
                {"visw;a ja;na;ni anu ran ja;na;ni ja;na;ni ja;n;;a;ni ja;;;na;ni ","janani"},
                {"visw;a ja;na;ni anu ran ja;na;ni ja;na;ni ja;n;;a;ni ja;;;na;ni "," "},
                {"     "," asd"}
        };
        for (String[] test : tests){
            System.out.println(WordCount(test[0],test[1]));
        }
    }

}
