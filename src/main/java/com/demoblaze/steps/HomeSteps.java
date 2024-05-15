package com.demoblaze.steps;

import com.demoblaze.pageObject.HomePage;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;

public class HomeSteps {
    @Page
    private HomePage homePage;

    @Step("Open Browser")
    public void openUrl(){
        homePage.openUrl("https://www.demoblaze.com/index.html");
    }

    @Step("Click on link login")
    public void clickLogin(){
        homePage.getDriver().findElement(homePage.getLnkLogin()).click();
    }
}
