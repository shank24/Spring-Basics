package com.udemy.spring.springbasics;

import com.udemy.spring.springbasics.dependency_demo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringBasicsApplicationTests {

	
	@Autowired
	User user;
	
	@Value("${PATH}")
	private String path;

	@Test
	void contextLoads() {
		System.out.println(this.path);

		//user.printDetails();
	}



	/*
	Address address = new Address();
	Salary salary = new Salary();
	User user = new User(address,salary);
	user.printDetails();
	 */
}



