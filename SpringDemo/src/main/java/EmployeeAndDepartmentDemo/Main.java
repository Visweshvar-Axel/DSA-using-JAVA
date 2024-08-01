package EmployeeAndDepartmentDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Employee employee1 = context.getBean("Viswa",Employee.class);
        System.out.println(employee1);
        Employee employee2 = context.getBean("Anu",Employee.class);
        System.out.println(employee2);
    }
}
