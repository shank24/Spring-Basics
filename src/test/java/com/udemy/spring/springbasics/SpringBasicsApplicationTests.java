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

	@Value("${timeout}")
	private int timeout;

	@Value("${TEST_URL:https://www.google.com}")
	private String url;
	@Test
	void contextLoads() {
		//System.out.println(this.fruits);
		System.out.println(this.url);
		System.out.println(this.fruits.size());
		System.out.println(this.timeout);

		//Enhanced For Loop
		enhancedWay();

		//Java 8 Way
		forEachWay();
		streamWay();
		//user.printDetails();
	}

	private void streamWay() {
		fruits.stream().forEach(c -> System.out.println(c));
	}

	private void forEachWay() {
		fruits.forEach(System.out::println);
	}

	private void enhancedWay() {
		for (String value : fruits){
			System.out.println(value);
		}
	}

}

/**
 * 		Address address = new Address();
 * 		Salary salary = new Salary();
 * 		User user = new User(address,salary);
 * 		user.printDetails();
 */
