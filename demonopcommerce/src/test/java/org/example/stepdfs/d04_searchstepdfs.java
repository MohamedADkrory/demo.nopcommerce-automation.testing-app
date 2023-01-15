package org.example.stepdfs;

import io.cucumber.java.bs.A;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.page.p04_homepage;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import static org.example.stepdfs.hooks.driver;

public class d04_searchstepdfs {
    p04_homepage search =new p04_homepage();


    @When("user click on search field")
    public void userclickonsearchfield()
    {
        search.searchfield().click();
    }


    @And("user must enter {string}")
    public void userMustEnter(String arg0) {
        search.searchfield().sendKeys(arg0);
        search.searchbutton().click();


    }

    @Then("user could find {string} relative results")
    public void userCouldFindRelativeResults(String arg0) {
        SoftAssert soft =new SoftAssert();
        String actualurl=driver.getCurrentUrl();
        String expectedurl="https://demo.nopcommerce.com/search?q=";
        soft.assertTrue(actualurl.contains(expectedurl));
        soft.assertAll();

        for (int i=0;i<search.searchproduct().size();i++){
            Assert.assertTrue(search.searchproduct().get(i).getText().toLowerCase().contains(arg0));
        }
    }
    @And("user could enter {string}")
    public void userCouldEnter(String arg0) {
        search.searchfield().sendKeys(arg0);
        search.searchbutton().click();
        search.picturesku().get(0).click();
    }

    @Then("user could find {string} insid product details page")
    public void userCouldFindInsidProductDetailsPage(String arg0) {
        int count=search.picturesku().size();
        Assert.assertEquals(count,1);
        Assert.assertTrue(search.productsku().getText().contains(arg0));
    }


}
