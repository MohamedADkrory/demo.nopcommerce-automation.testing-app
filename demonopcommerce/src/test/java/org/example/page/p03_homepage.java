package org.example.page;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

import static org.example.stepdfs.hooks.driver;

public class p03_homepage {
    public WebElement currenciesenter()
    {
        return   driver.findElement(By.name("customerCurrency"));

    }
    public List <WebElement> productcurrency()
    {
        return driver.findElements(By.cssSelector("span[class=\"price actual-price\"]"));
    }
}
