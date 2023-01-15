package org.example.page;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.example.stepdfs.hooks.driver;
public class p07_homepage {
    public WebElement clickfacebook()
    {
        return driver.findElement(By.cssSelector("a[href=\"http://www.facebook.com/nopCommerce\"]"));
    }
    public WebElement clicktwitter()
    {
        return driver.findElement(By.cssSelector("a[href=\"https://twitter.com/nopCommerce\"]"));
    }
    public WebElement clickrss()
    {
        return driver.findElement(By.cssSelector("a[href=\"/news/rss/1\"]"));
    }
    public WebElement clickyoutube()
    {
      return driver.findElement(By.cssSelector("a[href=\"http://www.youtube.com/user/nopCommerce\"]"));
    }
}
