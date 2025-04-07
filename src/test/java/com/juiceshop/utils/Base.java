package com.juiceshop.utils;

import com.juiceshop.factory.*;
import org.openqa.selenium.WebDriver;

public class Base {
    protected static WebDriver driver;
    protected static int TIME_OUT = 10;
    protected static RegisterPage registerPage;
    protected static LoginPage loginPage;
    protected static AddressPage addressPage;
    protected static CardPage cardPage;
    protected static CestaPage cestaPage;
}
