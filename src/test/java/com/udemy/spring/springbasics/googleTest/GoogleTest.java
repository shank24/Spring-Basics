package com.udemy.spring.springbasics.googleTest;

import com.udemy.spring.springbasics.SpringBaseTestNGTest;
import com.udemy.spring.springbasics.page.google.GooglePage;
import com.udemy.spring.springbasics.util.ScreenShotUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

//Google Page Imp
public class GoogleTest extends SpringBaseTestNGTest {

    @Autowired
    private GooglePage googlePage;

    //@Lazy
    @Autowired
    private ScreenShotUtil screenShotUtil;

    @Test
    public void googleTest() throws IOException {

        //Asserting On Google Page
        this.googlePage.goTo();
        Assert.assertTrue(this.googlePage.isAt());

        //Asserting On SearchResult Page
        this.googlePage.getSearchComponent().search("hello");
        Assert.assertTrue(this.googlePage.getSearchResult().isAt());

        //Asserting On Search Count
        Assert.assertTrue(this.googlePage.getSearchResult().getCount() > 2);

        //Taking Screenshot
        this.screenShotUtil.takeScreenshot("img.jpg");
        this.googlePage.tearDown();
    }
}
