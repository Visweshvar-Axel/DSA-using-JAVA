package livesession;

public class lexo {
    public static void main(String[] args) {
        int alp[] = new int[26];
        String str1 = "listen";
        String str2 = "silent";
        for(int i=0;i<str1.length()-1;i++){
            alp[(int) str1.indexOf(i)]++;
        }
        for(int i=0;i<str2.length()-1;i++){
            alp[(int) str2.indexOf(i)]--;
        }
        int sum=0;
        for(int i=0;i<25;i++){
            sum+=alp[i];
        }
        if(sum!=0) System.out.println("yes");
        else System.out.println("not");
    }
}
