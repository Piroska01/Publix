package com.Publix.pages;

import com.Publix.utilities.ConfigurationReader;
import com.Publix.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
    public BasePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//a[@id='userLogIn']")
    public WebElement loginTab;

    public void userLogin(){

        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }
}
