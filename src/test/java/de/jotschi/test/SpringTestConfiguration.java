package de.jotschi.test;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.aspectj.EnableSpringConfigured;

@Configuration
@ComponentScan(basePackages = { "de.jotschi" })
@EnableAspectJAutoProxy
@EnableSpringConfigured
public interface SpringTestConfiguration {

}
