package org.example.stepdfs;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.page.p08_homepage;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

import static org.example.stepdfs.hooks.driver;
public class d08_wishliststepdfs {
    p08_homepage homepage =new p08_homepage();
    @When("click on add wishlist button")
    public void clickonwishlistbutton()
    {
        homepage.addtowish().click();
    }

    @Then("verify from add the product success")
    public void verifyFromAddTheProductSuccess()
    {
        String actualmsg=homepage.successmsg().getText();
        String expectedmsg="The product has been added to your wishlist";
        Assert.assertTrue(actualmsg.contains(expectedmsg));
        String actualcolorrgba =homepage.background().getCssValue("background-color");
        String actualcolorhex= Color.fromString(actualcolorrgba).asHex();
        String expectedcolorhex="#4bb07a";
        Assert.assertEquals(actualcolorhex,expectedcolorhex);

    }

    @And("wait until disappear success message")
    public void waitUntilDisappearSuccessMessage() {

        WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.invisibilityOf(homepage.successmsg()));
    }

    @And("click on wishlist button")
    public void clickOnWishlistButton() {
        homepage.wishlistbutton().click();
    }

    @Then("verify Qty value it's bigger than zero")
    public void verifyQtyValueItSBiggerThan() {
        int rows = homepage.qty().size();
       String gemy= homepage.qty().get(0).getAttribute("value");
        int i=Integer.parseInt(gemy);
        Assert.assertTrue(i>0);

    }
}
