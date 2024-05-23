package vw.him.aop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import vw.him.aop.model.Employee;
import vw.him.aop.service.EmployeeService;

@SpringBootApplication
public class AopApplication {

	@Autowired
	EmployeeService employeeService;
	
	public static void main(String[] args) {
		
 SpringApplication.run(AopApplication.class, args);
	
	}

}
