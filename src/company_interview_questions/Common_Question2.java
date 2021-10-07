package company_interview_questions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * @author prateek.bangre on 08/10/21.
 * @Project Company_Interview_Question
 */
/*
question1: You have list of emp collection and now you have to sort it by age
question2: You have ArrayList of emp which you have to convert to map of key as name and value as emp object
question3: You have ArrayList of name(string) which you have to convert in map of key as name and value as count of key or name
*/
public class Common_Question2 {

    static class Employee{
        public String name;
        public int age;

        public Employee(String name, int age) {
            this.name = name;
            this.age = age;
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

        @Override
        public String toString() {
            return "Employee{name=" + name + ", age=" + age +'}';
        }
    }

    static class Compare implements Comparator<Employee> {

        @Override
        public int compare(Employee o1, Employee o2) {

            if (o1.getAge() == o2.getAge())
                return 0;
            else if (o1.getAge() < o2.getAge())
                return -1;
            return 1;
        }
    }

    public static void main(String[] args) {

        // Question1
        ArrayList<Employee> emplist = new ArrayList<>();
        emplist.add(new Employee("Prateek", 20));
        emplist.add(new Employee("Ram", 30));
        emplist.add(new Employee("Shyam", 10));
        emplist.add(new Employee("mohan", 15));
        emplist.sort(new Compare());
        emplist.forEach(emp -> System.out.println(emp.name+", "+emp.age));

        // Question2
        System.out.println("--------------------------------------------");
        Map<String, Employee> collect = emplist.stream().collect(Collectors.toMap(Employee::getName, emp -> emp));
        collect.forEach((key, value) -> System.out.println(key+", "+value));


        // Question3
        System.out.println("--------------------------------------------");
        ArrayList<String> list = new ArrayList<>();
        list.add("Prateek");
        list.add("Prateek");
        list.add("Rahul");
        list.add("Ram");
        list.add("Ramu");
        list.add("Abc");
        list.add("Prateek");
        list.add("Rahul");

        list.stream().collect(
                Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .forEach((key, value) -> {System.out.println(key + ", " + value);});
    }
}
