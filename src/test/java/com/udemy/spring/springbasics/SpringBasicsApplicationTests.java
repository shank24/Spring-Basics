package com.udemy.spring.springbasics;

import com.github.javafaker.Faker;
import com.udemy.spring.springbasics.dependency_demo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class SpringBasicsApplicationTests {

	
	@Autowired
	private User user;

	@Autowired
	private Faker faker;

	/*@Value("${TEST_URL:www.example.com}")
	private String url;

	@Value("${fruits}")
	private List<String> fruit;

	@Value("${PATH}")
	private String path;
*/
	@Test
	void contextLoads() {

		user.printDetails();
		System.out.println(faker.name().firstName());

	}


	/*
		System.out.println(this.fruit);
		System.out.println(this.url);
		*/

	/*
	Address address = new Address();
	Salary salary = new Salary();
	User user = new User(address,salary);
	user.printDetails();
	 */
}



