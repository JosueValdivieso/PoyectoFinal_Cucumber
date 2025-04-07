package com.juiceshop.utils;

import com.juiceshop.factory.*;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Hooks extends Base{
    @Before
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TIME_OUT));

        registerPage = new RegisterPage(driver);
        loginPage = new LoginPage(driver);
        addressPage = new AddressPage(driver);
        cardPage = new CardPage(driver);
        cestaPage = new CestaPage(driver);

    }

    @After
    public void teardown() {
        if (driver != null) {
           // driver.quit();
        }
    }
}
