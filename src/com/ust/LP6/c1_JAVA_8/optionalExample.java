package com.ust.LP6.c1_JAVA_8;

class Employee{
    String name;

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
public class optionalExample {

    public static void main(String[] args) {

        Employee e1 = GetEmployeeOfTheMonth();
        if(e1 != null) System.out.println(e1.);
        Employee e2 = GetEmployeeOfTheMonthNull();
    }

    private static Employee GetEmployeeOfTheMonthNull() {
        return null;
    }

    private static Employee GetEmployeeOfTheMonth() {
        return new Employee("viswa");
    }
}
