package com.udemy.spring.springbasics.googleTest;

import com.udemy.spring.springbasics.SpringBaseTestNGTest;
import com.udemy.spring.springbasics.kelvin.config.WebDriverFactory;
import com.udemy.spring.springbasics.page.google.GooglePage;
import com.udemy.spring.springbasics.kelvin.service.ScreenshotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

//Google1 Page Imp
public class Google1Test extends SpringBaseTestNGTest {

    @Autowired
    private GooglePage googlePage;

    @Lazy
    @Autowired
    private ScreenshotService screenShotUtil;

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
        this.screenShotUtil.takeScreenshot();
        this.googlePage.tearDown();
    }
}
