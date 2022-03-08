package com.udemy.spring.springbasics;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class SpringBasicsApplicationTests {

	//@Autowired - is creating the object of the User class, with required
	// Param Constructor.
	@Autowired
	private User user;

	@Value("${PATH}")
	private String path;

	@Value("${fruits}")
	private List<String> fruits;

	@Test
	void contextLoads() {
		//System.out.println(this.fruits);
		System.out.println(this.fruits.size());

		//Enhanced For Loop
		for (String value : fruits){
			System.out.println(value);
		}

		//Java 8 Way
		fruits.forEach(System.out::println);
		fruits.stream().forEach(c -> System.out.println(c));
		//user.printDetails();
	}

}

/**
 * 		Address address = new Address();
 * 		Salary salary = new Salary();
 * 		User user = new User(address,salary);
 * 		user.printDetails();
 */
