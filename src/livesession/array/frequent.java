package livesession.array;

public class frequent {
    public static void main(String[] args) {
        int [] marks = {1,2,3,44,5,5,6,7,7,8,88,8,8};
        int n = marks.length-1;
        int max = 0;
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
    }
}
