package com.udemy.spring.springbasics;

import com.udemy.spring.springbasics.bean.lifecycle.Television;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringBasicsApplicationTests {

	@Autowired
	private Television tv;

	@Test
	void contextLoads() {

		this.tv.playMovie();

		/*user.printDetails();
		System.out.println(faker.name().firstName());*/

	}


	// Objects

	/*
	@Autowired
	private User user;

	@Autowired
	private Faker faker;

	@Value("${TEST_URL:www.example.com}")
	private String url;

	@Value("${fruits}")
	private List<String> fruit;

	@Value("${PATH}")
	private String path;
	*/



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



