package com.ust.LP6.c3_DESIGN_PATTERN.Decorator.a1;

public class CourseDataDemo {
    public static void main(String[] args) {
        CourseData courseData1 = CourseData.getInstance();
        courseData1.getCourseList().stream().forEach(obj -> System.out.println(obj));
        CourseData courseData2 = CourseData.getInstance();
        courseData2.getCourseList().stream().forEach(obj -> System.out.println(obj));
        System.out.println(courseData1.equals(courseData2));
    }
}
