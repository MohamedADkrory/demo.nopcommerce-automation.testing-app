package org.example.stepdfs;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.page.p03_homepage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class d03_currenciesstepdfs {

    p03_homepage currenciess =new p03_homepage();


    @When("user select euro currencies")
    public void  userselecteurocurrencies()
    {
        Select select =new Select(currenciess.currenciesenter());
        select.selectByIndex(1);



    }

    @Then("currencies is changed correctly")
    public void currenciesIsChangedCorrectly() {
      for (int i=0; i < currenciess.productcurrency().size();i++) {
          Assert.assertTrue(currenciess.productcurrency().get(i).getText().contains("€"));
      }
    }
}
