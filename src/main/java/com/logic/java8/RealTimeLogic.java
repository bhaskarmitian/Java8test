package com.logic.java8;

import com.util.Employee;

import java.util.*;
import java.util.stream.Collectors;
//https://javaconceptoftheday.com/solving-real-time-queries-using-java-8-features-employee-management-system/
public class RealTimeLogic {
    public static void main(String[] args) {
        EmployeeList employee=new EmployeeList();
        List<Employee> employeeList  =employee.getEmployeeList();
        System.out.println(employeeList);

        Map<String, Long> noOfMaleAndFemaleEmployees=
                employeeList.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));

        System.out.println("No of Male and Female:  "+noOfMaleAndFemaleEmployees);

        employeeList.stream()
                .map(Employee::getName)
                .distinct()
                .forEach(System.out::println);

        Map<String, Double> avgAgeOfMaleAndFemaleEmployees=
                employeeList.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingInt(Employee::getAge)));

        System.out.println("avgAgeOfMaleAndFemaleEmployees  "+avgAgeOfMaleAndFemaleEmployees);

        Optional<Employee> highestPaidEmployeeWrapper=
                employeeList.stream().collect(Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary)));

        Employee highestPaidEmployee = highestPaidEmployeeWrapper.get();
        System.out.println("Details Of Highest Paid Employee : ");
        System.out.println("==================================");
        System.out.println("ID : "+highestPaidEmployee.getId());
        System.out.println("Name : "+highestPaidEmployee.getName());
        System.out.println("Age : "+highestPaidEmployee.getAge());
        System.out.println("Gender : "+highestPaidEmployee.getGender());
        System.out.println("Department : "+highestPaidEmployee.getDepartment());
        System.out.println("Year Of Joining : "+highestPaidEmployee.getYearOfJoining());
        System.out.println("Salary : "+highestPaidEmployee.getSalary());
        System.out.println("======================================");
        employeeList.stream()
                .filter(e -> e.getYearOfJoining() > 2015)
                .map(Employee::getName)
                .forEach(System.out::println);
        System.out.println("======================================");
        Map<String, Long> employeeCountByDepartment=
                employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));

        Set<Map.Entry<String, Long>> entrySet = employeeCountByDepartment.entrySet();

        for (Map.Entry<String, Long> entry : entrySet)
        {
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }
        System.out.println("======================================");
    }
}
