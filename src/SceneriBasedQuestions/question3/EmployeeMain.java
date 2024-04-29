package SceneriBasedQuestions.question3;

import java.util.*;
import java.util.stream.Collectors;

public class EmployeeMain {
    //Scenario: Employee Management System
    //
    //You are tasked with developing an Employee Management System for a company.
    // The system needs to handle basic employee information such as name, age, department, and salary. Additionally,
    // it should provide functionality for:
    //
    //Finding the average age of employees in each department.
    //Identifying the department with the highest average salary.
    //Sorting employees within each department by salary in descending order.
    //Question:
    //
    //Given a collection of Employee objects representing employees in the company, design a Java program to accomplish the following tasks:
    //
    //Calculate and print the average age of employees in each department.
    //Determine and print the department with the highest average salary.
    //Sort employees within each department by salary in descending order and print the sorted list for each department.

    //


    public static void main(String[] args) {

        List<Employee> employeeList= Arrays.asList(new Employee("John", 30, "HR", 50000),
                new Employee("Alice", 35, "IT", 60000),
                new Employee("Bob", 40, "Finance", 70000),
                new Employee("Emily", 25, "HR", 45000),
                new Employee("David", 28, "IT", 55000),
                new Employee("Sophia", 32, "Finance", 75000) );

//1
        Map<String, Double> collect = employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.averagingInt(Employee::getAge)));



          collect.entrySet().forEach(System.out::println);
          
          //2

        OptionalInt max = employeeList.stream().mapToInt(Employee::getAge).sorted().max();

          // employeeList.stream().filter()


        Map<String, List<Employee>> sortedEmployeesByDepartment = employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment,
                        Collectors.collectingAndThen(
                                Collectors.toList(),
                                employees -> employees.stream()
                                        .sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
                                        .collect(Collectors.toList())
                        )
                ));

        sortedEmployeesByDepartment.entrySet().forEach(System.out::println);


    }
}
