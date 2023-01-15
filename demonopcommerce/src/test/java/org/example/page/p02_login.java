package org.example.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.example.stepdfs.hooks.driver;

public class p02_login {
    public WebElement loginbutton()
    {
        return driver.findElement(By.cssSelector("a[href=\"/login?returnUrl=%2F\"]"));
    }

    public WebElement loginbtn()
    {
        return driver.findElement(By.className("login-button"));
    }
    public WebElement email()
    {
        return driver.findElement(By.id("Email"));
    }
    public WebElement password()
    {
        return driver.findElement(By.id("Password"));
    }
    public WebElement login()
    {
        return driver.findElement(By.className("login-button"));
    }
    public WebElement myaccount()
    {
        return driver.findElement(By.className("ico-account"));
    }
    public WebElement errormsg()
    {
        return driver.findElement(By.className("validation-summary-errors"));
    }

}
