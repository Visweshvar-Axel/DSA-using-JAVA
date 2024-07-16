package com.ust.LP6.c1_JAVA_8;

class Employee{
    String name;
}
public class optionalExample {

    public static void main(String[] args) {

        Employee e = GetEmployeeOfTheMonth();
        Employee e = GetEmployeeOfTheMonthNull();
    }

    private static Employee GetEmployeeOfTheMonthNull() {

    }

    private static Employee GetEmployeeOfTheMonth() {
        return null;
    }
}
