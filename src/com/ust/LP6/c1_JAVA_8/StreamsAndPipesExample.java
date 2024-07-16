package com.ust.LP6.c1_JAVA_8;

import java.util.stream.Stream;

public class StreamsAndPipesExample {
    public static void main(String[] args) {
        Stream.of("viswa","axel","janani","anu","saran")
                .map(name -> name.toUpperCase())
                .filter(s -> s.length() > 3)
                .sorted()
                .distinct()
                .forEach(System.out::println);
    }
    static class Student{
        int roundedPersentage;
        String name;
        Exam exam;

        public Student(int roundedPersentage, String name, Exam exam) {
            this.roundedPersentage = roundedPersentage;
            this.name = name;
            this.exam = exam;
        }
    }
    static class Exam {
        String name;

        public Exam(String name) {
            this.name = name;
        }
    }
    /*
    * collectors toSet, toList
    * allMatch(), anyMatch(), noneMatch()
    * forEach()
    * */
}
