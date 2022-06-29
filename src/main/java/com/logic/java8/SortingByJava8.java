package com.logic.java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortingByJava8 {
    public static void main(String[] args) {
        List<Employee> empList = new ArrayList<>();
        empList.add(new Employee("Bhaskar", 30, 10000.5));
        empList.add(new Employee("Sri", 20, 10000.5));
        empList.add(new Employee("Aman", 10, 10000.5));

        System.out.println("*****Sort By Name********");
        List<Employee> empByName = empList.stream().sorted((e1, e2) -> e1.name.compareTo(e2.name)).collect(Collectors.toList());
        System.out.println(empByName);

        System.out.println("*****Sort By Age********");
        List<Employee> empByAge=empList.stream()
                .sorted(Comparator.comparingInt(e->e.getAge())).collect(Collectors.toList());
        System.out.println(empByAge);



    }

    static class Employee {
        private String name;
        private int age;
        private double salary;

        public Employee(String name, int age, double salary) {
            this.name = name;
            this.age = age;
            this.salary = salary;
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

        public double getSalary() {
            return salary;
        }

        public void setSalary(double salary) {
            this.salary = salary;
        }

        @Override
        public String toString() {
            return "Employee{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    ", salary=" + salary +
                    '}';
        }
    }
}
