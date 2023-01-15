package org.example.stepdfs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.page.p02_login;
import org.openqa.selenium.support.Color;
import org.testng.asserts.SoftAssert;

import static org.example.stepdfs.hooks.driver;

public class d02_loginstepdfs {
    p02_login login =new p02_login();

    @Given("user go to login page")
    public void usergotologinpage(){
        login.loginbutton().click();

    }

    @When("user entar {string} and {string}")
    public void userEntarAnd(String arg0, String arg1) {
        login.email().sendKeys(arg0);
        login.password().sendKeys(arg1);

    }

    @And("user press on login button")
    public void userPressOnLoginButton() {
        login.loginbtn().click();

    }

    @Then("user login to the system successfully")
    public void userLoginToTheSystemSuccessfully() {
        SoftAssert soft =new SoftAssert();
        String actualurl=driver.getCurrentUrl();
        String expectedurl="https://demo.nopcommerce.com/";
        soft.assertEquals(actualurl,expectedurl);
        boolean statuse= login.myaccount().isDisplayed();
        soft.assertTrue(statuse);
        soft.assertAll();

    }

    @Then("user could not login to the system")
    public void userCouldNotLoginToTheSystem() {
        SoftAssert soft =new SoftAssert();
        String actualmsg=login.errormsg().getText();
        String expectedmsg="Login was unsuccessful";
        soft.assertTrue(actualmsg.contains(expectedmsg));
        String actualcolorrgba =login.errormsg().getCssValue("color");
        String actualcolorhex= Color.fromString(actualcolorrgba).asHex();
        String expectedcolorhex="#e4434b";
        soft.assertEquals(actualcolorhex,expectedcolorhex);
        soft.assertAll();


    }
}
