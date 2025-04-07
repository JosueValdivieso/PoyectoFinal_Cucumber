package com.juiceshop.factory;

import com.juiceshop.utils.Base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage extends Base {
    public RegisterPage(WebDriver driver) {
        Base.driver = driver;
        PageFactory.initElements(driver, this);

    }
    @FindBy(id = "emailControl")
    protected WebElement inputEmail;

    @FindBy(id = "passwordControl")
    protected WebElement inputPass;

    @FindBy(id = "repeatPasswordControl")
    protected WebElement inputConfPass;

    @FindBy(id = "mat-select-0")
    protected WebElement listBox;

    @FindBy(id = "mat-option-0")
    protected WebElement listsOpcion;

    @FindBy(id = "securityAnswerControl")
    protected WebElement inputAnswer;

    @FindBy(id = "registerButton")
    protected WebElement bntRegister;


    public void fillOutformRegister(String email, String password, String answer) {
        inputEmail.sendKeys(email);
        inputPass.sendKeys(password);
        inputConfPass.sendKeys(password);
        listBox.click();
        listsOpcion.click();
        inputAnswer.sendKeys(answer);
        bntRegister.click();

    }
}
