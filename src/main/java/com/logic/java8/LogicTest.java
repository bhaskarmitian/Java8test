package com.logic.java8;

import com.util.Employee;

import java.util.*;
import java.util.stream.Collectors;

public class LogicTest {
    public static void main(String[] args) {
        EmployeeList employee = new EmployeeList();
        List<Employee> employeeList = employee.getEmployeeList();


        Map<String,Double> map =employeeList.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.averagingInt(Employee::getAge)));
        System.out.println(map);

        Iterator it=map.entrySet().iterator();

        while(it.hasNext()){
            Map.Entry avearageAge= (Map.Entry) it.next();
            //System.out.println(avearageAge.getKey()+"----"+avearageAge.getValue());
        }


        Iterator<Employee> emp=employeeList.iterator();
        while (emp.hasNext()){
            Employee e= emp.next();
            //System.out.println(e);
        }


        Optional<Employee> heightSalary=employeeList.stream().collect(Collectors.maxBy(Comparator.comparing(Employee::getSalary)));

        //System.out.println(heightSalary.get().getSalary() +"----- "+heightSalary.get().getName());

        Map<String,Optional<Employee>> deptByMaxSalary=employeeList.stream().
                collect(Collectors.groupingBy(Employee::getDepartment,Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary))));



    }
}
