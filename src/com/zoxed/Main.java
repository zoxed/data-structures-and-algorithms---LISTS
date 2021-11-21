package com.zoxed;

import java.lang.annotation.ElementType;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Employee> employeeList = new ArrayList<>();

        employeeList.add(new Employee("mohamed","kaabi", 6464));
        employeeList.add(new Employee("rachid","kaabi", 6884));
        employeeList.add(new Employee("hamid","kaabi", 8575));
        employeeList.add(new Employee("bouchra","kaabi", 5872));

        employeeList.forEach(employee -> System.out.println(employee));
        System.out.println("----------------");


        System.out.println("----------------");
        System.out.println(employeeList.isEmpty());
       // System.out.println("----------------");
       // employeeList.set(1, new Employee("ahmed","Zakiedine", 6457));
        System.out.println("----------------");
        //employeeList.forEach(employee -> System.out.println(employee));
        System.out.println("----------------");
        System.out.println(employeeList.size());
        System.out.println("----------------");
        employeeList.add(4,new Employee("nada","moubachir",64684));
        //employeeList.forEach(employee -> System.out.println(employee));
        Employee[] employeeArray = employeeList.toArray(new Employee[employeeList.size()]);
        for (Employee employee: employeeArray){
            System.out.println(employee);
        }
        System.out.println(employeeList.contains(new Employee("rachid","kaabi",6884)));
        System.out.println(employeeList.indexOf(new Employee("mohamed","kaabi",6464)));
        employeeList.remove(2 );
        System.out.println(employeeList.get(3));
        employeeList.forEach(employee -> System.out.println(employee));
    }
}
