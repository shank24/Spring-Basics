package com.udemy.spring.springbasics.googleTest;

import com.udemy.spring.springbasics.SpringBaseTestNGTest;
import com.udemy.spring.springbasics.config.WebDriverFactory;
import com.udemy.spring.springbasics.page.google.GooglePage;
import com.udemy.spring.springbasics.util.ScreenShotUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

//Google1 Page Imp
@Component
public class Google1Test extends SpringBaseTestNGTest {

    @Autowired
    private GooglePage googlePage;

    @Lazy
    @Autowired
    private ScreenShotUtil screenShotUtil;

    @Autowired
    private WebDriverFactory driverFactory;


    @Test
    public void googleTest() throws IOException {

        //Asserting On Google Page
        //this.driverFactory.getWebDriver("chrome");
        this.googlePage.goTo();
        Assert.assertTrue(this.googlePage.isAt());

        //Asserting On SearchResult Page
        this.googlePage.getSearchComponent().search("spring boot ");
        Assert.assertTrue(this.googlePage.getSearchResult().isAt());

        //Asserting On Search Count
        Assert.assertTrue(this.googlePage.getSearchResult().getCount() > 2);

        //Taking Screenshot
        //this.screenShotUtil.takeScreenshot("img.jpg");
        this.googlePage.tearDown();
    }
}
