package com.ust.LP6.c2_JAVA_NEW_FEATURES;

import java.lang.annotation.Native;
import java.util.List;
import java.util.Map;
import java.util.function.IntBinaryOperator;
import java.util.stream.Collectors;

public class TypeInferenceExample {
    public static void main(String[] args) {

        var cat = "atiya";

        var catNames= List.of("elle","tim","tom","jack");

        var catWithDescription = Map.of(//
                "jack", List.of("Super—fluffy "," Sleeps all day long. "),
                "Ella", List.of("Black Bombay cat.", "Playful, fast, and agile.")
        );

        var catObject = catWithDescription.entrySet().stream()
                .map(c -> new Object() {
                    String name = c.getKey();
                    List<String> description = c.getValue();
                }).collect(Collectors.toList());

        catObject.forEach(c -> System.out.println(c.name+" : "+c.description)); // can access using var

        // var lambda java 8
        IntBinaryOperator fun2 = (a, b) -> a * b;

        // var lambda java 11
        IntBinaryOperator fun2 = ( var a, var b) -> a * b;


        for (var i = 0; i < 10; i++) {
            System.out.println(i);
        }

//        Object notAccess = new Object() { String name = "viswa";};
//        System.out.println(notAccess.name);
        var Access = new Object() { String name = "viswa";};
        System.out.println(Access.name);

//        try with resources also var can be used




//        String cat = "atiya";
//
//        List<String> catNames= List.of("elle","tim","tom","jack");
//
//        Map<String,List<String>> catWithDescription = Map.of(//
//                "jack", List.of("Super—fluffy "," Sleeps all day long. "),
//                "Ella", List.of("Black Bombay cat.", "Playful, fast, and agile.")
//        );
//
//        for (int i = 0; i < 10; i++) {
//            System.out.println(i);
//        }
    }
}
