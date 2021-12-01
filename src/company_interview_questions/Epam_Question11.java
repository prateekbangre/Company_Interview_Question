package company_interview_questions;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author prateek.bangre on 08/10/21.
 * @Project TestProject
 */

public class Epam_Question11 {

    public static void main(String[] args) {
        //emp -> id, aga, name, doj, salary

        List<Employee> empList = new ArrayList<>();
        empList.add(new Employee(20000, "A2"));
        empList.add(new Employee(90000, "A9"));
        empList.add(new Employee(70000, "A7"));
        empList.add(new Employee(10000, "A1"));

        empList.stream().filter(emp -> emp.getSalary() > 50000)
                .map(Employee::getName)
                .collect(Collectors.toList())
                .sort(Comparator.reverseOrder());
    }

    static class  Employee{
        int salary;
        String name;

        public Employee(int salary, String name) {
            this.salary = salary;
            this.name = name;
        }

        public int getSalary() {
            return salary;
        }

        public void setSalary(int salary) {
            this.salary = salary;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

}
