package com.ust.LP3.c2.runningTaskParallel.a1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Employee {
    private String name;
    private int age;
    private String department;
    public Employee(String name, int age, String department) {
        this.name = name;
        this.age = age;
        this.department = department;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getDepartment() {
        return department;
    }
    public void setDepartment(String department) {
        this.department = department;
    }
    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", department='" + department + '\'' +
                '}';
    }
}
class EmployeeRunnable implements Runnable {
    private Employee employee;

    public EmployeeRunnable(Employee employee) {
        this.employee = employee;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+" : "+employee);
    }
}
public class EmployeeThreadTester {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Employee> employees = new ArrayList<>();

        System.out.println("Enter the number of employee:");
    }
}
