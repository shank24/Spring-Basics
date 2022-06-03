package com.udemy.spring.springbasics.scope;

import com.udemy.spring.springbasics.SpringBaseTestNGTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.testng.annotations.Test;

public class JuniorSeniorTest extends SpringBaseTestNGTest {

    @Autowired
    private JuniorEng juniorEng;

    @Autowired
    private SeniorEng seniorEng;

    @Test
    public void scopeTest(){
        juniorEng.setAmount(100);
        System.out.println("Junior :: " + this.juniorEng.getSalary().getAmount());

        seniorEng.setAmount(500);
        System.out.println("Senior :: " + this.seniorEng.getSalary().getAmount());

        System.out.println("Junior :: " + this.juniorEng.getSalary().getAmount());

    }
}
