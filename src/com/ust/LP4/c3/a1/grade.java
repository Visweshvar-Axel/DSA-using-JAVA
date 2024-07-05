package com.ust.LP4.c3.a1;

public class grade {
    public static void main(String[] args) {
        int [][]arr = new int[][]{
                {23,43,65,23,65},
                {23,43,65,23,65},
                {23,43,65,23,65},
                {23,43,65,23,65},
        };
        int row = arr.length;
        int col = arr[0].length;
        for (int i = 0; i < row; i++) {
            System.out.println("Student "+i+":");
            int tot=0,avg=0;
            for (int j = 0; j < col; j++) {
                tot+=arr[i][j];
            }
            avg = tot / col;
            char grade;
            if (avg >= 90) {
                grade = 'A';
            } else if (avg >= 80) {
                grade = 'B';
            } else if (avg >= 70) {
                grade = 'C';
            } else if (avg >= 60) {
                grade = 'D';
            } else {
                grade = 'F';
            }
            System.out.println("total:"+tot+"\n"+"average:"+avg+"\n"+"grade:"+grade);

        }
    }
}
