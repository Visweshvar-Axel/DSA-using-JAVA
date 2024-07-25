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

    public Integer getCourseId() {
        return courseId;
    }

    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public Double getCourseFee() {
        return courseFee;
    }

    public void setCourseFee(Double courseFee) {
        this.courseFee = courseFee;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }
}
