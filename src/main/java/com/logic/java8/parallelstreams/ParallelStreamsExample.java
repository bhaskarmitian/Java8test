package com.logic.java8.parallelstreams;

import com.logic.java8.EmployeeList;
import com.util.Employee;

import java.util.List;
import java.util.stream.Collectors;

public class ParallelStreamsExample {

    public List<Employee> stringTransform(List<Employee> namesList){
        return namesList
                //.stream()
                .parallelStream()
                //.map(this::addNameLengthTransform)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        EmployeeList employeeList=new EmployeeList();
        List<Employee> namesList = employeeList.getEmployeeList();
        ParallelStreamsExample parallelStreamsExample = new ParallelStreamsExample();
        long start = System.currentTimeMillis();
        List<Employee> resultList = parallelStreamsExample.stringTransform(namesList);
        System.out.println(resultList);
        long end = System.currentTimeMillis();
        System.out.println("Elapsed Time in milli seconds: "+ (end-start));

    }

    /*private  String  addNameLengthTransform(String name) {
        //delay(500);

        return name.length()+" - "+name ;
    }*/
}
