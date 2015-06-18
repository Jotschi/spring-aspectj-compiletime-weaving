package de.jotschi.test;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = { "de.jotschi" })
@EnableAspectJAutoProxy
public interface SpringTestConfiguration {

}
