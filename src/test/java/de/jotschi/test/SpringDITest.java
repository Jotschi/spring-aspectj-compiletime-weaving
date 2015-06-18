package de.jotschi.test;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import de.jotschi.test.App;

@ContextConfiguration(classes = { SpringTestConfiguration.class })
@RunWith(SpringJUnit4ClassRunner.class)
public class SpringDITest {

	@Autowired
	App app;

	@Test
	public void testDI() {
		assertNotNull(app);
		app.run();
		assertNotNull(app.getMessager());
	}
}
