package com.ust.LP6.c2_JAVA_NEW_FEATURES;

import java.util.Arrays;
import java.util.List;

public class CollectionsDemo {
    public static void main(String[] args) {
        //pre java 9
        var pre9 = Arrays.asList("viswa","axel");
        // preJava9Dogs.add("Cherry"); adding an element to the underlying array: fails at runtime
        pre9.set(1,"anu");
        System.out.println(pre9);

        //java 9
        var java9 = List.of("viswa","axel");
        // java9.add("asdas"); // unmodifiable list: fails at runtime
        // java9.set(1,"anu"); // unmodifiable list: fails at runtime

        //java 10
        var java10 = List.copyOf(pre9);  // deep copy
        // java10.add("asdas"); // unmodifiable list: fails at runtime
        // java10.set(1,"anu"); // unmodifiable list: fails at runtime


    }
}
