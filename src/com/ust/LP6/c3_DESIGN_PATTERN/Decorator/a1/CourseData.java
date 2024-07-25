package com.ust.LP6.c3_DESIGN_PATTERN.Decorator.a1;

import java.util.ArrayList;
import java.util.List;

final class CourseData implements Cloneable {
    private static final List<Course> courseList = new ArrayList<>();
    private static volatile CourseData instance;

    static {
        courseList.add(new Course(101, "BTech", 450000.00, 48));
        courseList.add(new Course(202, "MTech", 405000.00, 24));
        courseList.add(new Course(303, "BCA", 425000.00, 48));
        courseList.add(new Course(404, "MCA", 450000.00, 24));
    }

    private CourseData() {
    }

    public static CourseData getInstance() {
        if (instance == null) {
            synchronized (CourseData.class) {
                if (instance == null) {
                    instance = new CourseData();
                }
            }
        }
        return instance;
    }

    public List<Course> getCourseList() {
        return new ArrayList<>(courseList);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException("Cloning is not allowed");
    }

    private Object readResolve() {
        return instance;
    }
}