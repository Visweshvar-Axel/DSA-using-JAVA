package com.ust.LP4.c3.a1;

import java.util.HashSet;

public class duplicate {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 2, 6, 7, 8, 3};

        if (containsDuplicate(array)) {
            System.out.println("The array contains duplicates.");
        } else {
            System.out.println("The array does not contain duplicates.");
        }
    }

    public static boolean containsDuplicate(int[] array) {
        HashSet<Integer> s = new HashSet<>();
        for (int num : array) {
            if (s.contains(num)) {
                return true;
            }
            s.add(num);
        }
        return false;
    }
}
