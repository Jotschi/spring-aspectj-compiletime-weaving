package de.jotschi.test;

import static org.junit.Assert.assertNotNull;

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
		assertNotNull("The service within the app should not be null since it should be autowired.", service);
		UnmanagedClass t = new UnmanagedClass();
		t.test();
	}
}
