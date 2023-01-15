package org.example.page;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

import static org.example.stepdfs.hooks.driver;
public class p08_homepage {
    public WebElement addtowish()
    {
        return driver.findElement(By.cssSelector("div[class=\"item-box\"] div[data-productid=\"18\"] div[class=\"details\"] div[class=\"add-info\"] div[class=\"buttons\"] button[class=\"button-2 add-to-wishlist-button\"]"));
    }
    public WebElement successmsg()
    {
        return driver.findElement(By.cssSelector("p[class=\"content\"]"));
    }
    public WebElement background()
    {
     return driver.findElement(By.cssSelector("div[class=\"bar-notification success\"]"));
    }
    public List<WebElement>successmessag()
    {
        return driver.findElements(By.id("bar-notification"));
    }
    public WebElement wishlistbutton()
    {
        return driver.findElement(By.cssSelector("a[href=\"/wishlist\"] span[class=\"wishlist-label\"]"));
    }
    public List<WebElement> qty()
    {
        return driver.findElements(By.cssSelector("td[class=\"quantity\"] input"));
    }

}
