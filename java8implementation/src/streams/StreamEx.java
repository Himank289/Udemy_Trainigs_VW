package streams;

import methodreferences.Employee;

import java.sql.SQLOutput;
import java.util.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.*;

import methodreferences.Employee;

public class StreamEx {

    public static void main(String[] args) {

        List<Employee> lst=new ArrayList<>();
     lst=   lst.stream().collect(Collectors.toList());
        Employee e=new Employee(1,"Himank",1);
        Employee e1=new Employee(2,"Shiva",2);
        Employee e2=new Employee(3,"Shubham",3);
        Employee e3=new Employee(4,"Rishabh",4);
     lst.add(e);
     lst.add(e1);
     lst.add(e2);
     lst.add(e3);
lst.forEach(System.out::println);

      Optional<Employee> emp1= lst.stream().filter((Employee emp)->emp.getDeptno()==5).findFirst();
      if(emp1.isEmpty()){
          System.out.println("employee not found");
          lst.add(new Employee(5,"Aahan",5));
      }
      else{
          emp1.get();
          System.out.println(emp1);
      }
          List<Employee>lst1=  lst.stream().sorted(Comparator.comparing(Employee::getName)).collect(Collectors.toList());
          lst1.forEach(System.out::println);

        System.out.println(lst.stream().count());
        System.out.println(lst);

       boolean b= lst.stream().anyMatch((Employee ematch)->ematch.getDeptno()==10);
        System.out.println(b);



    }
}
