package com.juiceshop.factory;

import com.juiceshop.utils.Base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends Base {
    public LoginPage(WebDriver driver) {
        Base.driver = driver;
        PageFactory.initElements(driver, this);

    }

    @FindBy(id = "email")
    protected WebElement inputEmail;

    @FindBy(id = "password")
    protected WebElement inputPass;

    @FindBy(id = "loginButton")
    protected WebElement btnLogin;

    public void fillOutformLogin(String email, String password) {
        inputEmail.sendKeys(email);
        inputPass.sendKeys(password);
        btnLogin.click();

    }


}
