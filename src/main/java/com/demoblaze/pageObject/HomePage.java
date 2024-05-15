package com.demoblaze.pageObject;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class HomePage extends PageObject {
    private  final By lnkLogin= By.id("login2");
    private  final By lnkWelcomeUser= By.id("nameofuser");

    public By getLnkWelcomeUser() {
        return lnkWelcomeUser;
    }

    public By getLnkLogin() {
        return lnkLogin;
    }
}
