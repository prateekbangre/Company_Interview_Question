package company_interview_questions;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author prateek.bangre on 08/10/21.
 * @Project TestProject
 */
/*
Q1. You have a list of employee with id, aga, name, doj, salary. Get the employee whom
salary is greater than 50000 and return in name of list in reverse order
Q2. Reflection api in Java(https://www.geeksforgeeks.org/reflection-in-java/)
Q3.What NullPointerException and when you get that(https://rollbar.com/blog/how-to-catch-and-fix-nullpointerexception-in-java/)
Q4. what is Spring Bean Scopes?
Q5. when u get multi bean definition exception and who you will handle it.
Q6. How you will handle Exception in junit
Q7. spring boot advantages and disadvantages
Q8. how to create starter lib in spring boot
Q9. Dirty Reads vs Phantom Reads in DataBase(https://docs.microsoft.com/en-us/sql/odbc/reference/develop-app/transaction-isolation-levels?view=sql-server-ver15)
Q10. binary search and what is time complexity
Q11. Load balancer and which you have used explain it how it work
Q12. what is Scalability and how do you achieve it microservice architecture
Q13. vertical and horizontal scaling(https://www.section.io/blog/scaling-horizontally-vs-vertically/)
Q14. what is Thread Pools and why we used it and advantage
Q15. why we use partition in kafka
Q16. retry in spring boot(https://howtodoinjava.com/spring-boot2/spring-retry-module/)
Q17.

*/
public class Epam_Question1 {

    public static void main(String[] args) {
        //emp ->

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
