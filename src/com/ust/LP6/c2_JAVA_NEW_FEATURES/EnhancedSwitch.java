package com.ust.LP6.c2_JAVA_NEW_FEATURES;

public class EnhancedSwitch {
    public static void main(String[] args) {
        // old version
        int n = 2;
        String ans = "";
        switch (n){
            case 1:
                ans = "one";
                break;
            case 2:
                ans = "two";
                break;
            case 3:
                ans = "three";
                break;
            default:
                ans = "invalid";
        }
        System.out.println(ans);
        n = 1;
        ans = switch (n){
            case 1 -> "one";

            case 2 -> "two";
            case 3 -> "three";
            default -> "invalid";
        };
    }
}
