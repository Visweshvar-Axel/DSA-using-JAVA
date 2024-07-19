package com.ust.LP6.c2_JAVA_NEW_FEATURES;

public class StringDemo {
    public static void main(String[] args) {
        System.out.println("Demo: operations with whitespace in java 11");

        String str = "     viswa        \u2003";
        System.out.printf("Str: '%s'\n",str);
        System.out.printf("Str.trim: '%s'\n",str.trim());
    }
}
