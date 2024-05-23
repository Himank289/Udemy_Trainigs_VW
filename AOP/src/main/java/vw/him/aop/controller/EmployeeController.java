package vw.him.aop.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import vw.him.aop.model.Employee;
import vw.him.aop.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	@RequestMapping(value = "/employee/{name}/{empId}", method = RequestMethod.GET)
	public Employee addEmployee(@PathVariable String name, @PathVariable int empId) {

		return employeeService.createEmployee(name, empId);

	}

	@RequestMapping(value = "/employee/{empId}", method = RequestMethod.GET)
	public String removeEmployee( @PathVariable int empId) {

		employeeService.deleteEmployee(empId);

		return "Employee removed";
	}

}