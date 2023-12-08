package com.Publix.step_definition;

import com.Publix.pages.BakeryPage;
import com.Publix.pages.BasePage;
import com.Publix.pages.CupCakesPage;
import com.Publix.pages.LoginPage;
import com.Publix.utilities.ConfigurationReader;
import com.Publix.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.Select;


public class PublixStepDefinition {
    BasePage basePage = new BasePage();
    LoginPage loginPage = new LoginPage();
    BakeryPage bakeryPage = new BakeryPage();

    CupCakesPage cupCakesPage = new CupCakesPage();
    @Given("user is on the home page and click on login button on the upper right side of the page")
    public void user_is_on_the_home_page_and_click_on_login_button_on_the_upper_right_side_of_the_page() {

        Driver.getDriver().get(ConfigurationReader.getProperty("url"));

        basePage.loginTab.click();

    }
    @When("user on the Login page and enters {string} and {string}")
    public void user_on_the_login_page_and_enters_and(String EmailAddress, String Password) {

        loginPage.emailAddress.sendKeys(EmailAddress);
        loginPage.password.sendKeys(Password);

    }
    @When("user clicks on login button")
    public void user_clicks_on_login_button() {

        loginPage.LoginButton.click();

    }

    @And("user is on the home page and clicks on order ahead navigation tab")
    public void userIsOnTheHomePageAndClicksOnOrderAheadNavigationTab() {

        bakeryPage.orderAheadTab.click();

        //Select select =new Select(bakeryPage.orderAheadTab.click();


                //  Actions action = new Actions(Driver.getDriver());
                // action.moveToElement(bakeryPage.OrderAheadTab).perform();
                //  Assert.assertTrue(bakeryPage.OrderAheadTab.isDisplayed());

    }

    @And("user clicks bakery tab")
    public void userClicksBakeryTab() {


      bakeryPage.bakeryTab.click();
    }
    @Then("user should see cupcakes")
    public void user_should_see_cupcakes() {

    }



}
