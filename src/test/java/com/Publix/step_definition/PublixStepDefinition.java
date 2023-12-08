package com.Publix.step_definition;

import com.Publix.pages.BasePage;
import com.Publix.pages.CupCakesPage;
import com.Publix.pages.DashBoardPage;
import com.Publix.pages.LoginPage;
import com.Publix.utilities.BrowserUtil;
import com.Publix.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class PublixStepDefinition {
    BasePage basePage = new BasePage();
    LoginPage loginPage = new LoginPage();



    DashBoardPage dashBoardPage = new DashBoardPage();

    CupCakesPage cupCakesPage = new CupCakesPage();
    @Given("user is on the home page and click on login button on the upper right side of the page")
    public void user_is_on_the_home_page_and_click_on_login_button_on_the_upper_right_side_of_the_page() {

       // basePage.userLogin();

        basePage.loginTab.click();
       // System.out.println(basePage.loginTab);


    }
    @When("user on the Login page and enters {string} and {string}")
    public void user_on_the_login_page_and_enters_and(String EmailAddress, String Password) {


        loginPage.emailAddress.sendKeys(EmailAddress);
        loginPage.password.sendKeys(Password);

    }
    @When("user clicks on login button")
    public void user_clicks_on_login_button() {
       // WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(1));

      //loginPage.LoginButton.click();

    }
    @When("user is on the home page and should see {string} navigation tab and clicks on it")
    public void user_is_on_the_home_page_and_should_see_navigation_tab_and_clicks_on_it(String string) {

    }
    @When("user clicks {string} tab")
    public void user_clicks_tab(String string) {

    }
    @Then("user should see cupcakes")
    public void user_should_see_cupcakes() {

    }
}
