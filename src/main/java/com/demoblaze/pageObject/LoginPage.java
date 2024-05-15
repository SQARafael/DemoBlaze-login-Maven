package com.demoblaze.pageObject;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class LoginPage extends PageObject {
    private final By txtUserName= By.id("loginusername");
    private final By txtPassw= By.id("loginpassword");
    private final By bntLogin=By.xpath("//button[.='Log in']");

    public By getTxtPassw() {
        return txtPassw;
    }

    public By getBntLogin() {
        return bntLogin;
    }

    public By getTxtUserName() {
        return txtUserName;
    }
}
