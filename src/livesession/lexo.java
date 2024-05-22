package livesession;

public class lexo {
    public static void main(String[] args) {
        int alp[] = new int[26];
        String str1 = "listen";
        String str2 = "silent";
        for(int i=0;i<str1.length();i++){
            alp[Integer.parseInt(str1.charAt(i)-1)]++;
        }
        for(int i=0;i<str2.length();i++){
            alp[(int) str2.charAt(i)-1]--;
        }
        int sum=0;
        for(int i=0;i<24;i++){
            sum+=alp[i];
        }
        if(sum!=0) System.out.println("yes");
        else System.out.println("not");
    }
}
