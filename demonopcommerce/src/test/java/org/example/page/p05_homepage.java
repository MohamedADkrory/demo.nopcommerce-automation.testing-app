package org.example.page;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

import static org.example.stepdfs.hooks.driver;
public class p05_homepage {
    public WebElement hoverstep()
    {
      return driver.findElement(By.cssSelector("ul[class=\"top-menu notmobile\"] a[href=\"/computers\"]"));
    }

    public List<WebElement>desktops()
    {
        return driver.findElements(By.cssSelector("ul[class=\"top-menu notmobile\"] a[href=\"/computers\"]+div[class=\"sublist-toggle\"]+ul[class=\"sublist first-level\"] a[href]"));

    }
    public WebElement gettext()
    {
        return driver.findElement(By.cssSelector("div[class=\"page-title\"]"));
    }
}
