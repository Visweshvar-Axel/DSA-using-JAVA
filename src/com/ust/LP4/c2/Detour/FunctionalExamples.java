package com.ust.LP4.c2.Detour;

public class FunctionalExamples {
    public static int sunUnto(int n) {
        int s=0;
        for (int i = 0; i <= n; i++) {
            s+=i;
        }
        return s;
    }
    public static int sunUntoFunctional(int n) {
        return n==0 ? 0 : n + sunUntoFunctional(n-1);
    }

    public static long choose(long n, long r){
        if (n < r) return 0;
        if (r == 0 || n == r) return 1;
        return choose(n-1,r) + choose(n-1,r-1);
    }
    public static void main(String[] args) {
        System.out.println(sunUnto(10));
        System.out.println(sunUntoFunctional(10));

        System.out.println(choose(10,6));
    }
}
