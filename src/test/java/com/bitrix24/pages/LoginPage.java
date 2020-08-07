package com.bitrix24.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{
    @FindBy(name = "USER_LOGIN")
    public WebElement username;

    @FindBy(name = "USER_PASSWORD")
    public WebElement password;

<<<<<<< HEAD
    @FindBy(className = "login-btn")
    public WebElement loginButton;


=======
    @FindBy(className ="login-btn")
    public WebElement loginButton;
>>>>>>> 0e6be1d0c2fce461b0c624b8b2fdad461d3a3105

    @FindBy(className = "errortext")
    public WebElement errorMessage;


}