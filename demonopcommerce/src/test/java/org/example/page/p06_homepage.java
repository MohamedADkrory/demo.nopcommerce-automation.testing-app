package org.example.page;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

import static org.example.stepdfs.hooks.driver;
public class p06_homepage {
    public List<WebElement>sliderisclickable()
    {
        return driver.findElements(By.cssSelector("a[href=\"https://demo.nopcommerce.com/\"]"));
    }
}
