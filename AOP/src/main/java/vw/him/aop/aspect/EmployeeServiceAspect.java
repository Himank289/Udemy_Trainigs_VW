package vw.him.aop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class EmployeeServiceAspect {

	@Before( "execution(* vw.him.aop.service.EmployeeService.*(..))")
	public void beforeAdvice(JoinPoint joinPoint) {
		System.out.println("Before method:" + joinPoint.getSignature().getName());

//		System.out.println("Creating Employee with name - " + name + " and id - " + empId);
	}

	@After( "execution(* vw.him.aop.service.EmployeeService.*(..))")
	public void afterAdvice(JoinPoint joinPoint) {
		System.out.println("After method:" + joinPoint.getSignature().getName());

//		System.out.println("Successfully created Employee with name - " + name + " and id - " + empId);
	}
	
	@Around( "execution(* vw.him.aop.service.EmployeeService.*(..))")
	public void aroundCall(JoinPoint joinPoint) {
		long startTime=System.currentTimeMillis();
		System.out.println("After around method:" + joinPoint.getSignature().getName());
		long endtime=System.currentTimeMillis()-startTime;
		System.out.println(endtime);

//		System.out.println("Successfully created Employee with name - " + name + " and id - " + empId);
	}
}