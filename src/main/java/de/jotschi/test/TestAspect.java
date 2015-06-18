package de.jotschi.test;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class TestAspect {

	@Before("call( * de.jotschi.test.UnmanagedClass.*(..) )")
	public void methodCalled(JoinPoint thisJoinPoint) {
		System.out.println("Calling: " + thisJoinPoint.getSignature().getName());
	}
}
