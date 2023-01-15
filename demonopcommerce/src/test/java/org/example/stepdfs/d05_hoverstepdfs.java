package org.example.stepdfs;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.page.p05_homepage;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import static org.example.stepdfs.hooks.driver;

public class d05_hoverstepdfs {
    p05_homepage hover =new p05_homepage();

    @When("user must hover on computer feild")
    public void  usermusthoveroncombuterfeild(){
        Actions hoverelement= new Actions(driver);
        hoverelement.moveToElement(hover.hoverstep()).perform();


    }

    @And("user must click desktops")
    public void userMustClickDesktops() {
        hover.desktops().get(0).click();
    }


    @Then("chick about get text {string}")
    public void chickAboutGetText(String arg0) {
        hover.gettext().getText().toLowerCase().contains(arg0);
    }
}
