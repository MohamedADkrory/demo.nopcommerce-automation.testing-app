package org.example.stepdfs;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.page.p06_homepage;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.jar.Attributes;

import static org.example.stepdfs.hooks.driver;
public class d06_homeslidersstepdfs {
    p06_homepage explicitwait;
    WebDriverWait explicit;
    @When("first slider is clickable")
    public void firstsliderisclickable()
    {
        explicitwait =new p06_homepage();
         explicit =new WebDriverWait(driver, Duration.ofSeconds(10));
      explicit.until(ExpectedConditions.attributeContains(explicitwait.sliderisclickable().get(0), "style","display: block;"));
    }

    @And("click on first slider")
    public void clickOnFirstSlider() {
        explicitwait.sliderisclickable().get(0).click();
    }

    @Then("user go direct to another url nokia")
    public void userGoDirectToAnotherUrl() {
        String actualurlnokia=driver.getCurrentUrl();
        String expectedurlnokia="//demo.nopcommerce.com/nokia-lumia-1020";
        Assert.assertEquals(actualurlnokia,expectedurlnokia);
    }

    @When("second slider is clickable")
    public void secondSliderIsClickable() {
        explicitwait =new p06_homepage();
        explicit =new WebDriverWait(driver, Duration.ofSeconds(10));
        explicit.until(ExpectedConditions.attributeContains(explicitwait.sliderisclickable().get(1),"style","display: block;" ));

    }

    @And("click on second slider")
    public void clickOnSecondSlider() {
        explicitwait.sliderisclickable().get(1).click();
    }

    @Then("user go direct to another url iphone")
    public void userGoDirectToAnotherUrlIphone() {
        String actualurliphone =driver.getCurrentUrl();
        String expectedurliphone="//demo.nopcommerce.com/iphone-6";
        Assert.assertEquals(actualurliphone,expectedurliphone);
    }
}
