package livesession.array;

import java.util.Arrays;

public class arraysort {
    public static void main(String[] args) {
        int [] marks = {81,24,56,30,90,18};
        Arrays.sort(marks);
        int k =114;
        int i=0,j=marks.length-1;
        boolean f = false;
        while (i<j){
            if(marks[i]+marks[j] == k){
                f = true;
                break;
            } else if (marks[i]+marks[j] < k) i++;
            else j--;
        }
        if(f) System.out.println("found"+marks[i]+" "+marks[j]);
        else System.out.println("not");
    }
}
