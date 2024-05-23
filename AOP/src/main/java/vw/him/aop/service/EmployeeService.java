package vw.him.aop.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import vw.him.aop.model.Employee;



@Service
public class EmployeeService {

	public Employee createEmployee(String name, int empId) {

		Employee emp = new Employee();
		emp.setName(name);
		emp.setEmpId(empId);
		return emp;
	}

	public void deleteEmployee(int empId) {
		
	}
}
