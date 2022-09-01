package com.revmo.steps;

import com.revmo.pages.ResetPasswordPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

import static com.revmo.testrunner.TestRunner.driver;
import static com.revmo.testrunner.TestRunner.url;

public class LoginSteps {
    public ResetPasswordPage resetPasswordPage;
    public WebDriverWait wdw = new WebDriverWait(driver, Duration.ofSeconds(3));

    @Given("I am at the reset password page")
    public void iAmAtTheResetPasswordPage() throws InterruptedException {
        driver.get(url + "/resetpassword.html");
        resetPasswordPage = new ResetPasswordPage(driver);

    }


    @When("I type in a email {string}")
    public void iTypeInAValidEmail(String email) throws InterruptedException {
        resetPasswordPage.typeEmail(email);

    }

    @And("I type new password {string}")
    public void iTypeNewPassword(String password) throws InterruptedException {
        resetPasswordPage.typePassword(password);

    }

    @And("I type confirm password {string}")
    public void iTypeConfirmPassword(String password) throws InterruptedException {
        resetPasswordPage.typePassword(password);

    }

    @And("I click on the reset password button in reset password page")
    public void iClickOnTheResetPasswordButtonInResetPasswordPage() throws InterruptedException {
    resetPasswordPage.clickLogin();
    }


    @Then("Then I should be redirected to login page")
    public void thenIShouldBeRedirectedToLoginPage() throws InterruptedException {
        
    }
}
