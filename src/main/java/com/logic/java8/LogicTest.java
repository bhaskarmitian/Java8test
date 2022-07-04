package com.logic.java8;

import com.util.Employee;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LogicTest {
    public static void main(String[] args) {
        EmployeeList employee = new EmployeeList();
        List<Employee> employeeList = employee.getEmployeeList();

        //List<String> list=employeeList.stream().filter(e -> e.getYearOfJoining() > 2015).map(Employee::getName).collect(Collectors.toList());
        Map<String,Optional<Employee>> map=employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.maxBy(Comparator.comparing(Employee::getSalary))));
        for(Map.Entry<String,Optional<Employee>> entry:map.entrySet()){
           // System.out.println(entry.getKey() +"====="+entry.getValue().get().getSalary());
        }

        List<Employee> sortByName=employeeList.stream().sorted((e1,e2)->e1.getName().compareTo(e2.getName())).collect(Collectors.toList());
       // sortByName.forEach((e)->System.out.println(e.getName()));

        employeeList.stream().sorted(Comparator.comparingInt(Employee::getAge)).collect(Collectors.toList()).forEach((e)->System.out.println(e.getAge()));

        //System.out.println(sortByName);

    }
}
