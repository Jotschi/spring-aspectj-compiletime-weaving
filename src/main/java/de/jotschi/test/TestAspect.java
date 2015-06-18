package de.jotschi.test;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class TestAspect {

	@Before("call( * de.jotschi.test.UnmanagedClass.test(..) )")
	public void methodCalled(JoinPoint thisJoinPoint) {
		System.out.println("The UnmanagedClass.test method was called. The custom aspect worked: " + thisJoinPoint.getSignature().getName());
	}
	
	@Before("call( * de.jotschi.test.MessagerService.sayHello(..) )")
	public void methodCalled2(JoinPoint thisJoinPoint) {
		System.out.println("The MessagerService.sayHello method was called. The custom aspect worked: " + thisJoinPoint.getSignature().getName());
	}
}
