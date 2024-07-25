package com.ust.LP6.c3_DESIGN_PATTERN.Decorator.a1;

public class Course {
    private Integer courseId;
    private String courseName;
    private Double courseFee;
    private Integer duration;

    public Course(Integer courseId, String courseName, Double courseFee, Integer duration) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.courseFee = courseFee;
        this.duration = duration;
    }


}
