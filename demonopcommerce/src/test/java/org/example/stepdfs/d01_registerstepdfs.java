package org.example.stepdfs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.page.p01_register;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;

public class d01_registerstepdfs {
    p01_register register =new p01_register();
    @Given("user go to register page")
    public void register()

    {
      register.registerlink().click();
    }

    @When("user select gender type")
    public void userSelectGenderType() {
        register.gender().click();

    }

    @And("user enter {string} & {string}")
    public void userEnter(String arg0, String arg1) {
        register.firstname().sendKeys(arg0);
        register.lastname().sendKeys(arg1);

    }

    @And("user enter date of birth")
    public void userSelectDayMonthYear() {
        Select select =new Select(register.daylist());
        select.selectByValue("25");
        Select selectmonth = new Select(register.monthlist());
        selectmonth.selectByValue("10");
        Select selectyear = new Select(register.yearlist());
        selectyear.selectByValue("1996");
    }

    @And("user enter {string}")
    public void userEnter(String arg0) {
        register.email().sendKeys(arg0);
    }

    @And("user enter Company name {string}")
    public void userEnterCompanyName(String arg0) {
        register.companyname().sendKeys(arg0);
    }

    @And("user click newsletter")
    public void userClickNewsletter() {
        register.newsletter().click();
    }

    @And("user enter password feilds {string} {string}")
    public void userEnterPasswordFeilds(String arg0, String arg1) {
        register.password().sendKeys(arg0);
        register.confirmpassword().sendKeys(arg1);

    }

    @And("user click on register button")
    public void userClickOnRegisterButton() {
        register.regesterbutton().click();
    }

    @Then("success message is displayed")
    public void successMessageIsDisplayed() {
        SoftAssert soft =new SoftAssert();
      String actualemsg= register.successmessage().getText();
      String expectedmsg="Your registration completed";
       soft.assertTrue(actualemsg.contains(expectedmsg));
       String actualecolorrgba=register.successmessage().getCssValue("color");
       String actualcolohex= Color.fromString(actualecolorrgba).asHex();
       String expectedcolohex= "#4cb17c";
        soft.assertAll();






    }

}
