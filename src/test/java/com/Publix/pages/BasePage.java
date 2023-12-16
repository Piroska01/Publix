package com.Publix.pages;

import com.Publix.utilities.ConfigurationReader;
import com.Publix.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {
    public BasePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[@id='userLogIn']")
    public WebElement loginTab;

    @FindBy(xpath = "//button[contains(.,'Account')]")
    public WebElement accountButton;


    public void navigateTabToModule(String tab, String module) {
        String tabLocator = "(//button[contains(.,'" + tab + "')])[1]";
        String moduleLocator = "//a[contains(.,'" + module + "')]";
        WebElement tabElement = Driver.getDriver().findElement(By.xpath(tabLocator));
        WebElement moduleElement = Driver.getDriver().findElement(By.xpath(moduleLocator));


        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(tabElement).pause(2000).click(moduleElement).perform();


    }


}
