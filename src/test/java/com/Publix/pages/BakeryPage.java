package com.Publix.pages;

import com.Publix.utilities.Driver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BakeryPage extends BasePage {

    public void clickLoginTab(){
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("document.querySelector('#userLogIn',':before').click();");
    }
    }


