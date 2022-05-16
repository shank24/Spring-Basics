package com.udemy.spring.springbasics;

import com.udemy.spring.springbasics.dependency_demo.Address;
import com.udemy.spring.springbasics.dependency_demo.Salary;
import com.udemy.spring.springbasics.dependency_demo.User;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringBasicsApplicationTests {

	@Test
	void contextLoads() {
	Address address = new Address();
	Salary salary = new Salary();

	User user = new User(address,salary);
	user.printDetails();
	}
}



