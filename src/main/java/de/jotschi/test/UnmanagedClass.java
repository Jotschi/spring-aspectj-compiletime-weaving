package de.jotschi.test;

import static org.junit.Assert.assertNotNull;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;

@Configurable
public class UnmanagedClass {

	@Autowired
	private MessagerService service;

	public UnmanagedClass() {
		// TODO Auto-generated constructor stub
	}

	public void test() {
		System.out.println("test called");
		assertNotNull("The service within the " + getClass().getSimpleName()
				+ " class should not be null since the class was annotated with @Configurable and the field was autowired.", service);
		service.sayHello();
	}
}
