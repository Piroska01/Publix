package com.Publix.step_definition;

import com.Publix.pages.BakeryPage;
import com.Publix.pages.BasePage;
import com.Publix.pages.CupCakesPage;
import com.Publix.pages.LoginPage;
import com.Publix.utilities.BrowserUtil;
import com.Publix.utilities.ConfigurationReader;
import com.Publix.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;


public class PublixStepDefinition {

    LoginPage loginPage=new LoginPage();
    BakeryPage bakeryPage=new BakeryPage();



    @Given("user is on the home page")
    public void user_is_on_the_home_page() {
      Driver.getDriver().get(ConfigurationReader.getProperty("url"));
      BrowserUtil.waitForPageToLoad(20);
Driver.getDriver().navigate().refresh();
BrowserUtil.sleep(3);

    }
    @When("user clicks on login button on the upper right side of the page")
    public void user_clicks_on_login_button_on_the_upper_right_side_of_the_page() {

        bakeryPage.clickLoginTab();
    }
    @When("user  enters {string} and {string}")
    public void user_enters_and(String email, String password) {

        loginPage.passCredentials(email,password);
    }
    @When("user  logs in {string} and {string}")
    public void user_logs_in_and(String email, String password) {
        loginPage.login(email,password);
    }
    /*
    @When("user clicks on login button")
    public void user_clicks_on_login_button() {
        loginPage.loginButton.click();
    }

     */


    @When("user clicks on {string}  tab and click {string} module")
    public void user_clicks_on_tab_and_click_module(String tab, String module) {
     bakeryPage.navigateTabToModule(tab,module);
    }
    @Then("user should be able to login")
    public void user_should_be_able_to_login() {

        BrowserUtil.waitForVisibility(bakeryPage.accountButton,20);
        Assert.assertTrue(bakeryPage.accountButton.isDisplayed());
    }

    @Then("user should not be able to login")
    public void user_should_not_be_able_to_login() {


        Assert.assertTrue(loginPage.loginButton.isDisplayed());
    }

  /*



    @Given("user is on the home page and click on login button on the upper right side of the page")
    public void user_is_on_the_home_page_and_click_on_login_button_on_the_upper_right_side_of_the_page() {

        Driver.getDriver().get(ConfigurationReader.getProperty("url"));

        bakeryPage.loginTab.click();

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


     // bakeryPage.bakeryTab.click();
    }
    @Then("user should see cupcakes")
    public void user_should_see_cupcakes() {

    }

*/

}
