package methodreferences;

import java.util.List;
import java.util.Objects;

public class Employee {
    private int id;
    private String name;
    private int deptno ;
    private List<Employee> emp;

    public Employee() {
        System.out.println("This is an employee constructor");
    }

    public Employee(int id, String name, int deptno) {
        this.id = id;
        this.name = name;
        this.deptno = deptno;
    }

    public int getId() {
        return id;
    }

    public List<Employee> getEmp() {
        return emp;
    }

    public void setEmp(List<Employee> emp) {
        this.emp = emp;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", deptno=" + deptno +
                '}';
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;
        Employee employee = (Employee) o;
        return getId() == employee.getId() && getDeptno() == employee.getDeptno() && Objects.equals(getName(), employee.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), getDeptno());
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDeptno() {
        return deptno;
    }

    public void setDeptno(int deptno) {
        this.deptno = deptno;
    }

    public static void main(String[] args) {
        Employee e=new Employee(1,"Himank",1);
        Employee e1=new Employee(2,"Shiva",2);
        Employee e2=new Employee(3,"Shubham",3);
        Employee e3=new Employee(4,"Rishabh",4);
        System.out.println(e+" "+e1+" "+e2+" "+e3);
    }
}
