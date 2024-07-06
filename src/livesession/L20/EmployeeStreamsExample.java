package livesession.L20;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeStreamsExample {
    public static List<EmployeeExample> getEmployss(){
        List<EmployeeExample> emp = new ArrayList<>();
        emp.add(new EmployeeExample(101,"viswa",22));
        emp.add(new EmployeeExample(102,"saran",22));
        emp.add(new EmployeeExample(103,"janani",22));
        emp.add(new EmployeeExample(104,"jeswin",22));
        emp.add(new EmployeeExample(105,"razeen",22));
        emp.add(new EmployeeExample(106,"rahul",30));
        emp.add(new EmployeeExample(107,"anu",17));
        return emp;
    }
    public static void main(String[] args) {
        List<EmployeeExample> emp = getEmployss().stream().filter(obj -> {
            int age = obj.getAge();
            return age >= 18 && age <= 25;}).collect(Collectors.toList());
        emp.stream().forEach(obj -> System.out.print(obj+"\n"));

        System.out.println("name starts with R | r");
        emp = getEmployss().stream().filter(obj -> obj.getName().toLowerCase().startsWith("r")).collect(Collectors.toList());
        emp.stream().forEach(obj -> System.out.print(obj+"\n"));
    }
}
