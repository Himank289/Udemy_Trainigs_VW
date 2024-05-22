package terminaloperations;

import methodreferences.Employee;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

public class JoiningEx {
    public static void main(String[] args) {
        List<Employee> lst=new ArrayList<>();
        lst=   lst.stream().collect(Collectors.toList());
        Employee e=new Employee(1,"Himank",1);
        Employee e1=new Employee(2,"Shiva",2);
        Employee e2=new Employee(3,"Shubham",3);
        Employee e3=new Employee(4,"Rishabh",2);
        lst.add(e);
        lst.add(e1);
        lst.add(e2);
        lst.add(e3);

      String joined_names=  lst.stream().map((Employee emp)->emp.getName()).collect(joining());
        System.out.println(joined_names);

        Long count=  lst.stream().map((Employee emp)->emp.getName()).collect(counting());
        System.out.println(count);

       Optional<Employee>eop=  lst.stream().collect(minBy(Comparator.comparing(Employee::getDeptno)));
       if(eop.isPresent()){
           System.out.println(eop.get());
       }

        Map<Integer,List<Employee>> mp=lst.stream().collect(groupingBy(Employee::getDeptno));
        System.out.println(mp);
    }
}
