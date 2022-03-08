package com.udemy.spring.springbasics;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringBasicsApplicationTests {

	//@Autowired - is creating the object of the User class, with required
	// Param Constructor.
	@Autowired
	private User user;

	@Value("${PATH}")
	private String path;

	@Value("${fruits}")
	private String fruits;

	@Test
	void contextLoads() {
		System.out.println(this.fruits);
		//user.printDetails();
	}

}

/**
 * 		Address address = new Address();
 * 		Salary salary = new Salary();
 * 		User user = new User(address,salary);
 * 		user.printDetails();
 */
