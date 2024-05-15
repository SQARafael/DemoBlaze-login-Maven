package com.demoblaze.steps;

import com.demoblaze.pageObject.LoginPage;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;

public class LoginSteps {
    @Page
    private LoginPage loginPage;

    @Step("Send Info fill username")
    public void sendUserName(String username){
        loginPage.getDriver().findElement(loginPage.getTxtUserName()).sendKeys(username);

    }

    @Step("Send Info fill password")
    public void sendPassword(String password){
        loginPage.getDriver().findElement(loginPage.getTxtPassw()).sendKeys(password);

    }

    @Step("Click on btn login")
    public void clickLogin(){
        loginPage.getDriver().findElement(loginPage.getBntLogin()).click();
    }


}
