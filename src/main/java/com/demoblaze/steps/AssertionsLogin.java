package com.demoblaze.steps;

import com.demoblaze.pageObject.HomePage;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class AssertionsLogin {

    @Page
    private HomePage homePage;

    @Step("Validate credentials")
    public void validateCredentials(){
        assertTrue(
               homePage.getDriver().findElement(homePage.getLnkWelcomeUser()).isDisplayed(),""
        );
    }
}
