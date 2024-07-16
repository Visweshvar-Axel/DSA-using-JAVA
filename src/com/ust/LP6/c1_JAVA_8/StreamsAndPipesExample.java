package com.ust.LP6.c1_JAVA_8;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Stream;

public class StreamsAndPipesExample {
    public static void main(String[] args) {
        List<StudentExamResult> results = getStudentResult();
        System.out.println(results);

        Stream.of("viswa","axel","janani","anu","saran")
                .map(name -> name.toUpperCase())
                .filter(s -> s.length() > 3)
                .sorted()
                .distinct()
                .forEach(System.out::println);
    }

    private static List<StudentExamResult> getStudentResult() {
        Exam javaCertification = new Exam("javaCertification");
        Exam maven101 = new Exam("maven101");
        Exam apacheEssentials = new Exam("apacheEssentials");

        List<StudentExamResult> results = new LinkedList<>();
        results.add(new StudentExamResult(95,"viswa",maven101));
        results.add(new StudentExamResult(72,"axel",javaCertification));

        results.add(new StudentExamResult(12,"anu",maven101));

        results.add(new StudentExamResult(88,"saran",javaCertification));
        results.add(new StudentExamResult(87,"janani",apacheEssentials));

        return results;
    }

    static class StudentExamResult{
        int roundedPersentage;
        String name;
        Exam exam;

        public StudentExamResult(int roundedPersentage, String name, Exam exam) {
            this.roundedPersentage = roundedPersentage;
            this.name = name;
            this.exam = exam;
        }

        @Override
        public String toString() {
            return "StudentExamResult{" +
                    "roundedPersentage=" + roundedPersentage +
                    ", name='" + name + '\'' +
                    ", exam=" + exam +
                    '}';
        }
    }
    static class Exam {
        String name;

        public Exam(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "Exam{" +
                    "name='" + name + '\'' +
                    '}';
        }
    }
    /*
    * collectors toSet, toList
    * allMatch(), anyMatch(), noneMatch()
    * forEach()
    * */
}
