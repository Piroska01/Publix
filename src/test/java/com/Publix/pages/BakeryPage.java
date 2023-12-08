package com.Publix.pages;

import com.Publix.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BakeryPage {

    public BakeryPage(){

        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath ="//button[@title='Order ahead']")
    public WebElement orderAheadTab;

    @FindBy(xpath ="//a[normalize-space()='Bakery']")
    public WebElement bakeryTab;
}
