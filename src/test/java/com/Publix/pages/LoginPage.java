package com.Publix.pages;


import com.Publix.utilities.BrowserUtil;
import com.Publix.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage(){

        PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindBy(xpath ="//input[@id='signInName']")
    public WebElement emailAddress;

    @FindBy(xpath ="//input[@id='password']")
    public WebElement password;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement loginButton;

    public void passCredentials(String email,String pass){
        BrowserUtil.sleep(3);
        emailAddress.sendKeys(email);
        password.sendKeys(pass);
    }

    public void login(String email,String pass){
        BrowserUtil.sleep(3);
        emailAddress.sendKeys(email);
        password.sendKeys(pass);
        loginButton.click();
    }
}



