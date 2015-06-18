package de.jotschi.test;

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
		service.sayHello();
	}
}
