package de.jotschi.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class App {

	@Autowired
	private MessagerService service;

	public MessagerService getMessager() {
		return service;
	}

	public void run() {
		UnmanagedClass t = new UnmanagedClass();
		t.test();
	}
}
