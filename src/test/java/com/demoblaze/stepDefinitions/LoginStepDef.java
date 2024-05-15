package com.demoblaze.stepDefinitions;

import com.demoblaze.steps.AssertionsLogin;
import com.demoblaze.steps.HomeSteps;
import com.demoblaze.steps.LoginSteps;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import net.thucydides.core.annotations.Steps;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginStepDef {
    WebDriver driver;

    @Steps
    private HomeSteps homeSteps;

    @Steps
    private LoginSteps loginSteps;
    @Steps
    private AssertionsLogin assertionsLogin;

    @BeforeAll
    static void setupClass() {
        WebDriverManager.chromedriver().clearDriverCache().setup();
    }

    @BeforeEach
    void setupTest() {

        driver = new ChromeDriver();
    }
    @AfterEach
    void teardown() {

        driver.quit();
    }
    @Given("user open url")
    public void userOpenUrl() {
        homeSteps.openUrl();

    }
    @When("user inser the credentials user {string} and password {string}")
    public void userInserTheCredentialsUserAndPassword(String username, String password) {
        homeSteps.clickLogin();
        loginSteps.sendUserName(username);
        loginSteps.sendPassword(password);
        loginSteps.clickLogin();

    }
    @Then("user can see a welcome message")
    public void userCanSeeAWelcomeMessage() {
        assertionsLogin.validateCredentials();

    }

}
