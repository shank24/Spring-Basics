package com.udemy.spring.springbasics;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringBasicsApplicationTests {

	//@Autowired - is creating the object of the User class, with required
	// Param Constructor.
	@Autowired
	private User user;

	@Test
	void contextLoads() {
		user.printDetails();
	}

}

/**
 * 		Address address = new Address();
 * 		Salary salary = new Salary();
 * 		User user = new User(address,salary);
 * 		user.printDetails();
 */
