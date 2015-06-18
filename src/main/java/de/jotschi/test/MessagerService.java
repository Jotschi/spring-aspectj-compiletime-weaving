package de.jotschi.test;

import org.springframework.stereotype.Component;

@Component
public class MessagerService {

	public void sayHello() {
		System.out.println("Hello!");
	}

}
