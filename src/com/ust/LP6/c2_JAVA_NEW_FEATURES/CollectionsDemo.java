package com.ust.LP6.c2_JAVA_NEW_FEATURES;

import java.util.Arrays;

public class CollectionsDemo {
    public static void main(String[] args) {
        //pre java 9
        var pre9 = Arrays.asList("viswa","axel");
        // preJava9Dogs.add("Cherry"); adding an element to the underlying array: fails at runtime
        pre9.set(1,"anu");
        System.out.println(pre9);
    }
}
