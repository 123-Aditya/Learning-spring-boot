package com.learn.learnspringframework.helloworld;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

//Eliminate verbosity in creating Java Beans
//Public accessor methods, constructor,
//equals, hashcode and toString are automatically created
//Released in JDK 16.

record Person (String name, int age, Address address) {};

record Address (String firstLine, String city) {};


@Configuration
public class HelloWorldConfiguration {
	
	@Bean
	public String name() {
		return "Sherlock Holmes";
	}
	
	@Bean
	public int age() {
		return 25;
	}
	
	@Bean
	public Person person() {
		return new Person("Dr. Watson", 28, new Address("Main Street", "New York"));
	}
	
	@Bean
	public Person person2MethodCall() {
		return new Person(name(), age(), address()); //name, age, address
	}
	
	@Bean
	@Primary
	public Person person3Parameters(String name, int age, Address address3) {//name, age, address2
		return new Person(name, age, address3);
	}
	
	@Bean
	public Person person5Qualifier(String name, int age, @Qualifier("address3qualifier") Address address3) {//name, age, address2
		return new Person(name, age, address3);
	}
	
	@Bean(name = "address2")
	@Primary
	public Address address() {
		return new Address("Baker Street", "London");
	}
	
	@Bean(name = "address3")
	@Qualifier("address3qualifier")
	public Address address3() {
		return new Address("Motinagar", "Hyderabad");
	}
}
