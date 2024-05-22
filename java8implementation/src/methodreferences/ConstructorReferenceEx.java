package methodreferences;

import java.util.function.Supplier;

import methodreferences.Employee;

public class ConstructorReferenceEx {
    public static void main(String[] args) {
        Supplier<ConstructorReferenceEx> s=ConstructorReferenceEx::new;
        System.out.println(s.get());

        Supplier<Employee> e=Employee::new;
        System.out.println(e.get());
        
    }


}
