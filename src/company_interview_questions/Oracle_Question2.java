package company_interview_questions;

import java.util.ArrayList;
import java.util.stream.Collectors;

/**
 * @author prateek.bangre on 07/09/21.
 * @Project TestProject
 */
//filter bye age and then collect all the name and then print it all using stream API
public class Oracle_Question2 {

    static class Employee{
        String name;
        int age;
        Employee(String name, int age){
            this.name = name;
            this.age = age;
        }
    }

    public static void main(String[] args) {
        ArrayList<Employee> empList = new ArrayList<>();

        empList.add(new Employee("A",30));
        empList.add(new Employee("B",10));
        empList.add(new Employee("C",20));
        empList.add(new Employee("D",25));
        empList.add(new Employee("E",28));

        empList.stream().filter(emp -> emp.age>20).map(emp -> emp.name).collect(Collectors.toList())
                .forEach(System.out::println);
    }
}
