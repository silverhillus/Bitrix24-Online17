package com.bitrix24.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class StreamPage extends BasePage {

    @FindBy(className = "pagetitle")
    public WebElement activityStream;

}
