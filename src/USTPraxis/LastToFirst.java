package USTPraxis;

import java.util.Arrays;

public class LastToFirst {
    public static String[] lastFist(String[] str){
        for (int i = 0 ; i < str.length ; i++) {
            int n = str[i].length();
            str[i] = str[i].charAt(n-1) + str[i].substring(0,n-1);
        }
        return str;
    }
    public static void main(String[] args) {
        String[][] tests = {
                            {"viswa","axel","anu"},
                            {"viswa1","anu1"},
                            {"viswa2","axel3","anu4"},
                            {}
        };
        for (String[] test : tests){
            System.out.println(Arrays.toString(lastFist(test)));
        }
    }
}
