package org.example.stepdfs;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.page.p07_homepage;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.ArrayList;

import static org.example.stepdfs.hooks.driver;
public class d07_followusstepdfs {
    p07_homepage homepage =new p07_homepage();


    @When("user opens facebook link")
    public void useropenfacebooklink() throws InterruptedException {
      homepage.clickfacebook().click();
        Thread.sleep(2000);
        ArrayList<String> tabs=new ArrayList<>(driver.getWindowHandles());

        driver.switchTo().window(tabs.get(1));
    }

    @Then("open in new facebook tab")
    public void openInNewFacebookTab() {
        String actualurlfacebook=driver.getCurrentUrl();
        String expectedurlfacebook="https://www.facebook.com/nopCommerce";
        Assert.assertEquals(actualurlfacebook,expectedurlfacebook);
        driver.close();
    }


    @When("user opens twitter link")
    public void userOpensTwitterLink() throws InterruptedException {
        homepage.clicktwitter().click();
        ArrayList<String>tabs=new ArrayList<>(driver.getWindowHandles());
        Thread.sleep(2000);
        driver.switchTo().window(tabs.get(1));

    }

    @Then("open in new twitter tab")
    public void openInNewTwitterTab() {
        String actualurltwitter=driver.getCurrentUrl();
        String expectedurltwitter="https://twitter.com/nopCommerce";
        Assert.assertEquals(actualurltwitter,expectedurltwitter);
        driver.close();
    }

    @When("user opens rss link")
    public void userOpensRssLink() throws InterruptedException {
        homepage.clickrss().click();
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.numberOfWindowsToBe(2));
        ArrayList<String> tabs=new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));

    }

    @Then("open in new rss tab")
    public void openInNewRssTab() {
        String actualurlrss=driver.getCurrentUrl();
        String expectedurlrss="https://demo.nopcommerce.com/new-online-store-is-open";
        Assert.assertEquals(actualurlrss,expectedurlrss);
        driver.close();
    }

    @When("user opens youtube link")
    public void userOpensYoutubeLink() throws InterruptedException {
        homepage.clickyoutube().click();
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.numberOfWindowsToBe(2));
        ArrayList<String> tabs =new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
    }

    @Then("open in new youtube tab")
    public void openInNewYoutubeTab() {
        String actualurlyoutube=driver.getCurrentUrl();
        String expectedurlyoutube="https://www.youtube.com/user/nopCommerce";
        Assert.assertEquals(actualurlyoutube,expectedurlyoutube);

    }
}
