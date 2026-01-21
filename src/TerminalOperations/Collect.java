package TerminalOperations;

import java.util.*;
import java.util.stream.Collectors;


class Employee{

    String name;
    int age;
    String dept;


    Employee(String name,int age, String dept){
        this.name=name;
        this.age=age;
        this.dept=dept;
    }

    public String getDept(){
        return dept;
    }

}

public class Collect {

    public static void main(String[] args) {

        //Grouping By Demo

        List<Employee> employees=Arrays.asList(
                new Employee("Alice",10,"it"),
                new Employee("riitk",12,"it"),
                new Employee("bob",10,"hr"),
                new Employee("riitk",12,"hr"),
                new Employee("Alice",10,"it"),
                new Employee("riitk",12,"mkt")
        );


        //group employee by dept
        //collect will give us the map
        Map<String,List<Employee>> employees1=employees.stream()
                .collect(Collectors.groupingBy(Employee::getDept));


        System.out.println(employees1);



    }



}
