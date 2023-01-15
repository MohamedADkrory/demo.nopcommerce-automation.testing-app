package org.example.stepdfs;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import java.time.Duration;

public class hooks {
    public static WebDriver driver;
    @Before
    public void openbrowser()
    {

        //1-define bridge between java code and browser
        System.setProperty("webdrivere.chrome.driver","C:\\Program Files\\chromdriver.exe");

        //2-initialize the new opject
        driver = new ChromeDriver();
        //3- driver configuration

        //3.1-maximize window
        driver.manage().window().maximize();

        //3.2-set implicit wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        //4-navigate to the website
        driver.navigate().to("https://demo.nopcommerce.com/");
    }
    @After
    public void quitbrowser() throws InterruptedException {
        Thread.sleep(5000);
        driver.quit();
    }
}


