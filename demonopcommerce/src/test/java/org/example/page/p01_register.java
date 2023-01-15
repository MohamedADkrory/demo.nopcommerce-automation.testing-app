package org.example.page;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.example.stepdfs.hooks.driver;

public class p01_register {
    public WebElement registerlink()
    {
        return driver.findElement(By.cssSelector("a[href=\"/register?returnUrl=%2F\"]"));
    }

    public WebElement gender()
    {
        return driver.findElement(By.id("gender-male"));
    }
    public WebElement firstname()
    {
        return driver.findElement(By.id("FirstName"));
    }
    public WebElement lastname()
    {
        return driver.findElement(By.id("LastName"));
    }

    public WebElement daylist()
    {
        return driver.findElement(By.name("DateOfBirthDay"));
    }
    public WebElement monthlist()
    {
        return driver.findElement(By.name("DateOfBirthMonth"));
    }
    public WebElement yearlist()
    {
        return driver.findElement(By.name("DateOfBirthYear"));
    }
    public WebElement email()
    {
        return driver.findElement(By.id("Email"));
    }
    public WebElement companyname()
    {
        return driver.findElement(By.id("Company"));
    }
    public WebElement newsletter()
    {
        return driver.findElement(By.id("Newsletter"));
    }
    public WebElement password()
    {
        return driver.findElement(By.id("Password"));
    }
    public WebElement confirmpassword()
    {
        return driver.findElement(By.id("ConfirmPassword"));
    }
    public WebElement regesterbutton()
    {
        return driver.findElement(By.id("register-button"));
    }
    public WebElement successmessage()
    {
        return driver.findElement(By.cssSelector("div[class=\"result\"]"));
    }

}
