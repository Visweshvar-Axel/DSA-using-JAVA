package livesession;

public class lexo {
    public static void main(String[] args) {
        int[] alp = new int[26];
        String str1 = "listen";
        String str2 = "silent";
        for(int i=0;i<str1.length();i++){
            alp[(int) str1.charAt(i)-'a']++;
        }
        for(int i=0;i<str2.length();i++){
            alp[(int) str2.charAt(i)-'a']--;
        }
        int sum=0;
        for(int i=0;i<26;i++){
            if(alp[i] > 0) sum+=alp[i];
        }
        if(sum==0) System.out.println("yes");
        else System.out.println("not");
    }
    // public static void main(String[] args) {
    //     int[] alp = new int[26];
    //     String str1 = "listen";
    //     String str2 = "silent";
    //     for(int i=0;i<str1.length();i++){
    //         alp[(int) str1.charAt(i)-96-1]++;
    //     }
    //     for(int i=0;i<str2.length();i++){
    //         alp[(int) str2.charAt(i)-96-1]--;
    //     }
    //     int sum=0;
    //     for(int i=0;i<26;i++){
    //         if(alp[i] > 0) sum+=alp[i];
    //     }
    //     if(sum==0) System.out.println("yes");
    //     else System.out.println("not");
    // }
}
