package com.bitrix24.pages;


import com.bitrix24.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class BasePage {
    //explicit wait
    //will be used inside every page class
    //since this variable is protected
    //it will not be visible in test classes
    protected static WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 20);



    public BasePage() {
        //we put this line to be able to use @FindBy, @FindBys.. annotations
        PageFactory.initElements(Driver.getDriver(), this);
    }



}
