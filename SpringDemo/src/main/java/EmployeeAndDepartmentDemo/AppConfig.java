package EmployeeAndDepartmentDemo;

import org.springframework.context.annotation.Bean;

public class AppConfig {
    @Bean("Viswa")
    public Employee getEmployee1(){
        return new Employee(1001,"Viswa");
//        return new Employee(1001,"Viswa",getDepartment());
    }

    @Bean("Anu")
    public Employee getEmployee2(){
        return new Employee(1002,"Anu");
    }

    @Bean
    private Department getDepartment() {
        return new Department(111,"Developer",1);
    }
}
