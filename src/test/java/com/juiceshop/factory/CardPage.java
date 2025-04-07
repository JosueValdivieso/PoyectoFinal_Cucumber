package com.juiceshop.factory;

import com.juiceshop.utils.Base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CardPage extends Base {

    public CardPage(WebDriver driver) {
        Base.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "mat-expansion-panel-header-0")
    protected WebElement optionAddNewCard;

    @FindBy(id = "mat-input-1")
    protected WebElement inputName;

    @FindBy(id = "mat-input-2")
    protected WebElement inputCard;

    @FindBy(id = "mat-input-3")
    protected WebElement lsExpirymonth;

    @FindBy(className = "ng-star-inserted")
    protected WebElement selectMonth;

    @FindBy(id = "mat-input-4")
    protected WebElement lsExpiryyear;

    @FindBy(className = "ng-star-inserted")
    protected WebElement selectExpiryyear;

    @FindBy(id = "submitButton")
    protected WebElement btnSubmit;

    @FindBy(xpath= "//*[@id=\"mat-mdc-dialog-0\"]/div/div/app-welcome-banner/div[2]/button[2]")
    protected WebElement btnDismiss;

    public void fillOutformCard(String nombre, String numero){
        btnDismiss.click();
        optionAddNewCard.click();
        inputName.sendKeys(nombre);
        inputCard.sendKeys(numero);
        lsExpirymonth.click();
        selectMonth.click();
        lsExpiryyear.click();
        selectExpiryyear.click();

    }
}

