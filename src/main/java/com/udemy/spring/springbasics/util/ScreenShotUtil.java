package com.udemy.spring.springbasics.util;

import com.github.javafaker.Faker;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;
import org.springframework.util.FileCopyUtils;
import javax.annotation.PostConstruct;
import java.io.File;
import java.io.IOException;
import java.nio.file.Path;

//This will create the Bean, only if it is invoked or needed.
@Lazy
@Component
public class ScreenShotUtil {

    @Autowired
    private TakesScreenshot driver;

    @Value("${screenshot.path}")
    private Path path;

    @Autowired
    private Faker faker;


    @PostConstruct
    private void init(){
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Sleeping.......");
        }
    }

    public void takeScreenshot() throws IOException {
        File sourceFile = this.driver.getScreenshotAs(OutputType.FILE);
        FileCopyUtils.copy(sourceFile, this.path.resolve(faker.name().firstName() + ".png").toFile());
    }
}
