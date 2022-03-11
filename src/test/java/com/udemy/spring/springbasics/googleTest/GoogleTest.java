package com.udemy.spring.springbasics.googleTest;

import com.udemy.spring.springbasics.SpringBaseTestNGTest;
import com.udemy.spring.springbasics.page.google.GooglePage;
import org.springframework.beans.factory.annotation.Autowired;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GoogleTest extends SpringBaseTestNGTest {

    @Autowired
    private GooglePage googlePage;

    @Test
    public void googleTest(){
        this.googlePage.goTo();
        Assert.assertTrue(this.googlePage.isAt());

        this.googlePage.getSearchComponent().search("hello");
        Assert.assertTrue(this.googlePage.getSearchResult().isAt());
        Assert.assertTrue(this.googlePage.getSearchResult().getCount() > 2);

        this.googlePage.tearDown();
    }
}
