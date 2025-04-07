package com.juiceshop.factory;

import com.juiceshop.utils.Base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CestaPage extends Base {

    public CestaPage(WebDriver driver) {
        Base.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "/html/body/app-root/mat-sidenav-container/mat-sidenav-content/app-search-result/div/div/div[2]/mat-grid-list/div/mat-grid-tile[1]/div/mat-card/div/div[2]/button")
    protected WebElement appleProduct;

    @FindBy(xpath = "/html/body/app-root/mat-sidenav-container/mat-sidenav-content/app-search-result/div/div/div[2]/mat-grid-list/div/mat-grid-tile[3]/div/mat-card/div/div[2]/button")
    protected WebElement bananaProduct;

    @FindBy(xpath = "/html/body/app-root/mat-sidenav-container/mat-sidenav-content/app-search-result/div/div/div[2]/mat-grid-list/div/mat-grid-tile[4]/div/mat-card/div/div[3]/button")
    protected WebElement salesmanProduct;

    public void selectProductsBascket(){
        appleProduct.click();
        bananaProduct.click();
        salesmanProduct.click();
    }

}
