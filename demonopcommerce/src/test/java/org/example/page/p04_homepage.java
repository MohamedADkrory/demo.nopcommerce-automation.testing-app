package org.example.page;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

import static org.example.stepdfs.hooks.driver;
public class p04_homepage {
   public WebElement searchfield()

    {
        return driver.findElement(By.id("small-searchterms"));
    }
    public WebElement searchbutton()
    {
        return driver.findElement(By.cssSelector("button[type=\"submit\"]"));
    }
    public List <WebElement>searchproduct()
    {
        return driver.findElements(By.cssSelector("h2[class=\"product-title\"]"));
    }
    public List <WebElement> picturesku()
    {
        return driver.findElements(By.cssSelector("div[class=\"picture\"]"));
    }
    public WebElement productsku()
    {
        return driver.findElement(By.cssSelector("div[class=\"sku\"]"));
    }
}
