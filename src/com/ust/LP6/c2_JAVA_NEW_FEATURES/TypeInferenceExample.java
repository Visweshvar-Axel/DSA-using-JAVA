package com.ust.LP6.c2_JAVA_NEW_FEATURES;

import java.util.List;
import java.util.Map;

public class TypeInferenceExample {
    public static void main(String[] args) {

        var cat = "atiya";

        var catNames= List.of("elle","tim","tom","jack");

        var catWithDescription = Map.of(//
                "jack", List.of("Super—fluffy "," Sleeps all day long. "),
                "Ella", List.of("Black Bombay cat.", "Playful, fast, and agile.")
        );

        for (var i = 0; i < 10; i++) {
            System.out.println(i);
        }



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
