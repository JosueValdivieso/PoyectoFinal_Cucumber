package com.juiceshop.factory;

import com.juiceshop.utils.Base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddressPage extends Base {

    public AddressPage(WebDriver driver) {
        Base.driver = driver;
        PageFactory.initElements(driver, this);

    }

    @FindBy(id = "mat-input-1")
    protected WebElement inputCountry;

    @FindBy(id = "mat-input-2")
    protected WebElement inputName;

    @FindBy(id="mat-input-3")
    protected WebElement InputMobile;

    @FindBy(id = "mat-input-4")
    protected WebElement inputZip;

    @FindBy(id = "address")
    protected WebElement inputAddress;

    @FindBy(id = "mat-input-6")
    protected WebElement inputCity;

    @FindBy(id = "mat-input-7")
    protected WebElement inputState;

    @FindBy(id = "submitButton")
    protected WebElement btnSubmit;

    public void fillOutformAddress(String country, String name, String mobile, String zip, String address, String city, String state) {
        inputCountry.sendKeys(country);
        inputName.sendKeys(name);
        InputMobile.sendKeys(mobile);
        inputZip.sendKeys(zip);
        inputAddress.sendKeys(address);
        inputCity.sendKeys(city);
        inputState.sendKeys(state);
        btnSubmit.submit();

    }



}
